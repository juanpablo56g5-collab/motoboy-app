package com.motoboy.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView title = new TextView(this);
        title.setText("Motoboy App\n\nBem-vindo!");
        title.setTextSize(28);
        title.setTextColor(Color.DKGRAY);
        title.setGravity(Gravity.CENTER);
        setContentView(title);
    }
}
