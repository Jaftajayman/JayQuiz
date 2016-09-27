package com.example.ekasilab.jayquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // opening html activity
    public void startHtmlActivity(View view) {
        Intent objIntent = new Intent(MainActivity.this, html.class);
        startActivity(objIntent);
    }

    // opening php activity
    public void startPhpActivity(View view) {
        Intent objIntent = new Intent(MainActivity.this, php.class);
        startActivity(objIntent);
    }
    // opening android activity


    public void startAndroidActivity(View view) {
        Intent objIntent = new Intent(MainActivity.this, android.class);
        startActivity(objIntent);
    }

    //terminating the programme
    public void clickExit(View v) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(true);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}



