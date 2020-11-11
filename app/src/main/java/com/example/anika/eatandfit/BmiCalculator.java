package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiCalculator extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private TextView result;
    private Button prev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

        height=(EditText)findViewById(R.id.height);
        weight=(EditText)findViewById(R.id.weight);
        result=(TextView)findViewById(R.id.result);
        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BmiCalculator.this,FourthActivity.class);
                startActivity(intent);
            }
        });

    }

    public void calculateBMI (View view){

        String heightStr=height.getText().toString();
        String weightStr=weight.getText().toString();

        if(heightStr !=null && !"".equals(heightStr)
                && weightStr !=null && !"".equals(weightStr))

        {
            float heightValue=Float.parseFloat(heightStr)/100;
            float weightValue=Float.parseFloat(weightStr);

            float bmi=weightValue/(heightValue * heightValue);

            displayBMI(bmi);
        }
    }

    public void displayBMI(float bmi){
        String bmiLabel="";
        if(Float.compare(bmi,15f)<=0){
            bmiLabel="Very severely underweight";
        }

        else if (Float.compare(bmi,15f) > 0 && Float.compare(bmi,16f) <= 0){
            bmiLabel="Severely underweight";
        }
        else if (Float.compare(bmi,16f) > 0 && Float.compare(bmi,18.5f) <= 0){
            bmiLabel="Underweight";
        }
        else if (Float.compare(bmi,18.5f) > 0 && Float.compare(bmi,25f) <= 0){
            bmiLabel="Normal";
        }
        else if (Float.compare(bmi,25f) > 0 && Float.compare(bmi,30f) <= 0){
            bmiLabel="Overweight";
        }
        else if (Float.compare(bmi,30f) > 0 && Float.compare(bmi,35f) <= 0){
            bmiLabel="Obese class 1";
        }
        else if (Float.compare(bmi,35f) > 0 && Float.compare(bmi,40f) <= 0){
            bmiLabel="Obese class 2";
        }
        else{
            bmiLabel="Obese class 3";
        }

        bmiLabel=bmi + "\n\n" +bmiLabel;
        result.setText(bmiLabel);
    }
}
