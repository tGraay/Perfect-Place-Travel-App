package com.example.perfectplacetravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ChatActivity extends AppCompatActivity {

    private ImageView AUDIO_CALL, VIDEO_CALL, FILE_ATTACH_OPEN, FILE_ATTACH_CLOSE;
    private LinearLayout Linear_Files;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        AUDIO_CALL = findViewById(R.id.voice_call);
        VIDEO_CALL = findViewById(R.id.video_call);
        FILE_ATTACH_OPEN = findViewById(R.id.file_open);
        FILE_ATTACH_CLOSE = findViewById(R.id.file_close);
        Linear_Files = findViewById(R.id.message_files_linear);

        AUDIO_CALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChatActivity.this, CallActivity.class);
                startActivity(intent);
            }
        });
        VIDEO_CALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChatActivity.this, CallActivity.class);
                startActivity(intent);
            }
        });

        FILE_ATTACH_OPEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FILE_ATTACH_CLOSE.setVisibility(View.VISIBLE);
                Linear_Files.setVisibility(View.VISIBLE);
                FILE_ATTACH_OPEN.setVisibility(View.GONE);
            }
        });
        FILE_ATTACH_CLOSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FILE_ATTACH_CLOSE.setVisibility(View.GONE);
                Linear_Files.setVisibility(View.GONE);
                FILE_ATTACH_OPEN.setVisibility(View.VISIBLE);
            }
        });
    }
}