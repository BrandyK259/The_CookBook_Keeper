package com.example.the_cookbook_keeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class recipe_form extends AppCompatActivity  {

    LinearLayout layoutIngr;
    Button ingrAdd;

    LinearLayout layoutStep;
    Button stepAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_form);

        layoutIngr = findViewById(R.id.layout_ingredient);
        ingrAdd = findViewById(R.id.add_ingredient_btn);

        ingrAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addIngrView();
            }

            public void addIngrView() {

                final View ingredientView = getLayoutInflater().inflate(R.layout.add_ingredient, null, false);

                EditText ingrText = (EditText) ingredientView.findViewById(R.id.ingredient_field);
                Button ingrClose = (Button) ingredientView.findViewById(R.id.ingr_cancel_button);

                ingrClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        removeIngrView(ingredientView);
                    }
                });

                layoutIngr.addView(ingredientView);

            }

            private void removeIngrView(View view) {

                layoutIngr.removeView(view);
            }

        });

        layoutStep = findViewById(R.id.layout_step);
        stepAdd = findViewById(R.id.add_step_btn);

        stepAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addStepView();
            }

            private void addStepView(){

                final View stepView = getLayoutInflater().inflate(R.layout.add_step, null, false);

                EditText stepText = (EditText) stepView.findViewById(R.id.step_field);
                Button stepClose = (Button) stepView.findViewById(R.id.step_cancel_button);

                stepClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        removeStepView(stepView);
                    }
                });

                layoutStep.addView(stepView);

            }

            private void removeStepView(View view){

                layoutStep.removeView(view);
            }

        });


    }


    public void gotoMainMenu (View view){
        Intent intent = new Intent(this, main_menu.class);
        startActivity(intent);
    }
}