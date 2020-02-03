package com.example.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1;
    private Button bt1;
    private Integer num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        tv1 = (TextView)findViewById(R.id.textView);
        bt1 = (Button)findViewById(R.id.button);
        et1.addTextChangedListener(sanitise);
        et2.addTextChangedListener(sanitise);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Logic logic = new Logic();
                    tv1.setText(Integer.toString(logic.random(num1,num2)));
            }
        });
    }

    private TextWatcher sanitise = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            boolean flag = false;
            String temp1 = et1.getText().toString();
            String temp2 = et2.getText().toString();

            if(!temp1.isEmpty() && !temp2.isEmpty()){
                try { //for large input values
                    num1 = Integer.parseInt(temp1);
                    num2 = Integer.parseInt(temp2);
                    if (num1 <= num2)
                        flag = true;
                }
                catch(Exception e){
                    flag = false;
                }
            }
            bt1.setEnabled(flag);
        }
    };
}
