package com.example.zephyr.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Zephyr on 2/27/2017.
 */

public class Result extends AppCompatActivity {
    TextView reslut;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        reslut=(TextView) findViewById(R.id.result);
        Intent intent = getIntent();
        reslut.setText(""+intent.getIntExtra("result",0));


    }
}
