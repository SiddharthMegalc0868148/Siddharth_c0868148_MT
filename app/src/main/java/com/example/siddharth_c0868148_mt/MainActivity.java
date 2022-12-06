package com.example.siddharth_c0868148_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String cars = "Cars";
    Spinner spinner;
    SeekBar seekBar;
    Button ViewDetails;
    RadioGroup RG;
    CheckBox C1;
    CheckBox C2;
    CheckBox C3;
    TextView textView;
    TextView textView2;
    TextView textView4;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekBar);
        spinner = findViewById(R.id.spinner1);
        ViewDetails = findViewById(R.id.Btn);
        RG = findViewById(R.id.radioGroup);
        C1 = findViewById(R.id.checkBox);
        C2 = findViewById(R.id.checkBox2);
        C3 = findViewById(R.id.checkBox3);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        editText = findViewById(R.id.editText);


    }
}