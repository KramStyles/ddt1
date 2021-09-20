package com.example.ddt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class card1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);


    }

    public void goToSecond(View view){
        Intent intent = new Intent(this, second.class);
        startActivity(intent);
    }
}