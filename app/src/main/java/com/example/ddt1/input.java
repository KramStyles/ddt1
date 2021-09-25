package com.example.ddt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

public class input extends AppCompatActivity {
    EditText fname, lname, dob;
    Spinner spinner;
    SeekBar seekBar;
    CheckBox rice, beans;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        dob = findViewById(R.id.dob);
        spinner = findViewById(R.id.spinner);
        seekBar = findViewById(R.id.seekbar);
        rice = findViewById(R.id.rice);
        beans = findViewById(R.id.beans);
        btn = findViewById(R.id.btnSend);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName =fname.getText().toString();
                if (firstName.trim().length() > 2 ){
                    Toast.makeText(getApplicationContext(), firstName, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void sendInfo(View view){

    }
}