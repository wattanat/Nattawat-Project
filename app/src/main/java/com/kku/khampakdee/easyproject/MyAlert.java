package com.kku.khampakdee.easyproject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by CSITGIS on 12/11/2559.
 */

public class MyAlert {
  // Explicit
    private Context context;
    private int anInt;
    private String titleString, messaString;

    public MyAlert(Context context, int anInt, String titleString, String messaString) {
        this.context = context;
        this.anInt = anInt;
        this.titleString = titleString;
        this.messaString = messaString;
    }

    public void  myDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(anInt);
        builder.setTitle(titleString);
        builder.setMessage(messaString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }
} //Main Class
