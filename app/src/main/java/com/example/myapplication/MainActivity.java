package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView arms,ears,eyebrows,eyes,glasses,hat,mouth,mustache,nose,shoes;
    CheckBox box_arms,box_ears,box_eyebrows,box_eyes,box_glasses,box_hat,box_mouth,box_mustache,box_nose,box_shoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms=findViewById(R.id.arms);
        ears=findViewById(R.id.ears);
        eyebrows=findViewById(R.id.eyebrows);
        eyes=findViewById(R.id.eyes);
        glasses=findViewById(R.id.glasses);
        hat=findViewById(R.id.hat);
        mouth=findViewById(R.id.mouth);
        mustache=findViewById(R.id.mustache);
        nose=findViewById(R.id.nose);
        shoes=findViewById(R.id.shoes);

        box_arms=findViewById(R.id.box_arms);
        box_ears=findViewById(R.id.box_ears);
        box_eyebrows=findViewById(R.id.box_eyebrows);
        box_eyes=findViewById(R.id.box_eyes);
        box_glasses=findViewById(R.id.box_glasses);
        box_hat=findViewById(R.id.box_hat);
        box_mouth=findViewById(R.id.box_mouth);
        box_mustache=findViewById(R.id.box_mustache);
        box_nose=findViewById(R.id.box_nose);
        box_shoes=findViewById(R.id.box_shoes);
    }

    public void onClick_box_arms(View view){
        if(box_arms.isChecked()){
            arms.setVisibility(View.VISIBLE);
        }
        else arms.setVisibility(View.INVISIBLE);
    }
    public void onClick_box_ears(View view){
        if(box_ears.isChecked()){
            ears.setVisibility(View.VISIBLE);
        }
        else ears.setVisibility(View.INVISIBLE);
    }
    public void onClick_box_eyebrows(View view){
        if(box_eyebrows.isChecked()){
            eyebrows.setVisibility(View.VISIBLE);
        }
        else eyebrows.setVisibility(View.INVISIBLE);
    }
    public void onClick_box_eyes(View view){
        if(box_eyes.isChecked()){
            eyes.setVisibility(View.VISIBLE);
        }
        else eyes.setVisibility(View.INVISIBLE);
    }
    public void onClick_box_glasses(View view){
        if(box_glasses.isChecked()){
            glasses.setVisibility(View.VISIBLE);
        }
        else glasses.setVisibility(View.INVISIBLE);
    }
    public void onClick_box_hat(View view){
        if(box_hat.isChecked()){
            hat.setVisibility(View.VISIBLE);
        }
        else hat.setVisibility(View.INVISIBLE);
    }
    public void onClick_box_mouth(View view){
        if(box_mouth.isChecked()){
            mouth.setVisibility(View.VISIBLE);
        }
        else mouth.setVisibility(View.INVISIBLE);
    }
    public void onClick_box_mustache(View view){
        if(box_mustache.isChecked()){
            mustache.setVisibility(View.VISIBLE);
        }
        else mustache.setVisibility(View.INVISIBLE);
    }
    public void onClick_box_nose(View view){
        if(box_nose.isChecked()){
            nose.setVisibility(View.VISIBLE);
        }
        else nose.setVisibility(View.INVISIBLE);
    }
    public void onClick_box_shoes(View view){
        if(box_shoes.isChecked()){
            shoes.setVisibility(View.VISIBLE);
        }
        else shoes.setVisibility(View.INVISIBLE);
    }
}
