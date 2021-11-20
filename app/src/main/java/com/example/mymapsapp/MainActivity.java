package com.example.mymapsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.mainListView);

        //Initializing string array and Assigning the CollegeName array into it.
        String[] selectCuisines = getResources().getStringArray(R.array.Cuisines);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, selectCuisines);
        listView.setAdapter(adapter);
        //ListView onItemClicked Event Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        startActivity(new Intent(MainActivity.this,ItaliansActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,ChineseActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,GreeksActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,IndiansActivity.class));
                        break;

                }

            }
        });

//        button = (Button) findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                 Intent intent = new Intent(MainActivity.this, MapsActivity.class);
//                 startActivity(intent);
//            }
//        });



    }
}