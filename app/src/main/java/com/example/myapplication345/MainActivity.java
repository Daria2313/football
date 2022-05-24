package com.example.myapplication345;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.football.R;

public class MainActivity extends AppCompatActivity {

    private Integer Jungkook = 0;
    private Integer Jimin = 0;
    private TextView JungkookTextView;
    private TextView JiminTextView;

    private static final String TAG = "MainActivity";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume() {
        super.onResume();
        resetUI();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JungkookTextView = findViewById(R.id.Jungkook_score);
        JiminTextView = findViewById(R.id.Jimin_score);
    }

    @SuppressLint("SetTextI18n")
    public void onClickAddElephants(View view) {
        Jungkook++;
        JungkookTextView.setText(Jungkook.toString());
    }

    @SuppressLint("SetTextI18n")
    public void onClickAddDucks(View view) {
        Jimin++;
        JiminTextView.setText(Jimin.toString());
    }

    @SuppressLint("SetTextI18n")
    public void onClickButtonClear(View view) {
        Jungkook = 0;
        Jimin = 0;

        resetUI();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Jungkook", Jungkook);
        outState.putInt("Jimin", Jimin);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("Jungkook")) {
            Jungkook = savedInstanceState.getInt("Jungkook");
        }
        if ((savedInstanceState != null && savedInstanceState.containsKey("Jimin"))) {
            Jimin = savedInstanceState.getInt("Jimin");
        }
        Log.d(TAG, "onRestoreInstanceState");
    }

    @SuppressLint("SetTextI18n")
    private void resetUI() {
        JungkookTextView.setText(Jungkook.toString());
        JiminTextView.setText(Jimin.toString());
        Log.d(TAG, "resetUI");
    }

    public void onClickAddJungkook(View view) {
        Jungkook++;
        JungkookTextView.setText(Jungkook.toString());

    }

    public void onClickAddJimin(View view) {
        Jimin++;
        JiminTextView.setText(Jimin.toString());
    }
}

