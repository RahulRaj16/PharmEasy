package com.example.zerovirus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class settingsActivity extends AppCompatActivity {

    CardView editInfoGrid;
    CardView UpdatePwGrid;
    CardView DeleteAccGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        editInfoGrid = (CardView)findViewById(R.id.grid_editinfo);
        UpdatePwGrid = (CardView)findViewById(R.id.grid_updatePw);
        DeleteAccGrid = (CardView) findViewById(R.id.grid_deleteAcc) ;

        editInfoGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(settingsActivity.this,editinfoActivity.class);
                startActivity(registerIntent);
            }
        });

        UpdatePwGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(settingsActivity.this,updatePasswordActivity.class);
                startActivity(registerIntent);
            }
        });

        DeleteAccGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(settingsActivity.this,LoginActivity.class);
                startActivity(registerIntent);
                Toast.makeText(getApplicationContext(),"Account deleted Succesfullt", Toast.LENGTH_LONG).show();
            }
        });

    }






}
