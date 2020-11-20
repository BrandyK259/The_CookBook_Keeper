package com.example.the_cookbook_keeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class launch_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_menu);
    }

    public void gotoRecipeForm (View view){
        Intent recipeForm = new Intent(this, recipe_form.class);
        startActivity(recipeForm);
    }

    public void gotoSearch (View view){
        Intent searchFail = new Intent(this, search_fail.class);
        startActivity(searchFail);
    }
}