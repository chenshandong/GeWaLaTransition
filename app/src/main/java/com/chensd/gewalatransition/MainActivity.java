package com.chensd.gewalatransition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import immortalz.me.library.TransitionsHeleper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        TransitionsHeleper.startActivity(this, Main2Activity.class, findViewById(R.id.imageview));
    }
}
