package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvsmartphones;
    private ArrayList<Smartphone> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvsmartphones = findViewById(R.id.rv_smartphones);
        rvsmartphones.setHasFixedSize(true);

        list.addAll(SmartphoneData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvsmartphones.setLayoutManager(new LinearLayoutManager(this));
        ListSmartphoneAdapter listHeroAdapter = new ListSmartphoneAdapter(list);
        rvsmartphones.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                break;

            case R.id.action_grid:
                break;

            case R.id.action_cardview:
                break;
        }
    }
}