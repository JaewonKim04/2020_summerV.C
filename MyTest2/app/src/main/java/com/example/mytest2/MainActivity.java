package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
TextView textView;
GestureDetector detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView2);
        View view=findViewById(R.id.view3);
        View view1=findViewById(R.id.view4);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action=motionEvent.getAction();
                float curX=motionEvent.getX();
                float curY=motionEvent.getY();

                if(action==MotionEvent.ACTION_DOWN) {
                    println("down: " + curX + "," + curY);
                } else if(action==MotionEvent.ACTION_MOVE) {
                    println("move"+curX+","+curY);
                }
                else if(action==MotionEvent.ACTION_UP)
                {
                    println("up"+curX+","+curY);
                }
                return true;
            }
        });
        view1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                detector.onTouchEvent(motionEvent);
                return true;
            }
        });
        detector=new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                println("onDawn Call");
                return true;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
                println("onShowPress");
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                println("onSingleTap");
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                println("onScroll");
                return true;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
                println("long pressed");
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
                println("onFling");
                return true;
            }
        });
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK)
        {
            Toast.makeText(getApplicationContext(),"뒤로가기가 눌러졌습니다",Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

    public void println(String data)
    {
        textView.append(data+"\n");
    }

}