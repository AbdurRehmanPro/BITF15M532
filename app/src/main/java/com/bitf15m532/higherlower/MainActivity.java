package com.bitf15m532.higherlower;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
private TextView tv;
    private ImageView iv;
    private static int Splash_Time_Out=4000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.tv);
        iv=(ImageView) findViewById(R.id.iv);
        new Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                Intent homeIntent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },Splash_Time_Out);

    }
}
