package com.example.hp.exercise5_calc;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPoint,btnAdd,btnMinus,btnDivide,btnMul,btnEquall;
    TextView TVnumber;
    boolean Isfloat;
    String firstnumber;
    int op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configElements();
    }
    private void configElements()
    {
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPoint = (Button) findViewById(R.id.btnpoint);
        btnAdd = (Button) findViewById(R.id.btnadd);
        btnMinus = (Button) findViewById(R.id.btnminus);
        btnDivide = (Button) findViewById(R.id.btndivide);
        btnMul = (Button) findViewById(R.id.btnmul);
        btnEquall = (Button) findViewById(R.id.btnequall);
        TVnumber = (TextView) findViewById(R.id.TVnumber);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnEquall.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn0 :
                setinput("0");
                break;
            case R.id.btn1:
                setinput("1");
                break;
            case R.id.btn2:
                setinput("2");
                break;
            case R.id.btn3:
                setinput("3");
                break;
            case R.id.btn4:
                setinput("4");
                break;
            case R.id.btn5:
                setinput("5");
                break;
            case R.id.btn6:
                setinput("6");
                break;
            case R.id.btn7:
                setinput("7");
                break;
            case R.id.btn8:
                setinput("8");
                break;
            case R.id.btn9:
                setinput("9");
                break;
            case R.id.btnadd:
                config_for_second_number();
                op=1;
                break;
            case R.id.btnminus:
                config_for_second_number();
                op=2;
                break;
            case R.id.btnmul:
                config_for_second_number();
                op=3;
                break;
            case R.id.btndivide:
                config_for_second_number();
                op=4;
                break;
            case R.id.btnequall:
                break;
            case R.id.btnpoint:
                addpoint();
                break;
        }

    }

    private void config_for_second_number()
    {
        Isfloat=false;
        firstnumber = TVnumber.getText().toString();
        setinput("");
    }
    private void setinput(String inp) {
        if (inp.equals(""))
            TVnumber.setText("0");
        else
        {
            String currentValue = TVnumber.getText().toString();
            if (!currentValue.equals("0"))
                TVnumber.append(inp);
            else
                TVnumber.setText(inp);
        }
    }
    private void addpoint()
    {
        if (!Isfloat)
        {
            Isfloat=true;
            setinput(".");
        }
    }
    private double plus(String num1,String num2)
    {
        return (Double.parseDouble(num1)+Double.parseDouble(num2));
    }
    private double minus(String num1,String num2)
    {
        return (Double.parseDouble(num1)-Double.parseDouble(num2));
    }
    private double mul(String num1,String num2)
    {
        return (Double.parseDouble(num1)*Double.parseDouble(num2));
    }
    private double divide(String num1,String num2)
    {
        return (Double.parseDouble(num1)/Double.parseDouble(num2));
    }


}
