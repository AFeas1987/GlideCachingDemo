package com.af1987.codepath.glidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioClick(View v) {
        Log.d("_AF", "onRadioClick: CLICKED");
        String url = null;
        switch (v.getId()) {
            case R.id.btnCat:
                url = "https://newevolutiondesigns.com/images/freebies/cat-wallpaper-2.jpg";
                break;
            case R.id.btnDog:
                url = "https://newevolutiondesigns.com/images/freebies/dog-wallpaper-41.jpg";
                break;
            case R.id.btnRabbit:
                url = "https://hdqwalls.com/download/rabbit-hd-lo-2932x2932.jpg";
                break;
            case R.id.btnSnake:
                url = "https://images5.alphacoders.com/394/394801.jpg";
                break;
        }
        if (url != null) {
            Glide.with(this).load(url).into((ImageView)findViewById(R.id.ivImage));
        }
    }
}
