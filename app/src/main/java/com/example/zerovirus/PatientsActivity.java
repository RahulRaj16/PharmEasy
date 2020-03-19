package com.example.zerovirus;

import android.app.SearchManager;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;


import androidx.appcompat.app.AppCompatActivity;


public class PatientsActivity extends AppCompatActivity {
   private static final String TAG = "PatientsActivity";
    private ListView plist;
    SQLiteDatabase db;
    private Button add;
    private SearchView editsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients);
        plist = (ListView)findViewById(R.id.listview);
        add = findViewById(R.id.add_patient);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addpatient = new Intent(PatientsActivity.this,AddPatientActivity.class);
                startActivity(addpatient);
            }
        });

        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        editsearch = findViewById(R.id.search_View);
        editsearch.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        editsearch.setSubmitButtonEnabled(true);
        editsearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //Toast.makeText(getApplicationContext(),"Failed to Add",Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });


    }

}
