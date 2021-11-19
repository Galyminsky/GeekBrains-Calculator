package com.jobforandroid.geekbrains_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btn_plus, btn_min, btn_mult, btn_equal, btn_dot, btn_dev;

    TextView txt_result;
    String oper = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn_plus = findViewById(R.id.btn_plus);
        btn_min = findViewById(R.id.btn_min);
        btn_mult = findViewById(R.id.btn_mult);
        btn_equal = findViewById(R.id.btn_equal);
        btn_dot = findViewById(R.id.btn_dot);
        btn_dev = findViewById(R.id.btn_dev);

        txt_result = findViewById(R.id.txt_result);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(String.format("%s0", txt_result.getText()));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "9");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "+");
            }
        });
        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "-");
            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "*");
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "=");
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + ".");
            }
        });
        btn_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "/");
            }
        });


    }

}