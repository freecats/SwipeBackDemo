package com.freecats.demo.swipebackdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.freecats.demo.swipebackdemo.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enableSwipe(false);//disable swipe to finish

        findViewById(R.id.btn_start_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                startActivity(intent);
            }
        });
    }
}
