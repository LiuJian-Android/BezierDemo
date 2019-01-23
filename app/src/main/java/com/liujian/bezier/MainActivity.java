package com.liujian.bezier;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToVectorActivity(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            startActivity(new Intent(MainActivity.this, VectorActivity.class));
        } else {
            Toast.makeText(MainActivity.this, "当前系统不支持L Plus", Toast.LENGTH_LONG).show();
        }
    }

    public void secondBezierTest(View view) {
        startActivity(new Intent(this, SecondBezierActivity.class));
    }

    public void thirdBezierTest(View view) {
        startActivity(new Intent(this, ThirdBezierActivity.class));
    }

    public void drawPadBezierTest(View view) {
        startActivity(new Intent(this, DrawPadActivity.class));
    }

    public void pathMorthingBezierTest(View view) {
        startActivity(new Intent(this, PathMorthingActivity.class));
    }


    public void waveBezierTest(View view) {
        startActivity(new Intent(this, WaveActivity.class));
    }

    public void pathBezierTest(View view) {
        startActivity(new Intent(this, PathBezierActivity.class));
    }

    public void pathTracing(View view) {
        startActivity(new Intent(this, PathTracingActivity.class));
    }

    public void pathPaint(View view) {
        startActivity(new Intent(this, PathPaintActivity.class));
    }

    public void pathPosTan(View view) {
        startActivity(new Intent(this, PathPosTanActivity.class));
    }

}
