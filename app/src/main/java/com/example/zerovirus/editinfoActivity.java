package com.example.zerovirus;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class editinfoActivity extends AppCompatActivity {
    EditText textInputUsername;
    EditText textInputMobile;
    EditText textInputAddress;
    Button mButtonUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editinfo);

        textInputUsername = (EditText)findViewById(R.id.txtpatient);
        textInputMobile = (EditText)findViewById(R.id.mobile);
        textInputAddress = (EditText)findViewById(R.id.txtAddress);
        mButtonUpdate = (Button)findViewById(R.id.button_update);
        mButtonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateUsername();
                validateMobile();
                validateaddress();

                if (validateUsername() == true &&  validateMobile() == true &&  validateaddress()== true ){
                    Toast.makeText(getApplicationContext(),"Successfully updated", Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    private boolean validateUsername() {
        String usernameInput = textInputUsername.getText().toString().trim();
        String input;
        if (usernameInput.isEmpty()) {
            input =  "Username cannot be empty";
            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validateMobile() {
        String passwordInput = textInputMobile.getEditableText().toString().trim();
        String input;
        if (passwordInput.isEmpty()) {
            input =  "Password cannot be empty";
            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
            return false;
        }
        else if (passwordInput.length() > 10){
            input =  "Enter a valid mobile number";
            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
            return false;
        }
        else {
            return true;
        }

    }

    private boolean validateaddress() {
        String addressInput = textInputAddress.getText().toString().trim();
        String input;
        if (addressInput.isEmpty()) {
            input =  "Address cannot be empty";
            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
            return false;
        }
        else {
            return true;
        }
    }
}
