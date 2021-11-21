package com.jobforandroid.geekbrains_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView Screen;
    private String input = "", Answer;
    private boolean clearResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Screen = findViewById(R.id.screen);
    }

    public void ButtonClick(View view) {
        Button button = (Button) view;
        String data = button.getText().toString();
        switch (data) {
            case "AC":
                input = "";
                break;
            case "Ans":
                clearResult = false;
                input += Answer;
                break;
            case "x":
                clearResult = false;
                Solve();
                input += "*";
                break;
            case "^":
                clearResult = false;
                Solve();
                input += "^";
                break;
            case "=":
                clearResult = true;
                Solve();
                Answer = input;
                break;
            case "⬅":
                if (input.length() > 0) {
                    clearResult = false;
                    String newText = input.substring(0, input.length() - 1);
                    input = newText;
                }
                break;
            default:
                if (input == null) {
                    input = "";
                }
                if (data.equals("+") || data.equals("-") || data.equals("/")) {
                    clearResult = false;
                    Solve();
                } else if (clearResult == true) {
                    input = "";
                    clearResult = false;
                }
                input += data;
        }
        Screen.setText(input);
    }

    public void Solve() {
        if (input.split("\\*").length == 2) {
            String numbers[] = input.split("\\*");
            try {
                double mul = Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
                input = mul + "";
            } catch (Exception e) {
                //Display error
            }
        } else if (input.split("/").length == 2) {
            String numbers[] = input.split("/");
            try {
                double div = Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
                input = div + "";
            } catch (Exception e) {
                //Display error
            }
        } else if (input.split("\\^").length == 2) {
            String numbers[] = input.split("\\^");
            try {
                double pow = Math.pow(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1]));
                input = pow + "";
            } catch (Exception e) {
                //Display error
            }
        } else if (input.split("\\+").length == 2) {
            String numbers[] = input.split("\\+");
            try {
                double sum = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
                input = sum + "";
            } catch (Exception e) {
                //Display error
            }
        } else if (input.split("\\-").length > 1) {
            String numbers[] = input.split("\\-");
            if (numbers[0] == "" && numbers.length == 2) {
                numbers[0] = 0 + "";
            }
            try {
                double sub = 0;
                if (numbers.length == 2) {
                    sub = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
                } else if (numbers.length == 3) {
                    sub = -Double.parseDouble(numbers[1]) - Double.parseDouble(numbers[2]);
                }
                input = sub + "";
            } catch (Exception e) {
                //Display error
            }
        }
        String n[] = input.split("\\.");
        if (n.length > 1) {
            if (n[1].equals("0")) {
                input = n[0];
            }
        }
        Screen.setText(input);
    }

}