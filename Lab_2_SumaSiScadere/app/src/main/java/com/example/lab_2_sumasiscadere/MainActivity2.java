package com.example.lab_2_sumasiscadere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String recData= getIntent().getStringExtra("string");
        String recData2= getIntent().getStringExtra("string2");
        TextView txtView =findViewById(R.id.Name);
        txtView.setText("The numbers are: "+recData+","+recData2);
    }
        public void Sum (View v)
        {
            int x=0,y=0,result=0;
            String recData= getIntent().getStringExtra("string");
            String recData2= getIntent().getStringExtra("string2");
            x = Integer.parseInt(recData);
            y = Integer.parseInt(recData2);
            result=x+y;
            Intent intent_2=new Intent(this, MainActivity.class);
            intent_2.putExtra("result",result);

            startActivity(intent_2);
        }
    public void Sub(View v)
    {
        int x=0,y=0,result=0;
        String recData= getIntent().getStringExtra("string");
        String recData2= getIntent().getStringExtra("string2");
        x = Integer.parseInt(recData);
        y = Integer.parseInt(recData2);
        result=x-y;
        Intent intent_2=new Intent(this, MainActivity.class);
        intent_2.putExtra("result",result);

        startActivity(intent_2);
    }
}