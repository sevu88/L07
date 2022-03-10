package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText inputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        inputText = (EditText) findViewById(R.id.editText);
    }

    public void function(View v) {
        System.out.println("Hello world!");
        text.setText("Hello World!");
    }

    public void textFunction(View v) {
        text.setText(inputText.getText());

    }
}