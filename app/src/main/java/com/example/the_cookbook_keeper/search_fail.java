package com.example.the_cookbook_keeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class search_fail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_fail);
    }

    public void gotoMainMenu (View view) {
        Intent intent = new Intent(this, main_menu.class);
        startActivity(intent);
    }

    public void gotoRecipeForm (View view) {
        Intent intent = new Intent(this, recipe_form.class);
        startActivity(intent);
    }
}