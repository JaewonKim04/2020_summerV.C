package com.example.applicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username,birth,gender,ag;
    Integer age;
    EditText name,six,one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button check=findViewById(R.id.button);
        name=findViewById(R.id.Name);
        six=findViewById(R.id.Six);
        one=findViewById(R.id.One);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username=name.getText().toString();
                birth=six.getText().toString();
                gender=one.getText().toString();
                if(birth.length()==6&&gender.length()==1)
                {
                    Integer change=Integer.parseInt(birth.substring(0,2)) ;
                    if(gender.equals("1")||gender.equals("2"))
                    {
                        change+=1900;

                    }
                    else if(gender.equals("3")||gender.equals("4"))
                    {
                        change+=2000;

                    }
                    if(gender.equals("1")||gender.equals("3"))
                    {
                        gender="남자";
                    }
                    else if(gender.equals("2")||gender.equals("4"))
                    {
                        gender="여자";
                    }
                    age=2020-change;
                    birth=Integer.toString(age);
                    ag=username+"님의 나이는"+age+"살 "+gender+"입니다";
                    Toast.makeText(MainActivity.this,ag,Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"입력값을 확인하세요",Toast.LENGTH_SHORT).show();

                }
                }

        });
    }
}