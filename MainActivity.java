package com.example.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //on start set layout as specified by activity_main

        Button button = (Button)findViewById(R.id.button); //connect to button
        button.setOnClickListener(new View.OnClickListener() { //use button click event
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText)findViewById(R.id.editText1); //connect to edit_text1,2, text-view
                EditText editText2 = (EditText)findViewById(R.id.editText2);
                TextView textView = (TextView)findViewById(R.id.textView);

                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int result = num1+num2;
                textView.setText(result+"");
            }
        });
    }
}
