package com.example.recycleviewharis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerList();
    }
    
        private void showRecyclerList () {
            rvHeroes.setLayoutManager(new LinearLayoutManager(this));
            ListHeroAdapter listHeroAdapter = new ListHeroAdapter(list);
            rvHeroes.setAdapter(listHeroAdapter);

            listHeroAdapter.setOnItemClickCallback(new ListHeroAdapter.OnItemClickCallback() {
                @Override
                public void onItemClicked(Hero hero) {

                    Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
                    moveIntent.putExtra(DetailActivity.ITEM_EXTRA, hero);
                    startActivity(moveIntent);
                    showSelectedHero(hero);

                }

            });
        }

    private void showRecyclerCardView(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        CardViewHeroAdapter cardViewHeroAdapter = new CardViewHeroAdapter(list);
        rvHeroes.setAdapter(cardViewHeroAdapter);
    }

    private void showRecyclerGrid(){
        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2));
        GridHeroAdapter gridHeroAdapter = new GridHeroAdapter(list);
        rvHeroes.setAdapter(gridHeroAdapter);
    }



    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedHero(Hero hero) {
        Toast.makeText(this, "Kamu memilih " + hero.getName(), Toast.LENGTH_SHORT).show();
    }

    private String title = "Mode List";

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

    private boolean setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "List Smartphone";
                showRecyclerList();
                break;
            case R.id.action_gridview:
                title = "Grid View";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "Card View";
                showRecyclerCardView();
                break;
            case R.id.action_About:

                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                title = "About Me";
                return true;
        }
        setActionBarTitle(title);
        return false;
    }

}
