package com.example.perfectplacetravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Question_Activity extends AppCompatActivity {

    private TextView Text_1, Text_2, Skip;
    private FrameLayout BTN_1, BTN_2, BTN_3, BTN_4, BTN_5, BTN_6, BTN_7, BTN_8, FRAME_7, FRAME_8;
    private TextView SKIP;
    private TextView Q_1, Q_2,Q_3,Q_4,Q_5,Q_6,Q_7, Q_8;
    private EditText ET_1, ET_2;
    private LinearLayout linearLayout, Q4_SEEKBAR_LINEAR, Q5_SEEKBAR_LINEAR, Q6_SEEKBAR_LINEAR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Text_1 = findViewById(R.id.text_indicate);
        Text_2 = findViewById(R.id.text_indicate_1);
        Skip = findViewById(R.id.skip);
        BTN_1 = findViewById(R.id.btn_1);
        BTN_2 = findViewById(R.id.btn_2);
        BTN_3 = findViewById(R.id.btn_3);
        BTN_4 = findViewById(R.id.btn_4);
        BTN_5 = findViewById(R.id.btn_5);
        BTN_6 = findViewById(R.id.btn_6);
        BTN_7 = findViewById(R.id.btn_7);
        BTN_8 = findViewById(R.id.btn_8);
        SKIP = findViewById(R.id.skip);

        FRAME_7 = findViewById(R.id.frame_Q7);
        FRAME_8 = findViewById(R.id.frame_Q8);

        Q_1 = findViewById(R.id.question_1);
        Q_2 = findViewById(R.id.question_2);
        Q_3 = findViewById(R.id.question_3);
        Q_4 = findViewById(R.id.question_4);
        Q_5 = findViewById(R.id.question_5);
        Q_6 = findViewById(R.id.question_6);
        Q_7 = findViewById(R.id.question_7);
        Q_8 = findViewById(R.id.question_8);

        ET_1 = findViewById(R.id.question_1_detail);
        ET_2 = findViewById(R.id.question_2_detail);

        linearLayout = findViewById(R.id.line_1);
        Q4_SEEKBAR_LINEAR = findViewById(R.id.question_4_seekbar_linear);
        Q5_SEEKBAR_LINEAR = findViewById(R.id.question_5_seekbar_linear);
        Q6_SEEKBAR_LINEAR = findViewById(R.id.question_6_seekbar_linear);

        Q_1.setVisibility(View.VISIBLE);
        BTN_1.setVisibility(View.VISIBLE);
        ET_1.setVisibility(View.VISIBLE);

        Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question_Activity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        BTN_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BTN_1.setVisibility(View.GONE);
                Q_1.setVisibility(View.GONE);
                ET_1.setVisibility(View.GONE);
                BTN_2.setVisibility(View.VISIBLE);
                Q_2.setVisibility(View.VISIBLE);
                ET_2.setVisibility(View.VISIBLE);
                Text_1.setText("2");
                Text_2.setText("2");

            }
        });
        BTN_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BTN_2.setVisibility(View.GONE);
                Q_2.setVisibility(View.GONE);
                ET_2.setVisibility(View.GONE);
                Text_1.setText("3");
                Text_2.setText("3");
                linearLayout.setVisibility(View.VISIBLE);
                Q_3.setVisibility(View.VISIBLE);
                BTN_3.setVisibility(View.VISIBLE);
            }
        });
        BTN_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Text_1.setText("4");
                Text_2.setText("4");
                linearLayout.setVisibility(View.GONE);
                Q_3.setVisibility(View.GONE);
                BTN_3.setVisibility(View.GONE);
                Q4_SEEKBAR_LINEAR.setVisibility(View.VISIBLE);
                Q_4.setVisibility(View.VISIBLE);
                BTN_4.setVisibility(View.VISIBLE);
            }
        });
        BTN_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Text_1.setText("5");
                Text_2.setText("5");
                Q4_SEEKBAR_LINEAR.setVisibility(View.GONE);
                Q_4.setVisibility(View.GONE);
                BTN_4.setVisibility(View.GONE);
                Q5_SEEKBAR_LINEAR.setVisibility(View.VISIBLE);
                Q_5.setVisibility(View.VISIBLE);
                BTN_5.setVisibility(View.VISIBLE);
            }
        });
        BTN_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Text_1.setText("6");
                Text_2.setText("6");
                Q5_SEEKBAR_LINEAR.setVisibility(View.GONE);
                Q_5.setVisibility(View.GONE);
                BTN_5.setVisibility(View.GONE);
                Q6_SEEKBAR_LINEAR.setVisibility(View.VISIBLE);
                Q_6.setVisibility(View.VISIBLE);
                BTN_6.setVisibility(View.VISIBLE);
            }
        });
        BTN_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Text_1.setText("7");
                Text_2.setText("7");
                Q6_SEEKBAR_LINEAR.setVisibility(View.GONE);
                Q_6.setVisibility(View.GONE);
                BTN_6.setVisibility(View.GONE);
                FRAME_7.setVisibility(View.VISIBLE);
                Q_7.setVisibility(View.VISIBLE);
                BTN_7.setVisibility(View.VISIBLE);
            }
        });
        BTN_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Text_1.setText("8");
                Text_2.setText("8");
                FRAME_7.setVisibility(View.GONE);
                Q_7.setVisibility(View.GONE);
                BTN_7.setVisibility(View.GONE);;
                FRAME_8.setVisibility(View.VISIBLE);
                Q_8.setVisibility(View.VISIBLE);
                BTN_8.setVisibility(View.VISIBLE);
            }
        });
        BTN_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question_Activity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


    }
}