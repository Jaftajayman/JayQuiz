package com.example.ekasilab.jayquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class android extends AppCompatActivity {
    //RadioButton rbtrue,rbfalse;
    private RadioGroup rgOne;
    private RadioGroup rgtwo;
    private RadioGroup rgthree;
    private RadioGroup rgfour;
    private RadioGroup rgFive;

    TextView tvDisplay;
    int score;
    int score2;
    int score3;
    int score4;
    int score5;
    int totalScore;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        tvDisplay = (TextView) findViewById(R.id.result_text_view);
        rgOne = (RadioGroup) findViewById(R.id.radioGroup1);
        rgtwo = (RadioGroup) findViewById(R.id.radioGroup2);
        rgthree = (RadioGroup) findViewById(R.id.radioGroup3);
        rgfour = (RadioGroup) findViewById(R.id.radioGroup4);
        rgFive = (RadioGroup) findViewById(R.id.radioGroup5);

        rgOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButtonTrue) {
                    //do work when radioButton1 is active
                    score = 1;
                } else if (checkedId == R.id.radioButtonFalse) {
                    //do work when radioButton2 is active
                    score = 0;
                }


            }

        });



        rgtwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButton3) {
                    //do work when radioButton1 is active
                    score2 = 0;
                } else if (checkedId == R.id.radioButton4) {
                    //do work when radioButton2 is active
                    score2 = 1;
                }



            }
        });


        rgthree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButton5) {
                    //do work when radioButton1 is active
                    score3 = 1;
                } else if (checkedId == R.id.radioButton6) {
                    //do work when radioButton2 is active
                    score3 = 0;
                }


            }
        });

        rgfour.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButton7) {
                    //do work when radioButton1 is active
                    score4 = 1;
                } else if (checkedId == R.id.radioButton8) {
                    //do work when radioButton2 is active
                    score4 = 0;
                }

            }

        });

        rgFive.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButton9) {
                    //do work when radioButton1 is active
                    score5 = 0;
                } else if (checkedId == R.id.radioButton10) {
                    //do work when radioButton2 is active
                    score5 = 1;
                }

            }

        });
    }


    public void onClick(View view) {

        EditText text = (EditText)findViewById(R.id.name_text);
        String name = text.getText().toString();

        // validating edit-text

        if (name.matches("")) {
            Toast.makeText(this, "You did not enter a name", Toast.LENGTH_SHORT).show();
            return;
        }


        totalScore = score + score2 + score3 + score4 + score5;

        if (totalScore < 3) {
            tvDisplay.setText( "Candidate Name :" + name  +  "\n\n" +"Your total score :" +totalScore +"\n\nRemarks  :" + " Sorry study HTML again ");
        } else if(totalScore==3){

            tvDisplay.setText( "Candidate  :"+ name  +  "\n" +"Your total score  : " + totalScore + "\n\nRemarks  :" + " Work harder, you can do it!!!"  );
        }
        else {
            tvDisplay.setText( "Candidate  :"+name  +  "\n" + "Your total score  :" +totalScore + "\n\nRemarks  :" + "  Good work!!!" );
        }


    }





    // opening main activity
    public void startMainActivity(View view){
        Intent objIntent=new Intent(android.this,MainActivity.class);
        startActivity(objIntent);
    }

}
