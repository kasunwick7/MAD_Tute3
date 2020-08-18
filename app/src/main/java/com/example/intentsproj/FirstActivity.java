package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button btn;
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

         btn = findViewById(R.id.btnOk);
        editText1 = findViewById(R.id.txt1);
        editText2 = findViewById(R.id.txt2);


    }

    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                Context context = getApplicationContext();
                CharSequence message = "You just clicked the ok button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context ,message,duration);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);

                String num1 = editText1.getText().toString();
                String num2 =  editText2.getText().toString();

                intent.putExtra("number1",num1);
                intent.putExtra("number2",num2);
                startActivity(intent);




            }
        });




    }
}