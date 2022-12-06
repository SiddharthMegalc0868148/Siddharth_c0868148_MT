package com.example.siddharth_c0868148_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String cars = "Cars";
    Spinner spinner;
    Button ViewDetails;
    RadioGroup RG;
    CheckBox C1;
    CheckBox C2;
    CheckBox C3;
    TextView textView;
    TextView textView2;
    TextView textView3;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner1);

    }
}