package com.example.ddt1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

public class input extends AppCompatActivity {
    EditText fname, lname, dob;
    Spinner spinner;
    SeekBar seekBar;
    CheckBox rice, beans;
    Button btn, btnAssignment;


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
        btnAssignment = findViewById(R.id.btnAssignment);
        AlertDialog.Builder alertDiag = new AlertDialog.Builder(this);
        alertDiag.setTitle("Message");
        alertDiag.setCancelable(false);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName =fname.getText().toString();
                if (firstName.trim().length() > 2 ){
                    Toast.makeText(getApplicationContext(), firstName, Toast.LENGTH_LONG).show();
                } else {
                    fname.setError("More than 2 Characters needed");

                }
            }
        });


        btnAssignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(input.this, input_assignment.class);
                startActivity(intent);
            }
        });

        rice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    alertDiag.setMessage("Two needed");
                    AlertDialog alert = alertDiag.create();
                    alert.show();
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(getApplicationContext(), String.valueOf(progress), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void sendInfo(View view){

    }
}