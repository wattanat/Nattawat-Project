package com.kku.khampakdee.easyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class signUp extends AppCompatActivity {

    // Explicit
    private EditText nameEditText, phoEditText, useEditText, passEditText;

    private ImageView imageView;
    private Button button;
    private  String nameSting, phoString, userString, passString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget

        nameEditText = (EditText) findViewById(R.id.editText4);
        phoEditText = (EditText) findViewById(R.id.editText3);
        useEditText = (EditText) findViewById(R.id.editText2);
        passEditText = (EditText) findViewById(R.id.editText);
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button3);

        // SignUP Controller
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get Value From Edit Text
                nameSting = nameEditText.getText().toString().trim();
                phoString = phoEditText.getText().toString().trim();
                userString =  useEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();

                // check Space
                if(nameSting.equals("") || phoString.equals("") || userString.equals("") ||
                        passString.equals("")) {

                    //Have Space
                    Log.d("12novV1", "Have Space");
                    MyAlert myAlert = new MyAlert(signUp.this, R.drawable.doremon48,"มีช่องว่าง",
                            "กรอกข้อมูลไม่ครบ ครับ!!");
                    myAlert.myDialog();

                }

            }  //onclick
        });


    }
}