package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btnActTwo;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener((View.OnClickListener) this);

        textView = (TextView) findViewById(R.id.textView);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        button2 = (Button) findViewById(R.id.button8);
        button3 = (Button) findViewById(R.id.button9);

        textView.setText("Start");
    }
    public void onButt1(View view) {
        textView.setText("butt1");

    }
    public void onButt2(View view) {
        textView.setText("butt2");

    }
    public void onButt3(View view) {
        textView.setText("butt3");

    }
}