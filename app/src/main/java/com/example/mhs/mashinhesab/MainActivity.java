package com.example.mhs.mashinhesab;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;


public class MainActivity extends ActionBarActivity  implements View.OnClickListener{


    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnZarb,btnMenha,btnTaghsim,btnJam,btnMosavi,btnMomayez,btnParantezBaz,btnParantezBasteh,
            btnSin,btnCos,btnTan,btnCot,btnLog, btnLog10, btnFactorial,btnPI,btnRadical,btnPercent,btnAC,btnX2,btnX3,btnXY,btnEX,btnBack;
    //EditText etInOut;
    TextView  tvRes;
    Stack<String> stack ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowManager winManager = getWindowManager();
        Display display = winManager.getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();

        if(width > height)
        {
            // Tablet layout called automatically in this If condition.
            //setContentView(R.layout.activity_tablet_device);
            setContentView(R.layout.activity_main2);
        }
        else
        {
            // Normal Phone layout called automatically in this else condition.
            setContentView(R.layout.activity_main);
        }





        //setContentView(R.layout.activity_main);




        stack =new Stack<String>();



        //etInOut=(EditText)findViewById(R.id.etInOut);
        tvRes=(TextView)findViewById(R.id.tvRes);

        btn0 =(Button)findViewById(R.id.btn0);
        btn1 =(Button)findViewById(R.id.btn1);
        btn2 =(Button)findViewById(R.id.btn2);
        btn3 =(Button)findViewById(R.id.btn3);
        btn4 =(Button)findViewById(R.id.btn4);
        btn5 =(Button)findViewById(R.id.btn5);
        btn6 =(Button)findViewById(R.id.btn6);
        btn7 =(Button)findViewById(R.id.btn7);
        btn8 =(Button)findViewById(R.id.btn8);
        btn9 =(Button)findViewById(R.id.btn9);
        btnZarb =(Button)findViewById(R.id.btnZarb);
        btnMenha =(Button)findViewById(R.id.btnMenha);
        btnTaghsim =(Button)findViewById(R.id.btnTaghsim);
        btnJam =(Button)findViewById(R.id.btnJam);
        btnMosavi =(Button)findViewById(R.id.btnMosavi);
        btnMomayez =(Button)findViewById(R.id.btnMomayez);
        btnParantezBaz =(Button)findViewById(R.id.btnParantezBaz);
        btnParantezBasteh =(Button)findViewById(R.id.btnParantezBasteh);
        btnSin =(Button)findViewById(R.id.btnSin);
        btnCos =(Button)findViewById(R.id.btnCos);
        btnTan =(Button)findViewById(R.id.btnTan);
        btnCot =(Button)findViewById(R.id.btnCot);
        btnLog =(Button)findViewById(R.id.btnLog);
        btnLog10 =(Button)findViewById(R.id.btnLog10);
        btnFactorial =(Button)findViewById(R.id.btnFactorial);
        btnPI =(Button)findViewById(R.id.btnPI);
        btnRadical =(Button)findViewById(R.id.btnRadical);
        btnPercent =(Button)findViewById(R.id.btnPercent);
        btnAC =(Button)findViewById(R.id.btnAC);
        btnX2 =(Button)findViewById(R.id.btnX2);
        btnX3 =(Button)findViewById(R.id.btnX3);
        btnXY =(Button)findViewById(R.id.btnXY);
        btnEX =(Button)findViewById(R.id.btnEX);
        btnBack =(Button)findViewById(R.id.btnBack);

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
        btnZarb.setOnClickListener(this);
        btnMenha.setOnClickListener(this);
        btnTaghsim.setOnClickListener(this);
        btnJam.setOnClickListener(this);
        btnMosavi.setOnClickListener(this);
        btnMomayez.setOnClickListener(this);
        btnParantezBaz.setOnClickListener(this);
        btnParantezBasteh.setOnClickListener(this);
        btnSin.setOnClickListener(this);
        btnCos.setOnClickListener(this);
        btnTan.setOnClickListener(this);
        btnCot.setOnClickListener(this);
        btnLog.setOnClickListener(this);
        btnLog10.setOnClickListener(this);
        btnFactorial.setOnClickListener(this);
        btnPI.setOnClickListener(this);
        btnRadical.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnX2.setOnClickListener(this);
        btnX3.setOnClickListener(this);
        btnXY.setOnClickListener(this);
        btnEX.setOnClickListener(this);
        btnBack.setOnClickListener(this);














    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                //etInOut.setText(etInOut.getText() + "0");
                tvRes.setText(tvRes.getText() + "0");
                break;
            case R.id.btn1:
                //etInOut.setText(etInOut.getText() + "1");
                tvRes.setText(tvRes.getText() + "1");

                break;
            case R.id.btn2:
                //etInOut.setText(etInOut.getText() + "2");
                tvRes.setText(tvRes.getText() + "2");
                break;
            case R.id.btn3:
                //etInOut.setText(etInOut.getText() + "3");
                tvRes.setText(tvRes.getText() + "3");
                break;
            case R.id.btn4:
                //etInOut.setText(etInOut.getText() + "4");
                tvRes.setText(tvRes.getText() + "4");
                break;
            case R.id.btn5:
                //etInOut.setText(etInOut.getText() + "5");
                tvRes.setText(tvRes.getText() + "5");
                break;
            case R.id.btn6:
                //etInOut.setText(etInOut.getText() + "6");
                tvRes.setText(tvRes.getText() + "6");
                break;
            case R.id.btn7:
                //etInOut.setText(etInOut.getText() + "7");
                tvRes.setText(tvRes.getText() + "7");
                break;
            case R.id.btn8:
                //etInOut.setText(etInOut.getText() + "8");
                tvRes.setText(tvRes.getText() + "8");
                break;
            case R.id.btn9:
                //etInOut.setText(etInOut.getText() + "9");
                tvRes.setText(tvRes.getText() + "9");
                break;
            case R.id.btnMomayez:
                //etInOut.setText(etInOut.getText() + ".");
                tvRes.setText(tvRes.getText() + ".");
                break;
            case R.id.btnPI:
                //etInOut.setText(etInOut.getText() + "\\u03C0");
                tvRes.setText(tvRes.getText() + "Pi");
                break;
            case R.id.btnZarb:
                //stack.push(etInOut.getText().toString());
                // stack.push("*");
                //etInOut.setText(etInOut.getText() + "*");
                tvRes.setText(tvRes.getText() + "*");

                break;
            case R.id.btnMenha:
                //stack.push(etInOut.getText().toString());
                //stack.push("-");
                //etInOut.setText(etInOut.getText() + "-");
                tvRes.setText(tvRes.getText() + "-");
                break;
            case R.id.btnTaghsim:
                //stack.push(etInOut.getText().toString());
                //stack.push("/");
                //etInOut.setText(etInOut.getText() + "/");
                tvRes.setText(tvRes.getText() + "/");
                break;
            case R.id.btnJam:

                //stack.push(etInOut.getText().toString());
                //stack.push("+");
                //etInOut.setText(etInOut.getText() + "+");
                tvRes.setText(tvRes.getText() + "+");
                break;
            case R.id.btnMosavi:
                //stack.push(etInOut.getText().toString());
                //stack.push("=");
                //etInOut.setText(etInOut.getText() + "=");
                //tvRes.setText(tvRes.getText() + "=");
                //tvRes.setText(String.valueOf(new Main().solve(tvRes.getText().toString())));
                Parser prs=new Parser();
                String result = prs.parse(tvRes.getText().toString());
                tvRes.setText(result);
                //tvRes.setText(String.valueOf(ExpressionParser.RPNtoDouble(ExpressionParser.infixToRPN(explode(tvRes.getText().toString())))));
                break;
            case R.id.btnPercent:
                //stack.push(etInOut.getText().toString());
                //stack.push("%");
                //etInOut.setText(etInOut.getText() + "%");
                tvRes.setText(tvRes.getText() + "%");
                break;
            case R.id.btnParantezBaz:
                tvRes.setText(tvRes.getText() + "(");
                //etInOut.setText(etInOut.getText() + "(");
                break;
            case R.id.btnParantezBasteh:
                tvRes.setText(tvRes.getText() + ")");
                //etInOut.setText(etInOut.getText() + "(");
                break;
            case R.id.btnAC:
                tvRes.setText("");
                stack.removeAllElements();
                break;
            case R.id.btnCos:
                //etInOut.setText(String.valueOf(Math.cos(Double.valueOf(etInOut.getText().toString()))));
                //tvRes.setText(String.valueOf(Math.cos(Double.valueOf(tvRes.getText().toString()))));
                tvRes.setText(tvRes.getText() + "cos(");
                break;
            case R.id.btnSin:
                //etInOut.setText(String.valueOf(Math.sin(Double.valueOf(etInOut.getText().toString()))));
                //tvRes.setText(String.valueOf(Math.sin(Double.valueOf(tvRes.getText().toString()))));
                tvRes.setText(tvRes.getText() + "sin(");
                break;
            case R.id.btnTan:
                tvRes.setText(tvRes.getText() + "tan(");
                //etInOut.setText(String.valueOf(Math.tan(Double.valueOf(etInOut.getText().toString()))));
                //tvRes.setText(String.valueOf(Math.tan(Double.valueOf(tvRes.getText().toString()))));
                break;
            case R.id.btnCot:
                tvRes.setText(tvRes.getText() + "cot(");
                //etInOut.setText(String.valueOf(1/Math.tan(Double.valueOf(etInOut.getText().toString()))));
                //tvRes.setText(String.valueOf(1/Math.tan(Double.valueOf(tvRes.getText().toString()))));
                break;
            case R.id.btnX2:
                tvRes.setText(tvRes.getText() + "^2");
                //etInOut.setText(String.valueOf(Math.pow(Double.valueOf(etInOut.getText().toString()), 2)));
                //tvRes.setText(String.valueOf(Math.pow(Double.valueOf(tvRes.getText().toString()), 2)));
                break;
            case R.id.btnX3:
                tvRes.setText(tvRes.getText() + "^3");
                //etInOut.setText(String.valueOf(Math.pow(Double.valueOf(etInOut.getText().toString()),3)));
                //tvRes.setText(String.valueOf(Math.pow(Double.valueOf(tvRes.getText().toString()),3)));
                break;
            case R.id.btnXY:
                tvRes.setText(tvRes.getText() + "^");
                //etInOut.setText(etInOut.getText().subSequence(0,etInOut.length()-1));
                break;
            case R.id.btnEX:
                tvRes.setText(tvRes.getText() + "e^");
                //etInOut.setText(String.valueOf(Math.exp(Double.valueOf(etInOut.getText().toString()))));
                //tvRes.setText(String.valueOf(Math.exp(Double.valueOf(tvRes.getText().toString()))));
                break;
            case R.id.btnFactorial:
                tvRes.setText(tvRes.getText() + "Factorial(");
                //etInOut.setText(String.valueOf(Math.log(Double.valueOf(etInOut.getText().toString()))));
                //tvRes.setText(String.valueOf(Math.log(Double.valueOf(tvRes.getText().toString()))));
                break;
            case R.id.btnLog:
                tvRes.setText(tvRes.getText() + "log(");
                //etInOut.setText(String.valueOf(Math.log10(Double.valueOf(etInOut.getText().toString()))));
                //tvRes.setText(String.valueOf(Math.log10(Double.valueOf(tvRes.getText().toString()))));
                break;
            case R.id.btnLog10:
                tvRes.setText(tvRes.getText() + "log10(");
                //etInOut.setText(String.valueOf(Math.log(Double.valueOf(etInOut.getText().toString()))/Math.log(2)));
                //tvRes.setText(String.valueOf(Math.log(Double.valueOf(tvRes.getText().toString()))/Math.log(2)));
                break;
            case R.id.btnRadical:
                tvRes.setText(tvRes.getText() + "Sqrt(");
                //etInOut.setText(String.valueOf(Math.log(Double.valueOf(etInOut.getText().toString()))/Math.log(2)));
                //tvRes.setText(String.valueOf(Math.log(Double.valueOf(tvRes.getText().toString()))/Math.log(2)));
                break;
            case R.id.btnBack:
                //etInOut.setText(etInOut.getText().subSequence(0,etInOut.length()-1));
                tvRes.setText(tvRes.getText().subSequence(0,tvRes.length()-1));
                break;

        }
    }






}
