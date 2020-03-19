package com.example.zerovirus;

import android.app.SearchManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

public class OrdersActivity extends AppCompatActivity {

    ListView listViewOrders;

    Button btnDemo, btnShowOrders;
    SearchView txtSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        txtSearch = findViewById(R.id.txt_search);
        listViewOrders = findViewById(R.id.listViewOrders);
//        ordersList = new ArrayList<>();

        btnDemo = findViewById(R.id.btnDemo);
        btnShowOrders = findViewById(R.id.btnShowOrders);

        btnDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnShowOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //this method will display the orders in the list
//        test(FALSE);

        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        txtSearch.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        txtSearch.setSubmitButtonEnabled(true);
        txtSearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }


            @Override
            public boolean onQueryTextChange(String newText) {
//                searchOrders(newText);
                return false;
            }
        });

    }


}
