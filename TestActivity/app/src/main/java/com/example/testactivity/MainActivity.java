package com.example.testactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;//멤버변수
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml의 컴포넌트를 자바와 연결
        Button button=findViewById(R.id.button);
        Button button2=findViewById(R.id.button2);
        textView=findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("김재원입니다.");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                textView.setTextColor(Color.WHITE);
                textView.setBackgroundColor(Color.BLACK);

            }
        });
    }
}