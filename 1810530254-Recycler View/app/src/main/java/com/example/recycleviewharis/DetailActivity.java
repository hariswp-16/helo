package com.example.recycleviewharis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imghp = findViewById(R.id.img_item_photo);
        TextView tvhpname = findViewById(R.id.tv_item_name);
        TextView tvhpdetail = findViewById(R.id.tv_item_detail);

        Hero hero = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(hero != null){
            Glide.with(this)
                    .load(hero.getPhoto())
                    .into(imghp);
            tvhpname.setText(hero.getName());
            tvhpdetail.setText(hero.getDetail());

        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Smartphone");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}