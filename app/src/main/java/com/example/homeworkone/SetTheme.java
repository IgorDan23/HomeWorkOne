package com.example.homeworkone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class SetTheme extends AppCompatActivity implements View.OnClickListener {
    private static final String PREF_NAME = "key_pref";
    private static final String PREF_THEME_KEY = "key_pref_theme";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme());
        setContentView(R.layout.set_theme);
        setBtn();
    }


    public void setBtn() {
        findViewById(R.id.Theme_one).setOnClickListener(this);
        findViewById(R.id.Theme_two).setOnClickListener(this);
        findViewById(R.id.Theme_three).setOnClickListener(this);
        findViewById(R.id.Apply).setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.Theme_one): {
                setAppTheme(R.style.Theme_HomeWorkOne);
                recreate();
                break;
            }
            case (R.id.Theme_two): {
                setAppTheme(R.style.myThemeBlue);
                recreate();
                break;
            }
            case (R.id.Theme_three): {
                setAppTheme(R.style.myThemeGreen);
                recreate();
                break;
            }
            case (R.id.Apply): {
                Intent intent = new Intent();
                intent.putExtra("key", getAppTheme());
                SetTheme.this.setResult(RESULT_OK, intent);
                finish();
                break;
            }
            default: {

            }
        }


    }

    protected void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(PREF_THEME_KEY, codeStyle);
        editor.apply();
    }

    protected int getAppTheme() {
        SharedPreferences sharedPref = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        return sharedPref.getInt(PREF_THEME_KEY, R.style.Theme_HomeWorkOne);
    }


}
