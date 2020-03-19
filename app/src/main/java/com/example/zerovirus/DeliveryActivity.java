package com.example.zerovirus;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DeliveryActivity extends AppCompatActivity {

    public static final String DATABASE_NAME = "PharmEasyDB";

    SQLiteDatabase mDatabase;
    ListView listViewDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        listViewDelivery = findViewById(R.id.listViewDelivery);

        mDatabase = openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE, null);
    }

    //This method retreives and displays all delivery from the database
}
