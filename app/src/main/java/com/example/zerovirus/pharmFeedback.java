package com.example.zerovirus;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class pharmFeedback extends AppCompatActivity {
    EditText textInputName;
    EditText textInputEmail;
    EditText textinputMessage;
    Button buttonsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharm_feedback);


        textInputName=(EditText)findViewById(R.id.feedname);
        textInputEmail=(EditText)findViewById(R.id.feedmail);
        textinputMessage=(EditText)findViewById(R.id.feedback);
        buttonsubmit=(Button)findViewById(R.id.button_feed);

        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Successfully Submitted!", Toast.LENGTH_LONG).show();



            }
        });



    }


}
