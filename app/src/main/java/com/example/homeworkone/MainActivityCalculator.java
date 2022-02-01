package com.example.homeworkone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityCalculator extends AppCompatActivity implements View.OnClickListener {
    Calculator calculator = new Calculator();
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
    Button btn_plus;
    Button btn_equals;
    Button btn_erase;
    Button btn_clean;
    Button btn_minus;
    Button btn_multiply;
    Button btn_divide;


    TextView textView;
    String action = "";

    static int Theme=R.style.Theme_HomeWorkOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Theme);
        setContentView(R.layout.activity_calculator);
        in_elem();
        Set_Btn();
    }

    private void in_elem() {
        btn_zero = findViewById(R.id.Zero);
        btn_one = findViewById(R.id.One);
        btn_two = findViewById(R.id.Two);
        btn_three = findViewById(R.id.Three);
        btn_four = findViewById(R.id.Four);
        btn_five = findViewById(R.id.Five);
        btn_six = findViewById(R.id.Six);
        btn_seven = findViewById(R.id.Seven);
        btn_eight = findViewById(R.id.Eight);
        btn_nine = findViewById(R.id.Nine);
        btn_plus = findViewById(R.id.Plus);
        btn_equals = findViewById(R.id.Equals);
        btn_erase = findViewById(R.id.Erase);
        btn_clean = findViewById(R.id.Clean);
        btn_minus = findViewById(R.id.Minus);
        btn_multiply = findViewById(R.id.Multiply);
        btn_divide = findViewById(R.id.Divide);
        textView = findViewById(R.id.text);

        findViewById(R.id.Theme_one).setOnClickListener(this);
        findViewById(R.id.Theme_two).setOnClickListener(this);
        findViewById(R.id.Theme_three).setOnClickListener(this);
    }

    private void Set_Btn() {
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
        btn_plus.setOnClickListener(this);
        btn_erase.setOnClickListener(this);
        btn_equals.setOnClickListener(this);
        btn_clean.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("Calculator", calculator);
        outState.putString("Action", action);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculator = (Calculator) savedInstanceState.getSerializable("Calculator");
        textView.setText(calculator.getStr_count());
        action = savedInstanceState.getString("Action");

    }

    @Override

    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.Zero): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getZero()));
                textView.setText(calculator.getStr_count());
                break;
            }
            case (R.id.One): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getOne()));
                textView.setText(calculator.getStr_count());
                break;
            }
            case (R.id.Two): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getTwo()));
                textView.setText(calculator.getStr_count());
                break;
            }
            case (R.id.Three): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getThree()));
                textView.setText(calculator.getStr_count());
                ;
                break;
            }
            case (R.id.Four): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getFour()));
                textView.setText(calculator.getStr_count());
                break;
            }
            case (R.id.Five): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getFive()));
                textView.setText(calculator.getStr_count());
                break;
            }
            case (R.id.Six): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getSix()));
                textView.setText(calculator.getStr_count());
                break;
            }
            case (R.id.Seven): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getSeven()));
                textView.setText(calculator.getStr_count());
                break;
            }
            case (R.id.Eight): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getEight()));
                textView.setText(calculator.getStr_count());
                ;
                break;
            }
            case (R.id.Nine): {
                calculator.setStr_count(calculator.getStr_count().concat(calculator.getNine()));
                textView.setText(calculator.getStr_count());
                ;
                break;
            }
            case (R.id.Erase): {
                if (calculator.getStr_count().length() != 0) {
                    calculator.delChar();
                }
                textView.setText(calculator.getStr_count());
                break;
            }
            case (R.id.Clean): {
                calculator.setQ(0);
                textView.setText("");
                calculator.setStr_count("");
                action = "";
                break;
            }
            case (R.id.Plus): {
                if (calculator.getStr_count().length() != 0) {
                    calculator.setQ(Integer.parseInt((String) textView.getText()));
                    textView.setText("");
                    calculator.setStr_count("");
                    action = "+";
                }
                break;
            }
            case (R.id.Minus): {
                if (calculator.getStr_count().length() != 0) {
                    calculator.setQ(Integer.parseInt((String) textView.getText()));
                    textView.setText("");
                    calculator.setStr_count("");
                    action = "-";
                }
                break;
            }
            case (R.id.Multiply): {
                if (calculator.getStr_count().length() != 0) {
                    calculator.setQ(Integer.parseInt((String) textView.getText()));
                    textView.setText("");
                    calculator.setStr_count("");
                    action = "x";
                }
                break;
            }
            case (R.id.Divide): {
                if (calculator.getStr_count().length() != 0) {
                    calculator.setQ(Integer.parseInt((String) textView.getText()));
                    textView.setText("");
                    calculator.setStr_count("");
                    action = "/";
                }
                break;
            }
            case (R.id.Equals): {

                if (action.equals("+")) {
                    int d = Integer.parseInt((String) textView.getText());
                    int c = calculator.sum(calculator.getQ(), d);
                    calculator.setStr_count(String.valueOf(c));
                    textView.setText(calculator.getStr_count());
                    action = "";
                    break;
                } else if (action.equals("-")) {
                    int d = Integer.parseInt((String) textView.getText());
                    int c = calculator.min(calculator.getQ(), d);
                    calculator.setStr_count(String.valueOf(c));
                    textView.setText(calculator.getStr_count());
                    action = "";
                    break;
                } else if (action.equals("x")) {
                    int d = Integer.parseInt((String) textView.getText());
                    int c = calculator.multip(calculator.getQ(), d);
                    calculator.setStr_count(String.valueOf(c));
                    textView.setText(calculator.getStr_count());
                    action = "";
                    break;
                } else if (action.equals("/")) {
                    int d = Integer.parseInt((String) textView.getText());
                    int c = calculator.div(calculator.getQ(), d);
                    calculator.setStr_count(String.valueOf(c));
                    textView.setText(calculator.getStr_count());
                    action = "";
                    break;
                } else {
                    calculator.setStr_count("");
                    textView.setText(calculator.getStr_count());
                }

            }
            case (R.id.Theme_one): {
                Theme=R.style.Theme_HomeWorkOne;
                recreate();
                break;
            }
            case (R.id.Theme_two): {
                Theme=R.style.myThemeBlue;
                recreate();
                break;
            }
            case (R.id.Theme_three): {
                Theme=R.style.myThemeGreen;
                recreate();
                break;
            }
            default: {

            }

        }

    }

}