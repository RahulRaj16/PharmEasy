package com.example.zerovirus;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class AddMedicineActivity extends AppCompatActivity {

    EditText txt_medicine;
    ImageButton btn_save, btn_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.3));

        txt_medicine = findViewById(R.id.txtMedicine);

        btn_save = findViewById(R.id.btnSave);
        btn_clear = findViewById(R.id.btnClear);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(txt_medicine.getText().toString().trim())) {
                    Toast.makeText(getApplicationContext(), "Field is empty", Toast.LENGTH_LONG).show();
                }
                else{

                    Toast.makeText(getApplicationContext(), "Medicine inserted successfully", Toast.LENGTH_LONG).show();
                    clearData();
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cleared data", Toast.LENGTH_LONG).show();
                clearData();
            }
        });
    }

    //This method clears the text typed in EditText
    public void clearData(){
        txt_medicine.setText("");
    }

}
