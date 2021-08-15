package com.example.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
public FloatingActionButton floatingActionButton1,floatingActionButton2,floatingActionButton3,floatingActionButton4,floatingActionButton5;
    public FloatingActionButton floatingActionButton6,floatingActionButton7; @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        floatingActionButton1=findViewById(R.id.a1); floatingActionButton2=findViewById(R.id.a2);
        floatingActionButton3=findViewById(R.id.a3);floatingActionButton4=findViewById(R.id.a4);
        floatingActionButton5=findViewById(R.id.a5);floatingActionButton6=findViewById(R.id.a6);
        floatingActionButton7=findViewById(R.id.a7);
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {@Override
            public void onClick(View v) {Intent intent=new Intent(MainActivity.this,Activity1.class);
                startActivity(intent); }});
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {@Override
            public void onClick(View v) { Intent intent=new Intent(MainActivity.this,Activity2.class);
                startActivity(intent); }});
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity3.class);
                startActivity(intent);
            }
        });
        floatingActionButton4.setOnClickListener(new View.OnClickListener() {@Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity4.class);
                startActivity(intent); }});
        floatingActionButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity5.class);
                startActivity(intent);
            }
        });
        floatingActionButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity6.class);
                startActivity(intent);
            }
        });
        floatingActionButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity7.class);
                startActivity(intent);
            }
        });


    }
}