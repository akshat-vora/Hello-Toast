package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num_1;
    private EditText num_2;
    private TextView final_ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);
        final_ans = (TextView) findViewById(R.id.final_ans);
    }

    public void Multiply(View view)
    {
        try
        {
            double number1, number2, ans;
            number1 = Double.parseDouble(num_1.getText().toString());
            number2 = Double.parseDouble(num_2.getText().toString());
            ans = number1 * number2;
            String final_a = Double.toString(ans);
            final_ans.setText(final_a);
        }
        catch(Exception e)
        {
            Toast.makeText(this, "Enter Number in both feilds!", Toast.LENGTH_SHORT).show();
        }

    }
    public void Add(View view)
    {
        try
        {
            double number1, number2, ans;
            number1 = Double.parseDouble(num_1.getText().toString());
            number2 = Double.parseDouble(num_2.getText().toString());
            ans = number1 + number2;
            String final_a = Double.toString(ans);
            final_ans.setText(final_a);
        }
        catch(Exception e)
        {
            Toast.makeText(this, "Enter Number in both feilds!", Toast.LENGTH_SHORT).show();
        }

    }
    public void Subtract(View view)
    {
        try
        {
            double number1, number2, ans;
            number1 = Double.parseDouble(num_1.getText().toString());
            number2 = Double.parseDouble(num_2.getText().toString());
            ans = number1 - number2;
            String final_a = Double.toString(ans);
            final_ans.setText(final_a);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Enter Number in both feilds!", Toast.LENGTH_SHORT).show();
        }

    }
    public void Divide(View view)
    {
        try
        {
            double number1, number2, ans;
            number1 = Double.parseDouble(num_1.getText().toString());
            number2 = Double.parseDouble(num_2.getText().toString());
            ans = (number1*1.0) / number2;
            String final_a = Double.toString(ans);
            final_ans.setText(final_a);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Enter Number in both feilds!", Toast.LENGTH_SHORT).show();
        }


    }
}