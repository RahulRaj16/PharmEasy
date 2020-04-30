package com.example.zerovirus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class AddPatientActivity extends AppCompatActivity {
    Button button_register;
    EditText name,addrs, diag, pres ;
    EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patient);

        name = findViewById(R.id.txtpatient);
        addrs=findViewById(R.id.txtaddress);
        phone = findViewById(R.id.mobileNo);
        diag= findViewById(R.id.txtdiagnosis);
        pres = findViewById(R.id.txtPrescription);

        button_register=findViewById(R.id.btn_addPatient);
        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameIsfull()==true && addressIsfull()== true && mobileIsfull() == true && ValidatePhoneNo()==true && diagnosisIsfull() == true && prescriptionIsfull() == true){
                    Intent patientList = new Intent(AddPatientActivity.this,PatientsActivity.class);
                    startActivity(patientList);
                }

            }
        });
    }


    private boolean nameIsfull(){
        String vname = name.getText().toString().trim();

        if (vname.isEmpty()){
            Toast.makeText(getApplicationContext(),"Name Field Cannot be Empty", Toast.LENGTH_LONG).show();
            return false;
        }else {
            return true;
        }

    }

    private boolean addressIsfull(){
        String vaddress = addrs.getText().toString().trim();

        if (vaddress.isEmpty()){
            Toast.makeText(getApplicationContext(),"Address Field Cannot be Empty", Toast.LENGTH_LONG).show();
            return false;
        }else {
            return true;
        }

    }

    private boolean mobileIsfull(){
        String vmobile = phone.getText().toString().trim();

        if (vmobile.isEmpty()){
            Toast.makeText(getApplicationContext(),"Phone Number Field Cannot be Empty", Toast.LENGTH_LONG).show();
            return false;
        }else {
            return true;
        }

    }

    private boolean diagnosisIsfull(){
        String vdiag = diag.getText().toString().trim();

        if (vdiag.isEmpty()){
            Toast.makeText(getApplicationContext(),"Diagnosis Field Cannot be Empty", Toast.LENGTH_LONG).show();
            return false;
        }else {
            return true;
        }

    }

    private boolean prescriptionIsfull(){
        String vpres = pres.getText().toString().trim();

        if (vpres.isEmpty()){
            Toast.makeText(getApplicationContext(),"Prescription Field Cannot be Empty", Toast.LENGTH_LONG).show();
            return false;
        }else {
            return true;
        }

    }


    private boolean ValidatePhoneNo(){
        String vmobile = phone.getText().toString().trim();
        if(vmobile.length() == 10){
            return true;
        }

        else {
            Toast.makeText(getApplicationContext(),"Invalid Phone number", Toast.LENGTH_LONG).show();
            return false;
        }
    }



}
