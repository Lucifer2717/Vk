package com.example.vk1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class converttospeech extends AppCompatActivity {
    EditText input;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);
        input=findViewById(R.id.input);

        textToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status!=TextToSpeech.ERROR){
                    textToSpeech.setLanguage(Locale.ENGLISH);
                }
            }
        });

    }

    public void speak(View view) {
        String tmp = input.getText().toString();
        textToSpeech.speak(tmp, TextToSpeech.QUEUE_FLUSH, null);
    }
}