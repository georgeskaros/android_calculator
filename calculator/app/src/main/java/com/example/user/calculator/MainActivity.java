package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import java.lang.*;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button dot;
    private Button equals;
    private Button plus;
    private Button minus;
    private Button mult;
    private Button div;
    private Button sin;
    private Button cos;
    private Button tan;
    private Button clear;
    private Switch rad;
    private TextView info;
    private TextView result;
    private final char ADD = '+';
    private final char SUB = '-';
    private final char MULT = '*';
    private final char DIV = '/';
    private final char EQU = 0;
    private double val1 = Double.NaN ;
    private double val2;
    private double val3;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + ".");

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     compute();
                     ACTION = ADD;
                     if(!Double.isNaN(val1)) {
                         result.setText(String.valueOf(val1) + "+");
                     }
                     info.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    compute();
                    ACTION = SUB;
                    if(!Double.isNaN(val1)) {
                        result.setText(String.valueOf(val1) + "-");
                    }
                    info.setText(null);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    compute();
                    ACTION = MULT;
                    if(!Double.isNaN(val1)) {
                        result.setText(String.valueOf(val1) + "*");
                    }
                    info.setText(null);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    compute();
                    ACTION = DIV;
                if(!Double.isNaN(val1)) {
                    result.setText(String.valueOf(val1) + "/");
                }
                    info.setText(null);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Double.isNaN(val1)){
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                info.setText(null);
                val1 = Double.NaN;
            }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });
        sin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                val2 = Double.parseDouble(info.getText().toString());
                if(!Double.isNaN(val2))
                {
                    if (rad.isChecked())
                    {
                        val3=val2;
                    }
                    else{
                        val3 = Math.toRadians(val2);
                    }
                    val1 = Math.sin(val3);
                    result.setText("sin(" + String.valueOf(val2) + ")= " + String.valueOf(val1));
                    info.setText(null);
                }
            }

        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Double.parseDouble(info.getText().toString());
                if(!Double.isNaN(val2))
                {
                    if (rad.isChecked())
                    {
                        val3=val2;
                    }
                    else{
                        val3 = Math.toRadians(val2);
                    }
                    val1 = Math.cos(val3);
                    result.setText("cos(" + String.valueOf(val2) + ")= " + String.valueOf(val1));
                    info.setText(null);
                }
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Double.parseDouble(info.getText().toString());
                if(!Double.isNaN(val2))
                {
                    if (rad.isChecked())
                    {
                        val3=val2;
                    }
                    else{
                        val3 = Math.toRadians(val2);
                    }
                    val1 = Math.tan(val3);
                    result.setText("tan(" + String.valueOf(val2) + ")= " + String.valueOf(val1));
                    info.setText(null);
                }
            }
        });
    }
    private void setupUIViews (){
        zero = (Button)findViewById(R.id.B0);
        one = (Button)findViewById(R.id.B1);
        two = (Button)findViewById(R.id.B2);
        three = (Button)findViewById(R.id.B3);
        four = (Button)findViewById(R.id.B4);
        five = (Button)findViewById(R.id.B5);
        six = (Button)findViewById(R.id.B6);
        seven = (Button)findViewById(R.id.B7);
        eight = (Button)findViewById(R.id.B8);
        nine = (Button)findViewById(R.id.B9);
        dot = (Button)findViewById(R.id.Bdot);
        equals = (Button)findViewById(R.id.Bequals);
        plus = (Button)findViewById(R.id.Bplus);
        minus = (Button)findViewById(R.id.Bminus);
        mult = (Button)findViewById(R.id.Bmult);
        div = (Button)findViewById(R.id.Bdiv);
        sin = (Button)findViewById(R.id.Bsin);
        cos = (Button)findViewById(R.id.Bcos);
        tan = (Button)findViewById(R.id.Btan);
        clear = (Button)findViewById(R.id.Bclear);
        info = (TextView)findViewById(R.id.TextInfo);
        result = (TextView)findViewById(R.id.TextResult);
        rad = (Switch)findViewById(R.id.Srad);





    }
    private void compute()
    {


        try {
            if (!Double.isNaN(val1)) {
                val2 = Double.parseDouble(info.getText().toString());

                switch (ACTION) {
                    case ADD:
                        val1 = val1 + val2;
                        break;
                    case SUB:
                        val1 = val1 - val2;
                        break;
                    case MULT:
                        val1 = val1 * val2;
                        break;
                    case DIV:
                        val1 = val1 / val2;
                        break;
                    case EQU:
                        break;
                }
            }
            else
             {
                 val1 = Double.parseDouble(info.getText().toString());
             }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
