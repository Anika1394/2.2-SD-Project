package com.example.anika.eatandfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class FourthActivity extends AppCompatActivity {

    private Button prev;
    private Button metabolism;
    private Button highBP;
    private Button lowBP;
    private Button pregnancy_tips;
    private Button fitness_tips;
    private Button bmi;
    private Button diabetes_care;
    private Button weight_gain;
    private Button weight_loss;
    private Button anemia_care;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        bmi=(Button)findViewById(R.id.bmi);
        prev=(Button)findViewById(R.id.prev);
        highBP=(Button)findViewById(R.id.higBP);
        lowBP=(Button)findViewById(R.id.lowBP);
        pregnancy_tips=(Button)findViewById(R.id.pregnancy_tips);
        fitness_tips=(Button)findViewById(R.id.fitness_tips);
        metabolism=(Button)findViewById(R.id.metabolism);
        diabetes_care=(Button)findViewById(R.id.diabetes_care);
        weight_gain=(Button)findViewById(R.id.weight_gain);
        weight_loss=(Button)findViewById(R.id.weight_loss);
        anemia_care=(Button)findViewById(R.id.anemia_care);


        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,BmiCalculator.class);
                startActivity(intent);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

        anemia_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,AnemiaCare.class);
                startActivity(intent);
            }
        });

        weight_loss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,WeightLoss.class);
                startActivity(intent);
            }
        });

        weight_gain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,WeightGain.class);
                startActivity(intent);
            }
        });

        diabetes_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,Diabetes_Care.class);
                startActivity(intent);
            }
        });

        metabolism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,Metabolism.class);
                startActivity(intent);
            }
        });

        highBP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FourthActivity.this,Hypertension.class);
                startActivity(intent);
            }
        });

        lowBP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FourthActivity.this,Hypotension.class);
                startActivity(intent);
            }
        });

        pregnancy_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FourthActivity.this,PregnancyTips.class);
                startActivity(intent);
            }
        });

        fitness_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FourthActivity.this,GeneralFitness.class);
                startActivity(intent);
            }
        });
    }
}
