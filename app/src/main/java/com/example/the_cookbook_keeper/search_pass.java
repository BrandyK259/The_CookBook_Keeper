package com.example.the_cookbook_keeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class search_pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_pass);
    }

    public void gotoRecipeCard (View view){
        Intent recipeCard = new Intent(this, recipe_card.class);
        startActivity(recipeCard);
    }

    public void gotoMainMenu (View view){
        Intent intent = new Intent(this, main_menu.class);
        intent.putExtra("recipeSaved", true);
        startActivity(intent);
    }
}