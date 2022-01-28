package com.example.homeworkone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityCalculator extends AppCompatActivity  implements View.OnClickListener  {
    Calculator calculator=new Calculator();
    Button btn_zero;
    Button btn_one;
    Button btn_two;
    Button btn_three;
    Button btn_four;
    Button btn_five;
    Button btn_six;
    Button btn_seven;
    Button btn_eight;
    Button btn_nine;
    Button bnt_plus;
    Button bnt_equals;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        in_elem();


    }

    private void in_elem() {
        btn_zero=findViewById(R.id.Zero);
        btn_one=findViewById(R.id.One);
        btn_two=findViewById(R.id.Two);
        btn_three=findViewById(R.id.Three);
        btn_four=findViewById(R.id.Four);
        btn_five=findViewById(R.id.Five);
        btn_six=findViewById(R.id.Six);
        btn_seven=findViewById(R.id.Seven);
        btn_eight=findViewById(R.id.Eight);
        btn_nine=findViewById(R.id.Nine);
        bnt_plus=findViewById(R.id.Plus);
        bnt_equals=findViewById(R.id.Equals);
        textView=findViewById(R.id.text);
        btn_zero.setOnClickListener(this);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_five.setOnClickListener(this);
        btn_six.setOnClickListener(this);
        btn_seven.setOnClickListener(this);
        btn_eight.setOnClickListener(this);
        btn_nine.setOnClickListener(this);
        bnt_plus.setOnClickListener(this);
        bnt_equals.setOnClickListener(this);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("Calculator",calculator);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculator=(Calculator) savedInstanceState.getSerializable("Calculator");
        textView.setText(String.format("%d",calculator.getCount()));

    }

    @Override

    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.Zero): {
                 textView.setText(String.format("%d",calculator.getZero()));
                 break;
         }
            case (R.id.One): {
                textView.setText(String.format("%d",calculator.getOne()));
                break;
            }
            case (R.id.Two): {
                textView.setText(String.format("%d",calculator.getTwo()));
                break;
            }
            case (R.id.Three): {
                textView.setText(String.format("%d",calculator.getThree()));
                break;
            }
            case (R.id.Four): {
                textView.setText(String.format("%d",calculator.getFour()));
                break;
            }
            case (R.id.Five): {
                textView.setText(String.format("%d",calculator.getFive()));
                break;
            }
            case (R.id.Six): {
                textView.setText(String.format("%d",calculator.getSix()));
                break;
            }
            case (R.id.Seven): {
                textView.setText(String.format("%d",calculator.getSeven()));
                break;
            }
            case (R.id.Eight): {
                textView.setText(String.format("%d",calculator.getEight()));
                break;
            }
            case (R.id.Nine): {
                textView.setText(String.format("%d",calculator.getNine()));
                break;
            }
            default: {

            }
        }

    }
}