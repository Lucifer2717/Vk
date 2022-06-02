package com.example.vk1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void totext(View view) {
        startActivity(new Intent(this,SpeechToText.class));

    }

    public void tospeech(View view) {
        startActivity(new Intent(this, converttospeech.class));
    }
}