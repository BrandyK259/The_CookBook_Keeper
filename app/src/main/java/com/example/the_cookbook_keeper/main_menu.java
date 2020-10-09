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
        Intent intent = new Intent(this, recipe_form.class);
        startActivity(intent);
    }

    public void gotoSearchFail (View view){
        Intent intent = new Intent(this, search_fail.class);
        startActivity(intent);
    }
}