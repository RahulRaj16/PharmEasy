package com.example.zerovirus.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.zerovirus.Database.DBHelper;
import com.example.zerovirus.R;

public class entryActivity extends AppCompatActivity {
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        dbHelper = new DBHelper(this);

//        Toast.makeText(getApplicationContext(),type,Toast.LENGTH_LONG).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {




                String type  = dbHelper.gettype();
                Intent launchIntent = new Intent();
                if(type.equals("Pharmacy")){
                    launchIntent.setClass(getApplicationContext(), MainActivity.class);
                    startActivity(launchIntent);
                }

                else if(type.equals("Hospital")){
                    launchIntent.setClass(getApplicationContext(), HospitalActivity.class);
                    startActivity(launchIntent);
                }
                else if(type.equals("Patient")){
                    launchIntent.setClass(getApplicationContext(), PatientsActivity.class);
                    startActivity(launchIntent);
                }
                else if(type.equals("")){
                    Intent loginIntent = new Intent(entryActivity.this,LoginActivity.class);
                    startActivity(loginIntent);
                }
                finish();
            }
        }, 4750);




    }





}
