package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hypotension extends AppCompatActivity {

    private TextView heading;
    private TextView title;
    private TextView introduction;
    private TextView title1;
    private TextView content1;
    private TextView title2;
    private TextView content2;
    private TextView title3;
    private TextView content3;
    private TextView title4;
    private TextView content4;
    private Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hypotension);


        heading=(TextView)findViewById(R.id.heading);
        title=(TextView)findViewById(R.id.title);
        introduction=(TextView)findViewById(R.id.introduction);
        title1=(TextView)findViewById(R.id.title1);
        content1=(TextView)findViewById(R.id.content1);
        title2=(TextView)findViewById(R.id.title2);
        content2=(TextView)findViewById(R.id.content2);
        title3=(TextView)findViewById(R.id.title3);
        content3=(TextView)findViewById(R.id.content3);
        title4=(TextView)findViewById(R.id.title4);
        content4=(TextView)findViewById(R.id.content4);

        heading.setText("HYPOTENSION (LOW BP)");
        title.setText("WHAT IS LOW BLOOD PRESSURE? ");


        StringBuilder stringBuilder= new StringBuilder();

        String someContent="Low blood pressure, also called hypotension, means different things for different people.\n" +
                "A normal blood pressure reading is typically 120/80 millimeters of mercury (mm Hg), but numbers outside this range can still be healthy. A healthy blood pressure reading for your body is based on your medical history, age, and overall condition.\n" +
                "Your doctor may diagnose you with low blood pressure if your reading is under 90/60 mm Hg and you have other symptoms, including:\n" +
                "•\tblurry vision\n" +
                "•\tconfusion or trouble concentrating\n" +
                "•\tdizziness\n" +
                "•\tfainting\n" +
                "•\tlightheadedness\n" +
                "•\tnausea or vomiting\n" +
                "•\tweakness\n" +
                "Seek immediate medical care if you have a rapid pulse, shallow breathing, and cold or clammy skin. These symptoms may indicate shock, which is a medical emergency.\n" +
                "Low blood pressure has a range of causes, including:\n" +
                "•\tabrupt change in position\n" +
                "•\tanemia\n" +
                "•\tautonomic nervous system disorders\n" +
                "•\tdehydration\n" +
                "•\tdiet\n" +
                "•\teating\n" +
                "•\tendocrine disorders\n" +
                "•\textreme allergic reaction (anaphylaxis)\n" +
                "•\textreme blood loss\n" +
                "•\theart attack or heart disease\n" +
                "•\tlow blood sugar\n" +
                "•\tmedications\n" +
                "•\tpregnancy\n" +
                "•\tsevere infection\n" +
                "•\tstress\n" +
                "•\tthyroid conditions\n" +
                "•\tvigorous exercise\n";

        stringBuilder.append(someContent);
        introduction.setText(stringBuilder.toString());

        title1.setText("WHAT TO EAT ");

        StringBuilder stringBuilder1= new StringBuilder();

        String someContent1="Eating certain types of food can help you raise your blood pressure. Monitor your symptoms and regularly measure your blood pressure to see what works. Try to consume:\n" +
                "•\tMore fluids. Dehydration decreases blood volume, causing blood pressure to drop. Staying hydrated is especially important when exercising.\n" +
                "•\tFoods high in vitamin B-12. Too little vitamin B-12 can lead to anemia, which can cause low blood pressure. Foods high in B-12 include eggs, fortified cereals, and beef.\n" +
                "•\tFoods high in folate. Too little folate can have the same effect as too little vitamin B-12. Examples of folate-rich foods include asparagus, garbanzo beans, and liver.\n" +
                "•\tSalt. Salty foods can increase blood pressure. Try eating canned soup, smoked fish, cottage cheese, and olives.\n" +
                "•\tLicorice tea. Licorice may reduce the effect of aldosterone, the hormone that helps regulate the impact of salt on the body. Drinking licorice tea can help increase blood pressure rates, according to a case presented in the British Medical Journal.\n" +
                "•\tCaffeine. Coffee and caffeinated tea may temporarily spike blood pressure by stimulating the cardiovascular system and boosting your heart rate.\n";

        stringBuilder1.append(someContent1);
        content1.setText(stringBuilder1.toString());

        title2.setText("TIPS FOR AVOIDING LOW BLOOD PRESSURE ");

        StringBuilder stringBuilder2= new StringBuilder();

        String someContent2="Talk to your doctor or a dietitian about the foods you should scratch off your shopping list and those you should eat in moderation. There are ways you can modify daily behaviors that may help as well.\n" +
                "Here are a few other changes you can make to your diet to raise your blood pressure:\n" +
                "•\tEat small meals more frequently. Large meals may cause more dramatic drops in blood pressure, as your body works harder to digest larger meals.\n" +
                "•\tAvoid eating a lot of high-carb foods, particularly processed carbs. These foods are digested quickly, which can lead to low blood pressure.\n" +
                "•\tDrink more water and limit alcohol. Dehydration lowers blood pressure.\n" +
                "In addition to altering your diet, you may also be able to raise your blood pressure by making these lifestyle changes:\n" +
                "•\tDon’t exercise too much outdoors during summer or in extreme heat.\n" +
                "•\tAvoiding spending long amounts of time in saunas, hot tubs, and steam rooms.\n" +
                "•\tChange body positions (such as standing up) slowly.\n" +
                "•\tAvoid prolonged bed rest.\n" +
                "•\tWear compression stockings, which help blood move throughout your body.\n";

        stringBuilder2.append(someContent2);
        content2.setText(stringBuilder2.toString());

        title3.setText("LOW BLOOD PRESSURE AND PREGNANCY ");

        StringBuilder stringBuilder3= new StringBuilder();

        String someContent3="A drop in blood pressure is common during the first 24 weeks of pregnancy. The circulatory system starts to expand, and hormonal changes cause your blood vessels to dilate.\n" +
                "If you experience low blood pressure symptoms, let your OB-GYN know. You may need to pay more attention to your hydration during this time.\n" +
                "Pregnancy-related low blood pressure usually goes away later on in the pregnancy or shortly after delivery. It’s important to have your blood pressure checked and monitored during pregnancy to eliminate any underlying causes for it, such as anemia or an ectopic pregnancy.\n" +
                "Don’t eliminate healthy foods from your diet, even if they’re known to lower blood pressure.\n" +
                "Talk to your doctor about your overall activity level and dietary habits to determine what changes, if any, you should make. Do not try to raise your blood pressure yourself while pregnant.\n";

        stringBuilder3.append(someContent3);
        content3.setText(stringBuilder3.toString());

        title4.setText("THE BOTTOM LINE ");

        StringBuilder stringBuilder4= new StringBuilder();

        String someContent4="Eating certain foods and limiting others may help to lower blood pressure. Just make sure you don’t completely eliminate healthy foods.\n" +
                "If you’re trying to raise your blood pressure through diet, it’s important to work with your doctor to make sure your blood pressure level is healthy for you.\n";



        stringBuilder4.append(someContent4);
        content4.setText(stringBuilder4.toString());

        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Hypotension.this,FourthActivity.class);
                startActivity(intent);
            }
        });


    }
}
