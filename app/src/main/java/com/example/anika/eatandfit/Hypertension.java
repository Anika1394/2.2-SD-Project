package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hypertension extends AppCompatActivity {

    private TextView heading;
    private TextView introduction;
    private TextView title1;
    private TextView content1;
    private TextView title2;
    private TextView content2;
    private TextView title3;
    private TextView content3;
    private Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hypertension);

        heading=(TextView)findViewById(R.id.heading);
        introduction=(TextView)findViewById(R.id.introduction);
        title1=(TextView)findViewById(R.id.title1);
        content1=(TextView)findViewById(R.id.content1);
        title2=(TextView)findViewById(R.id.title2);
        content2=(TextView)findViewById(R.id.content2);
        title3=(TextView)findViewById(R.id.title3);
        content3=(TextView)findViewById(R.id.content3);

        heading.setText("HYPERTENSION (HIGH BP)");

        StringBuilder stringBuilder=new StringBuilder();

        String someContent="By starting a few new food habits, including counting calories and watching portion sizes, you may be able to lower your blood pressure and reduce the medications you need to control high blood pressure. Here's how.\n";
        stringBuilder.append(someContent);
        introduction.setText(stringBuilder.toString());

        title1.setText("TRACK WHAT YOU EAT");

        StringBuilder stringBuilder1= new StringBuilder();

        String someContent1="Some people are not aware of how many calories they eat and drink each day. They may underestimate how much they eat and wonder why they can’t lose weight.\n" +
                "Writing down the foods you eat, including the portion sizes, can let you see the truth about your food intake. You can then start cutting back -- reducing calories and portions -- to lose weight and manage your blood pressure.\n" +
                "Be aware, too, of alcohol intake.  Alcohol can increase your blood pressure, as well.\n";

        stringBuilder1.append(someContent1);

        content1.setText(stringBuilder1.toString());

        title2.setText("AVOID SALT(SODIUM)");

        StringBuilder stringBuilder2=new StringBuilder();

        String someContent2="A high-sodium diet increases blood pressure in many people. In fact, the less sodium you eat, the better blood pressure control you might have.\n" +
                "To lower the sodium in your diet, try these suggestions:\n" +
                "•\tUse a food diary to keep track of the salt in the foods you eat.\n" +
                "•\tAim for less than 2,300 milligrams (about 1 teaspoon of salt) each day. Ask your doctor if you should go lower, to 1,500 milligrams.\n" +
                "•\tRead the nutritional facts label on every food package.\n" +
                "o\tSelect foods that have 5% or less of the “Daily Value” of sodium.\n" +
                "o\tAvoid foods that have 20% or more Daily Value of sodium.\n" +
                "•\tAvoid canned foods, processed foods, lunch meats, and fast foods.\n" +
                "•\tUse salt-free seasonings.\n";

        stringBuilder2.append(someContent2);
        content2.setText(stringBuilder2.toString());

        title3.setText("KNOW WHAT TO EAT");

        StringBuilder stringBuilder3=new StringBuilder();

        String someContent3="Potassium, magnesium, and fiber, on the other hand, may help control blood pressure. Fruits and vegetables are high in potassium, magnesium, and fiber, and they’re low in sodium. Stick to whole fruits and veggies. Juice is less helpful, because the fiber is removed. Also, nuts, seeds, legumes, lean meats, and poultry are good sources of magnesium.\n" +
                "To increase the amounts of natural potassium, magnesium, and fiber you take in, select from the following:\n" +
                "•\tapples\n" +
                "•\tapricots\n" +
                "•\tbananas\n" +
                "•\tbeet greens\n" +
                "•\tbroccoli\n" +
                "•\tcarrots\n" +
                "•\tcollards\n" +
                "•\tgreen beans\n" +
                "•\tdates\n" +
                "•\tgrapes\n" +
                "•\tgreen peas\n" +
                "•\tkale\n" +
                "•\tlima beans\n" +
                "•\tmangoes\n" +
                "•\tmelons\n" +
                "•\toranges\n" +
                "•\tpeaches\n" +
                "•\tpineapples\n" +
                "•\tpotatoes\n" +
                "•\traisins\n" +
                "•\tspinach\n" +
                "•\tsquash\n" +
                "•\tstrawberries\n" +
                "•\tsweet potatoes\n" +
                "•\ttangerines\n" +
                "•\ttomatoes\n" +
                "•\ttuna\n" +
                "•\tyogurt (fat-free)\n";

        stringBuilder3.append(someContent3);
        content3.setText(stringBuilder3.toString());

        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Hypertension.this,FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}
