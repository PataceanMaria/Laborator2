package com.example.lab_2_sumasiscadere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int recData= getIntent().getIntExtra("result",0);
        TextView txtView =findViewById(R.id.Result);
        txtView.setText("The result: "+recData);

    }
    public void sendtoactivity2(View view)
    {
        Intent intent_1=new Intent(this,MainActivity2.class);
        EditText editText=findViewById(R.id.Number1);
        EditText editText2=findViewById(R.id.Number2);
        intent_1.putExtra("string",editText.getText().toString());
        intent_1.putExtra("string2",editText2.getText().toString());
        startActivity(intent_1);
    }
}