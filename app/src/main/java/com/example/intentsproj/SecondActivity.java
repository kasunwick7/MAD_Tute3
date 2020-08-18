package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    int num1;
    int num2;
    int ans;
    EditText editText1;
    EditText editText2;
    Button btnAdd;
    Button btnMul;
    Button btnDiv;
    Button btnSub;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText1 = findViewById(R.id.txt3);
        editText2 = findViewById(R.id.txt4);
        btnAdd = findViewById(R.id.btnsum);
        btnDiv = findViewById(R.id.btndiv);
        btnSub = findViewById(R.id.btnsub);
        btnMul = findViewById(R.id.btnmul);
        textView = findViewById(R.id.txtdsp);
        Intent intent = getIntent();


        editText1.setText(intent.getStringExtra("number1"));
        editText2.setText(intent.getStringExtra("number1"));

    }
    @Override
    protected void onResume() {
        super.onResume();
        num1 = Integer.parseInt(String.valueOf(editText1.getText()));
        num2 = Integer.parseInt(String.valueOf(editText2.getText()));


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ans= num2 + num1;
               textView.setText(num1 +" + "+num2+" = "+ans);

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans= num2 - num1;
                textView.setText(num1 +" - "+num2+" = "+ans);

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans= num2 * num1;
                textView.setText(num1 +" * "+num2+" = "+ans);

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans= num2 / num1;
                textView.setText(num1 +" / "+num2+" = "+ans);

            }
        });
    }

}