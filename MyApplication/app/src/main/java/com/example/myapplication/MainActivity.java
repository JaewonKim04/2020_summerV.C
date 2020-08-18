package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClicked(View v) {
        Toast.makeText(this,"눌러졌습니다",Toast.LENGTH_LONG).show();
    }
    public void onCallClicked(View v)
    {
        //Toast.makeText(this,"전화걸기",Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-3399-8728"));

        startActivity(myIntent);
    }
    public void onNaverClicked(View v)
    {
       // Toast.makeText(this,"네이버 이동",Toast.LENGTH_LONG).show();
        Intent myintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myintent);
    }
}