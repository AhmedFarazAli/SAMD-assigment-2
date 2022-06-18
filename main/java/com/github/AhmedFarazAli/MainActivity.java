package com.github.AhmedFarazAli;

//https://github.com/AhmedFarazAli
import androidx.appcompat.app.AppCompatActivity;
//https://github.com/AhmedFarazAli
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//https://github.com/AhmedFarazAli

public class MainActivity extends AppCompatActivity {
    public Button buttonstart;
    public Button buttonstop;
    public TextView textview1;
    thread th1;
    //https://github.com/AhmedFarazAli
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonstart=findViewById(R.id.buttonstart);
        buttonstop=findViewById(R.id.buttonstop);
        textview1=findViewById(R.id.textView1);
        //https://github.com/AhmedFarazAli
        textview1.setMovementMethod(new ScrollingMovementMethod());

        buttonstart.setBackgroundColor(Color.BLACK);
        buttonstop.setBackgroundColor(Color.BLACK);

        buttonstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //https://github.com/AhmedFarazAli
                th1=new thread();
                textview1.append("Thread Created:   "+th1.getState().toString()+"\n");
                th1.start();
                textview1.append("Thread Start():   "+th1.getState().toString()+"\n");
                try {
                    Thread.sleep(1000);
                    textview1.append("Thread Sleep():   "+th1.getState().toString()+"\n");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                textview1.append("Thread Wait():    "+th1.getState().toString()+"\n");
                th1.stopwait();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                textview1.append("hread Terminated: "+th1.getState().toString()+"\n");
            }
        });
        buttonstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //https://github.com/AhmedFarazAli
                finish();
                startActivity(getIntent());

            }
        });
    }
}