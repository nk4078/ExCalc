package com.example.excalc;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eT;
    String st;
    int operator;
    double num1,num2,result,temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT = (EditText) findViewById(R.id.eT);
        operator = 0;
        result = 0;
        num1 = 0;
        num2 = 0;
    }

    public void Plus(View view) {
        st = eT.getText().toString();
        if (check(st)) {
            temp = Double.parseDouble(st);
            if (operator == 0) {
                num1 = temp;
            } else {
                num2 = temp;
                switch (operator) {
                    case 1:
                        num1 = num1 + num2;
                        break;
                    case 2:
                        num1 = num1 - num2;
                        break;
                }
            }
            operator = 1;
            eT.setHint("" + num1);
            eT.setText("");
        }
    }

    public void Minus(View view) {
        st = eT.getText().toString();
        if (check(st)) {
            temp = Double.parseDouble(st);
            if (operator == 0) {
                num1 = temp;
            } else {
                num2 = temp;
                switch (operator) {
                    case 1:
                        num1 = num1 + num2;
                        break;
                    case 2:
                        num1 = num1 - num2;
                        break;
                    case 3:
                        num1 = num1 * num2;
                        break;
                    case 4:
                        num1 = num1 / num2;
                        break;
                }
            }
            operator = 2;
            eT.setHint("" + num1);
            eT.setText("");
        }
    }

    public void Kefel(View view) {
        st = eT.getText().toString();
        if (check(st)) {
            temp = Double.parseDouble(st);
            if (operator == 0) {
                num1 = temp;
            } else {
                num2 = temp;
                switch (operator) {
                    case 1:
                        num1 = num1 + num2;
                        break;
                    case 2:
                        num1 = num1 - num2;
                        break;
                    case 3:
                        num1 = num1 * num2;
                        break;
                    case 4:
                        num1 = num1 / num2;
                        break;
                }
            }
            operator = 3;
            eT.setHint("" + num1);
            eT.setText("");
        }
    }

    public void Hiluk(View view) {
        st = eT.getText().toString();
        if (check(st)) {
            temp = Double.parseDouble(st);
            if (operator == 0) {
                num1 = temp;
            } else {
                num2 = temp;
                switch (operator) {
                    case 1:
                        num1 = num1 + num2;
                        break;
                    case 2:
                        num1 = num1 - num2;
                        break;
                    case 3:
                        num1 = num1 * num2;
                        break;
                    case 4:
                        num1 = num1 / num2;
                        break;
                }
            }
            operator = 4;
            eT.setHint("" + num1);
            eT.setText("");
        }
        }

    public void Clear(View view) {
        num1 = 0;
        num2 = 0;
        operator = 0;
        eT.setText("");
        eT.setHint("Display");
    }
    public void Sum(View view) {
        st = eT.getText().toString();
        num2 = Double.parseDouble(st);
        switch (operator) {
            case 1:
                num1 = num1 + num2;
                break;
            case 2:
                num1 = num1 - num2;
                break;
            case 3:
                num1 = num1 * num2;
                break;
            case 4:
                num1 = num1 / num2;
                break;
        }
        operator = 0;
        eT.setHint("");
        eT.setText("" + num1);
    }

    public boolean check(String str){
        if((str == "")||(str == "-")||(str == ".")||(str == "-.")){
            return false;
        }
        return true;
    }

    public void go(View view) {
        Intent si = new Intent(this,MainActivity2.class);
        si.putExtra("n",num1);
        startActivity(si);
    }
}