package com.example.hp.exercise5_calc;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPoint,btnAdd,btnMinus,btnDivide,btnMul,btnEquall;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    }

    @Override
    public void onClick(View v) {

    }


}
