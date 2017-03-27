package com.example.zephyr.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Zephyr on 2/27/2017.
 */

public class Calculator extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button addButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);


        addButton=(Button) findViewById(R.id.addbutton);
        number1=(EditText) findViewById(R.id.var1);
        number2=(EditText) findViewById(R.id.var2);

        final Intent intent=new Intent(this,Result.class);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result=Integer.parseInt(number1.getText().toString())+Integer.parseInt(number2.getText().toString());
                intent.putExtra("result",result);
                startActivity(intent);
            }
        });

    }
}
