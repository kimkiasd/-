package com.example.a2017270030_210922_10_1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class secondActivity2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second2);
        setTitle("등 운동");

        Gallery gallery = findViewById(R.id.gallery2);
        MyGallertAdapter galadApter = new MyGallertAdapter(this);;
        gallery.setAdapter(galadApter);

    }

    public class MyGallertAdapter extends BaseAdapter {

        Context context;
        Integer[] posterID = {
                R.raw.b1, R.raw.b2, R.raw.b3, R.raw.b4, R.raw.b5};
        public MyGallertAdapter(Context c){
            context = c;
        }


        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View converView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new Gallery.LayoutParams(200,300));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(5,5,5,5);

            imageView.setImageResource(posterID[position]);

            final int pos  = position;
            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent Event) {
                    ImageView ivPoster = findViewById(R.id.ivPoster);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterID[pos]);
                    Glide.with(parent).load(posterID[pos]).into(ivPoster);
                    return false;
                }
            });

            return imageView;

        }


    }

}
