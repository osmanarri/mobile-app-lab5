package com.example.mymapsapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class IndiansActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "99";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indians);

        //Reference to button and setting its events listeners
        Button btnViewAll=(Button)findViewById(R.id.btnViewIndiansRes); //#####################
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndiansActivity.this,MainActivity.class);  //#####################

                startActivity(intent);
            }
        });

        //Initializing string array and Assigning the MarketName array into it.
        ListView locationsListView = (ListView) findViewById(R.id.indiansResListView);    //###################
        final String[] LocationsNameStringArray = getResources().getStringArray(R.array.indianRes_names); //###################
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LocationsNameStringArray);
        locationsListView.setAdapter(adapter);




        locationsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                    {
                        Intent intent = new Intent(IndiansActivity.this,IndiansMaps1.class);    //###################
                        intent.putExtra(EXTRA_MESSAGE, "1");
                        startActivity(intent);
                        break;
                    }
                    case 1:
                    {
                        Intent intent = new Intent(IndiansActivity.this,IndiansMaps2.class);    //###################
                        intent.putExtra(EXTRA_MESSAGE, "2");
                        startActivity(intent);
                        break;
                    }
                }
            }
        });
    }
}