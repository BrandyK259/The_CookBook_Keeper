package com.example.the_cookbook_keeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void gotoRecipeForm (View view){
        Intent recipeForm = new Intent(this, recipe_form.class);
        startActivity(recipeForm);
    }

    public void gotoSearch (View view){

        boolean recipeSaved = false;
        Intent i = getIntent();

        if (i != null) {
            recipeSaved = getIntent().getExtras().getBoolean("recipeSaved");
        }

        if (recipeSaved){
            Intent searchPass = new Intent(this, search_pass.class);
            startActivity(searchPass);
        }
        else{
            Intent searchFail = new Intent(this, search_fail.class);
            startActivity(searchFail);
        }
    }
}