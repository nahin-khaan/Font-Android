package com.example.androidfont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    Typeface typeface1,typeface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.nahinText);
        text2=findViewById(R.id.mahinText);
        typeface1=Typeface.createFromAsset(getAssets(),"font/FiraSans_Bold.otf");
        text1.setTypeface(typeface1);
        typeface2=Typeface.createFromAsset(getAssets(),"font/FiraSans_Book.otf");
        text2.setTypeface(typeface2);
    }
}