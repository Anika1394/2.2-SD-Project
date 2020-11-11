package com.example.anika.eatandfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    private Button prev;
    private Button veg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        prev=(Button)findViewById(R.id.prev);
        veg=(Button)findViewById(R.id.veg);

        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,DatabaseHandlerVeg.class);
                startActivity(intent);
            }
        });

       prev.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(SecondActivity.this,FirstActivity.class);
               startActivity(intent);
           }
       });
    }
}
