package com.ma.lab3_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.viewCount = (TextView) this.findViewById(R.id.txtCounter);

        if(null != savedInstanceState) {
            this.count = savedInstanceState.getInt("count", 0);
            viewCount.setText(String.valueOf(this.count));
        }
    }

    public void increase(View view){
        viewCount.setText(String.valueOf(++this.count));
    }

    public void decrease(View view){
        viewCount.setText(String.valueOf(--this.count));
    }

    @Override
    protected void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("count", this.count);
    }
    private int count=0;
    private TextView viewCount;
}