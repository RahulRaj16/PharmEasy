package com.example.zerovirus;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;


public class HospitalActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView navheadertitle;
    String x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        View hView =  navigationView.getHeaderView(0);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navheadertitle =  (TextView)  hView.findViewById(R.id.user_nav);
        x = "Welcome "+ "!";
        navheadertitle.setText(x);
        Toast.makeText(getApplicationContext(),x, Toast.LENGTH_LONG);

        Button addPatient = findViewById(R.id.addPatient);
        Button patientList = findViewById(R.id.patientlist);

        addPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addactivity = new Intent(HospitalActivity.this,AddPatientActivity.class);
                startActivity(addactivity);
            }
        });

        patientList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listactivity = new Intent(HospitalActivity.this,PatientsActivity.class);
                startActivity(listactivity);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hospital, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent settingsIntent = new Intent(HospitalActivity.this, settingsActivity.class);
            startActivity(settingsIntent);
            Toast.makeText(getApplicationContext(),x, Toast.LENGTH_LONG);
            return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_medicine) {

        } else if (id == R.id.patients) {
            Intent patientIntent = new Intent(HospitalActivity.this, PatientsActivity.class);
            startActivity(patientIntent);
        } else if (id == R.id.nav_tools) {
            Intent settingsIntent = new Intent(HospitalActivity.this, settingsActivity.class);
            startActivity(settingsIntent);

        } else if (id == R.id.nav_logout) {
            Intent logIntent = new Intent(HospitalActivity.this, LoginActivity.class);
            startActivity(logIntent);
            Toast.makeText(getApplicationContext(),"Successfully Logged Out", Toast.LENGTH_LONG).show();

        } else if (id == R.id.addpatients) {
            Intent addpatientIntent = new Intent(HospitalActivity.this, AddPatientActivity.class);
            startActivity(addpatientIntent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
