package com.kku.khampakdee.easyproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity { // Main Class

    // Explicit
    private Button signInButton, signUpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) { // Main Method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Widget

        signInButton = (Button) findViewById(R.id.button2);
        signUpButton = (Button) findViewById(R.id.button);

        // Sign up Controller
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, signUp.class));
            }
        });


    } // Main Method
} // Main Class
