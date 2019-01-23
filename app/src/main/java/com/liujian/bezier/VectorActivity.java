package com.liujian.bezier;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class VectorActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector);
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void fivestar_anim(View view) {
        ImageView imageView = (ImageView) view;
        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) getDrawable(R.drawable.fivestar_anim);
        imageView.setImageDrawable(drawable);
        if (drawable != null) {
            drawable.start();
        }
    }

    public void anim(View view) {
        ImageView imageView = (ImageView) view;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
