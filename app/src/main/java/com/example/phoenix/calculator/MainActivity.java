package com.example.phoenix.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String text="";
    char sign;
    double first_num;
    double second_num;
    double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView=(TextView)findViewById(R.id.textView);

        Button one= (Button) findViewById(R.id.one);
        Button two= (Button) findViewById(R.id.two);
        Button three= (Button) findViewById(R.id.three);
        Button four= (Button) findViewById(R.id.four);
        Button five= (Button) findViewById(R.id.five);
        Button six= (Button) findViewById(R.id.six);
        Button seven= (Button) findViewById(R.id.seven);
        Button eight= (Button) findViewById(R.id.eight);
        Button nine= (Button) findViewById(R.id.nine);
        Button zero= (Button) findViewById(R.id.zero);
        Button dot= (Button) findViewById(R.id.dot);
        Button plus= (Button) findViewById(R.id.plus);
        Button minus= (Button) findViewById(R.id.minus);
        Button multiply= (Button) findViewById(R.id.multiply);
        Button division= (Button) findViewById(R.id.division);
        Button equal= (Button) findViewById(R.id.equal);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="1";
                textView.setText(text);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="2";
                textView.setText(text);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="3";
                textView.setText(text);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="4";
                textView.setText(text);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="5";
                textView.setText(text);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="6";
                textView.setText(text);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="7";
                textView.setText(text);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="8";
                textView.setText(text);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="9";
                textView.setText(text);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text+="0";
                textView.setText(text);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text==""){Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();}
                else{
                char last=text.charAt(text.length()-1);
                boolean rong=false;
                if((last=='.')||(last=='+')||(last=='-')||(last=='÷')||(last=='×')){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                    rong=true;
                }
                else if((text.contains("."))&&(rong==false)&&(!text.contains("+"))&&(!text.contains("-"))&&(!text.contains("÷"))&&(!text.contains("×"))){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                }
                else if(text.indexOf('.')!=text.lastIndexOf('.')){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                }
                else{
                    text+=".";
                    textView.setText(text);
                }
            }}
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text==""){Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();}
                else{
                char last=text.charAt(text.length()-1);
                boolean rong=false;
                if((last=='+')||(last=='-')||(last=='÷')||(last=='×')){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                    rong=true;
                }
                else if(((text.contains("+"))||(text.contains("-"))||(text.contains("÷"))||(text.contains("×")))&&(rong==false)){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                }
                else{
                first_num=Double.parseDouble(text);
                sign='+';
                text+="+";
                textView.setText(text);
                }
            }}
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text==""){Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();}
                else{
                char last=text.charAt(text.length()-1);
                boolean rong=false;
                if((last=='+')||(last=='-')||(last=='÷')||(last=='×')){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                    rong=true;
                }
                else if(((text.contains("+"))||(text.contains("-"))||(text.contains("÷"))||(text.contains("×")))&&(rong==false)){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                }
                else{
                first_num=Double.parseDouble(text);
                sign='-';
                text+="-";
                textView.setText(text);
            }
            }}
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text==""){Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();}
                else{
                char last=text.charAt(text.length()-1);
                boolean rong=false;
                if((last=='+')||(last=='-')||(last=='÷')||(last=='×')){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                    rong=true;
                }
                else if(((text.contains("+"))||(text.contains("-"))||(text.contains("÷"))||(text.contains("×")))&&(rong==false)){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                }
                else{
                first_num = Double.parseDouble(text);
                sign = '÷';
                text += "÷";
                textView.setText(text);
            }
            }}
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text==""){Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();}
                else{
                char last=text.charAt(text.length()-1);
                boolean rong=false;
                if((last=='+')||(last=='-')||(last=='÷')||(last=='×')){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                    rong=true;
                }
                else if(((text.contains("+"))||(text.contains("-"))||(text.contains("÷"))||(text.contains("×")))&&(rong==false)){
                    Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();
                }
                else{
                first_num = Double.parseDouble(text);
                sign = '×';
                text += "×";
                textView.setText(text);
            }
            }}
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text==""){Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();}
                else{
                char last=text.charAt(text.length()-1);
                if((last=='+')||(last=='-')||(last=='÷')||(last=='×')){Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show();}
                else{
                    second_num=Double.parseDouble(text.substring(text.indexOf(sign)+1));
                    if(sign=='+'){result=first_num+second_num;}
                    else if(sign=='-'){result=first_num-second_num;}
                    else if(sign=='×'){ result=first_num * second_num;}
                    else if(sign=='÷'){if(second_num!=0){result=first_num / second_num;}else {Toast.makeText(getApplicationContext(),"ركز لو سمحت",Toast.LENGTH_SHORT).show(); result=0;}}

                    text=String.valueOf(result);
                    textView.setText(text);
                }
            }
            }
        });

        equal.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                text="";
                textView.setText(text);

                return true;
            }
        });

        dot.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(text.length()!=0) {
                    text = text.substring(0, text.length() - 1);
                    textView.setText(text);
                }
                return true;
            }
        });
    }
}
