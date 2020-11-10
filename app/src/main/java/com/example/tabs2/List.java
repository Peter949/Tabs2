package com.example.tabs2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class List extends ListActivity {
    String[] countries = { "Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        setListAdapter(adapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(List.this, Argentina.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(List.this, Brazilia.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(List.this, Chili.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(List.this, Columbia.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(List.this, Urugvai.class);
                        startActivity(intent4);
                        break;
                }
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        getListView().setOnItemClickListener(itemListener);
    }
}