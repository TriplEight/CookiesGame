package com.example.android.cookies;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView ImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        ImageView.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView TextView = (TextView) findViewById(R.id.status_text_view);
        TextView.setTextSize(56);
        TextView.setTextColor(Color.RED);
        TextView.setText("Yeah!");




    }
}