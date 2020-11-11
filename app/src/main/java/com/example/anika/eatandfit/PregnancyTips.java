package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PregnancyTips extends AppCompatActivity {

    private TextView heading;

    private TextView introduction;
    private TextView title1;
    private TextView content1;
    private TextView title2;
    private TextView content2;
    private TextView title3;
    private TextView content3;
    private TextView title4;
    private TextView content4;
    private TextView title5;
    private TextView content5;
    private TextView title6;
    private TextView content6;
    private TextView title7;
    private TextView content7;
    private TextView title8;
    private TextView content8;
    private Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregnancy_tips);

        heading=(TextView)findViewById(R.id.heading);

        introduction=(TextView)findViewById(R.id.introduction);
        title1=(TextView)findViewById(R.id.title1);
        content1=(TextView)findViewById(R.id.content1);
        title2=(TextView)findViewById(R.id.title2);
        content2=(TextView)findViewById(R.id.content2);
        title3=(TextView)findViewById(R.id.title3);
        content3=(TextView)findViewById(R.id.content3);
        title4=(TextView)findViewById(R.id.title4);
        content4=(TextView)findViewById(R.id.content4);
        title5=(TextView)findViewById(R.id.title5);
        content5=(TextView)findViewById(R.id.content5);
        title6=(TextView)findViewById(R.id.title6);
        content6=(TextView)findViewById(R.id.content6);
        title7=(TextView)findViewById(R.id.title7);
        content7=(TextView)findViewById(R.id.content7);
        title8=(TextView)findViewById(R.id.title8);
        content8=(TextView)findViewById(R.id.content8);


        heading.setText("PREGNANCY TIPS ");

        StringBuilder stringBuilder= new StringBuilder();

        String someContent="Pregnancy is a crucial period in a woman’s life and comes with lots of do’s and don’ts. You shall face a lot of hormonal changes in your body which can affect your mood swings, appetite, and body metabolism. Most women feel nauseated during their pregnancy, which affects their diet and health. It is necessary that your meals contain iron, calcium, folic acid, and vitamins. The Indian diet chart during pregnancy described below is high in nutrition and is sure to help keep you energetic through the day.";
        stringBuilder.append(someContent);
        introduction.setText(stringBuilder.toString());

        title1.setText("PREGNANCY DIET PLAN ");

        StringBuilder stringBuilder1= new StringBuilder();

        String someContent1="Your baby acquires essential nutrients from you, hence it is important that you take good care of your health and switch to a balanced diet for pregnant women. Weight gain during your pregnancy is another cause for concern and a pregnancy diet chart that is balanced helps with healthy weight-gain too. Read on for a vegetarian diet chart for a pregnant lady that is rich in nutrition and will help in gaining the right weight.";

        stringBuilder1.append(someContent1);
        content1.setText(stringBuilder1.toString());

        title2.setText("DIETARY GUIDELINES FOR PREGNANT WOMEN ");

        StringBuilder stringBuilder2= new StringBuilder();

        String someContent2="A woman who is pregnant or who plans to get pregnant should start having proper nourishment right away. You can follow a 3 month pregnancy diet chart from the beginning, as it will help in building nutrition reserve that will supplement the growing baby right from conception. Eating healthy will provide you with essential nutrients that will strengthen your body and immune system, and enhance your metabolism. Before you follow a certain diet plan for pregnancy, it is recommended that you consult your gynaecologist. Here are a few guidelines to follow when you are on a pregnancy diet:\n" +
                "•\tKeep yourself hydrated through the day and drink as much water or juice as you can, at frequent intervals\n" +
                "•\tConsume foods prepared with whole grains such as bread, chapatti and noodles\n" +
                "•\tConsume 5 servings of fresh fruits and vegetables\n" +
                "•\tReduce the intake of sugar and sweet dishes to avoid chances of getting gestational diabetes\n" +
                "•\tAvoid drinking alcohol, packaged juices, and steer clear of fat-rich foods\n" +
                "•\tApart from eating healthy, take the necessary supplements for iron, calcium, folic acid and vitamins, as suggested by your doctor. These help to avoid the possibility of neural tube defects affecting the baby and assist in the development of the brain and other organs\n";

        stringBuilder2.append(someContent2);
        content2.setText(stringBuilder2.toString());

        title3.setText("EARLY MORNING ");

        StringBuilder stringBuilder3= new StringBuilder();

        String someContent3="Morning sickness is part and parcel of pregnancy. Ensure that you have a glass of cow’s milk when you wake up as it helps relieve morning sickness. You may also have a glass of coconut milk or lemonade as it will help ease constipation and heartburn.";
        stringBuilder3.append(someContent3);
        content3.setText(stringBuilder3.toString());

        title4.setText("BREAKFAST ");

        StringBuilder stringBuilder4= new StringBuilder();

        String someContent4="Breakfast is the most essential meal of the day, and it is mandatory for expecting women. Skipping breakfast can make you feel tired and lethargic. This is because you have been hungry during the night and that causes your blood sugar level to drop. You can start your day with nutritious breakfast as indicated below:\n" +
                "•\t1 bowl of oatmeal with fresh fruits – These have important vitamins and fibre\n" +
                "•\t1 plate rava upma or poha or vermicelli with vegetables – These nourish you with multi nutrients and fiber\n" +
                "•\t2 slices of whole wheat bread toast with butter and omelet\n" +
                "•\t1 glass low-fat milk or butter milk or fortified orange juice\n" +
                "•\tA vegetable omelet or vegetable sandwich – best source of proteins\n" +
                "•\t2 paranthas with fillings of dal, potatoes, carrots, spinach or mixed veggies with curd – provide fiber, calcium and vitamins\n";

        stringBuilder4.append(someContent4);
        content4.setText(stringBuilder4.toString());

        title5.setText("LUNCH ");

        StringBuilder stringBuilder5= new StringBuilder();

        String someContent5="Make the most of your lunch time, and eat a balanced meal. You can choose from an array of dishes using pulses, dals, cereals, whole grains, nuts and fresh vegetables. These will provide you the right amount of vitamins, fiber, and minerals. Use only healthy oils like rice bran oil, safflower oil or olive oil for cooking. You may have salads or a bowl of soup made of vegetables as a pre-lunch snack. If you eat non vegetarian food, you could include chicken and fish as they will provide a good amount of concentrated proteins, omega-3 and healthy fats. They also help in forming red blood cells.\n" +
                "\n" +
                "Here are a few meal ideas:\n" +
                "•\t2 Rotis with dal, a bowl of curd and any vegetable curry like mix veg, kofta, paneer and other vegetables\n" +
                "•\tAny rice dish like Jeera and pea rice, vegetable rice, khichdi or lemon rice with raita or plain curd rice\n" +
                "•\t1 bowl chicken curry with roti and rice\n" +
                "•\t1 bowl palak paneer with roti or rice. Spinach is rich in folic acid and iron and is perfect for pregnant women\n";

        stringBuilder5.append(someContent5);
        content5.setText(stringBuilder5.toString());

        title6.setText("SNACKS ");

        StringBuilder stringBuilder6= new StringBuilder();

        String someContent6="It is common to have frequent hunger pangs when you are pregnant. You have a life growing within you and your body is working day and night. You will definitely require more energy and hence more food. So you should make it a habit to eat small frequent meals rather than 3 big meals. Here are some snack ideas for the evening.\n" +
                "•\tHave fresh fruits or a fruit smoothie\n" +
                "•\tMunch a handful of walnuts, almonds or dates\n" +
                "•\tDrink freshly prepared fruit juices to keep yourself hydrated\n" +
                "•\tWhole-grains and low-sugar granola bars are a good option too\n" +
                "•\tVegetable or spinach idlis are filling and healthy\n" +
                "•\tCheese and corn or vegetable sandwich are tasty and nutritious\n" +
                "•\tCarrot or lauki halwa made with jaggery or less sugar can help satiate that sweet tooth\n" +
                "•\tA cup of green tea is warm and comforting\n" +
                "•\tDaliya or uttapam with vegetables are a complete mini-meal\n" +
                "•\tRoasted chana is high in fibre and is a suitable cure for constipation\n" +
                "\n";


        stringBuilder6.append(someContent6);
        content6.setText(stringBuilder6.toString());

        title7.setText("DINNER ");

        StringBuilder stringBuilder7= new StringBuilder();

        String someContent7="It is recommended that you keep your dinner light and eat early. This healthy habit will aid in proper digestion of food and help you have a good night’s sleep. For dinner, you can repeat the ideas from lunch. Some more ideas for your dinner include:\n" +
                "•\tRoti with dal, any vegetable of your choice, salad, and curd\n" +
                "•\tVegetable pulao or chicken rice with vegetable raita\n" +
                "•\tPlain parantha with buttermilk\n" +
                "•\tJowar/ bajra roti with ghee and raita – these grains are easy to digest\n" +
                "•\tMixed dal khichdi with vegetable curry and bowl of curd\\\n" +
                "•\tBeetroot and carrot kheer – increases haemoglobin count, rich in vitamin A and other nutrients\n";

        stringBuilder7.append(someContent7);
        content7.setText(stringBuilder7.toString());

        title8.setText("CONCLUSION ");

        StringBuilder stringBuilder8= new StringBuilder();

        String someContent8="Pick a diet that packs the best nutrients for you and your baby. Do make sure you consult your gynaecologist or nutritionist before following any specific diet, so that you have a healthy pregnancy.";


        stringBuilder8.append(someContent8);
        content8.setText(stringBuilder8.toString());

        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PregnancyTips.this,FourthActivity.class);
                startActivity(intent);
            }
        });




    }
}
