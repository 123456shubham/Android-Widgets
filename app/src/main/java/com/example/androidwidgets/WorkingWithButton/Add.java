package com.example.androidwidgets.WorkingWithButton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidwidgets.R;

public class Add extends AppCompatActivity {
EditText editTextFirstNumber;
EditText editTextSecondNumber;
Button buttonSum;
TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        editTextFirstNumber=findViewById(R.id.firstNumber);
        editTextSecondNumber=findViewById(R.id.secondNumber);
        buttonSum=findViewById(R.id.sum);
        textViewResult=findViewById(R.id.result);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=editTextFirstNumber.getText().toString();
                String value2=editTextSecondNumber.getText().toString();
                int num1=Integer.parseInt(value1);
                int num2=Integer.parseInt(value2);
                int sum=num1+num2;
                System.out.print("sum"+sum);
                textViewResult.setText(Integer.toString(sum));
                Toast.makeText(Add.this,"Result = "+sum,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
