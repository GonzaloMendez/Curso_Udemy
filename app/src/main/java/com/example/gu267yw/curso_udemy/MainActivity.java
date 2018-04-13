package com.example.gu267yw.curso_udemy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int result = check();
        Persona p = new Persona("Gonzalo");
        Toast.makeText(this, "El resultado es: "+ result + p.name,Toast.LENGTH_LONG);
    }

    public int check(){
        int a,b,c,result;
        a=5;
        b=10;
        c=20;

        if(a>b){
            result = 0;
        }else{
            if(c>a){
                result = c;
            }else{
                result = a;
            }
        }
        return result;
    }
    public class Persona {
        public String name;

        Persona (String name){
            this.name = name;
        }
    }
}
