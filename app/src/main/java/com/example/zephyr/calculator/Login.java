package com.example.zephyr.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button submitButtton;
    EditText passwordBox;
    EditText userName;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        submitButtton=(Button) findViewById(R.id.submitButton);
        userName=(EditText) findViewById(R.id.userNameText);
        passwordBox=(EditText) findViewById(R.id.passswordText2);
        intent=new Intent(this,Calculator.class);

        submitButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("zaheer".contentEquals(userName.getText()) && "123".contentEquals(passwordBox.getText())) {
                    Toast.makeText(Login.this, "Log in Suuucessfull", Toast.LENGTH_LONG).show();


                    startActivity(intent);
                }
                else {
                    Toast.makeText(Login.this, "Log in Failed", Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}
