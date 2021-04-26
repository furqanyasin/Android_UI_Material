package com.beingknow.androiduimaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import com.beingknow.androiduimaterial.utils.Tools;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        initComponent();

    }


    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this);
    }

    private void initComponent() {
        Tools.displayImageOriginal(this, findViewById(R.id.image1), R.drawable.image_5);
        Tools.displayImageOriginal(this, findViewById(R.id.image2), R.drawable.image_6);
        Tools.displayImageOriginal(this, findViewById(R.id.image3), R.drawable.image_7);
        Tools.displayImageOriginal(this, findViewById(R.id.image4), R.drawable.image_8);
        Tools.displayImageOriginal(this, findViewById(R.id.image5), R.drawable.image_10);
        Tools.displayImageOriginal(this, findViewById(R.id.image6), R.drawable.image_12);
    }
}