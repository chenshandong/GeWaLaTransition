package com.chensd.gewalatransition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import immortalz.me.library.TransitionsHeleper;
import immortalz.me.library.bean.InfoBean;
import immortalz.me.library.method.InflateShowMethod;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TransitionsHeleper.getInstance().setShowMethod(new InflateShowMethod(this, R.layout.activity_main2) {
            @Override
            public void loadCopyView(InfoBean bean, ImageView copyView) {
                copyView.setScaleType(ImageView.ScaleType.FIT_XY);
                copyView.setImageResource(R.drawable.mylove);
            }

            @Override
            public void loadTargetView(InfoBean bean, ImageView targetView) {
                targetView.setImageResource(R.drawable.mylove);
            }
        }).show(this, (ImageView) findViewById(R.id.imageview2));
    }
}
