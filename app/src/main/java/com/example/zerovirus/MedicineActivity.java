package com.example.zerovirus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MedicineActivity extends AppCompatActivity {

    ListView listViewMedicines;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);


        listViewMedicines = findViewById(R.id.listViewMedicines);

        FloatingActionButton button_medicine = findViewById(R.id.addMedFloatingButton);
        button_medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_medicine_intent = new Intent( MedicineActivity.this, AddMedicineActivity.class);
                startActivity(add_medicine_intent);
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();

    }
}
