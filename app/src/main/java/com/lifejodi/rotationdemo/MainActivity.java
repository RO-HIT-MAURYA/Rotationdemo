package com.lifejodi.rotationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    float angle = 0;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i > 0) {
                    angle -= 360;
                    findViewById(R.id.textView).animate().rotationY(angle).setDuration(1000);
                    i--;
                    Log.e("iIs", i + "");
                }
            }
        });

        findViewById(R.id.right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angle += 360;
                findViewById(R.id.textView).animate().rotationY(angle).setDuration(1000);
                i++;
                Log.e("iIs", i + "");

            }
        });
    }
}
