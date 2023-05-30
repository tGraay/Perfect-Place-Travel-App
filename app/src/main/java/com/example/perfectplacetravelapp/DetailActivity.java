package com.example.perfectplacetravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class DetailActivity extends AppCompatActivity {
    private Dialog BidDialog;
    private Button Book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Book = findViewById(R.id.btn_book_now);
        Book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RBidPopup();
            }
        });
        BidDialog = new Dialog(this);
    }

    private void RBidPopup()
    {
        FrameLayout Submit, Home;
        LinearLayout L1, L2;
        BidDialog.setContentView(R.layout.bid_popup);

        Submit = BidDialog.findViewById(R.id.frame_submit_btn);
        Home = BidDialog.findViewById(R.id.frame_popup_home);
        L1 = BidDialog.findViewById(R.id.linear1);
        L2 = BidDialog.findViewById(R.id.linear2);


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                L2.setVisibility(View.VISIBLE);
                L1.setVisibility(View.GONE);
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(DetailActivity.this, HomeActivity.class);
                startActivity(intent);
                BidDialog.dismiss();
            }
        });

        BidDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        BidDialog.show();

    }
}