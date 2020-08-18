package com.example.framelayouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Integer change=0;
    ImageView dog,dog2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        dog=findViewById(R.id.imageView);
        dog2=findViewById(R.id.imageView2);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(change==0)
                {
                    dog.setVisibility(View.VISIBLE);
                    dog2.setVisibility(View.INVISIBLE);
                    change=change+1;
                }
                else if(change==1)
                {
                    dog2.setVisibility(View.VISIBLE);
                    dog.setVisibility(View.INVISIBLE);
                    change-=1;
                }

            }
        });
    }

}