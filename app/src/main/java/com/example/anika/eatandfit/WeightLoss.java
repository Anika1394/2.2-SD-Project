package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeightLoss extends AppCompatActivity {

    private TextView heading;


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

    private Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loss);

        heading=(TextView)findViewById(R.id.heading);


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



        heading.setText("WEIGHT LOSS TIPS ");



        title1.setText("HOW TO LOOSE WEIGHT FAST: 3 SIMPLE STEPS BASED ON SCIENCE");

        StringBuilder stringBuilder1= new StringBuilder();

        String someContent1="There are many ways to lose a lot of weight fast.\n" +
                "However, most of them will make you hungry and unsatisfied.\n" +
                "If you don't have iron willpower, then hunger will cause you to give up on these plans quickly.\n" +
                "The plan outlined here will:\n" +
                "•\tReduce your appetite significantly.\n" +
                "•\tMake you lose weight quickly, without hunger.\n" +
                "•\tImprove your metabolic health at the same time.\n" +
                "Here is a simple 3-step plan to lose weight fast.\n";
        stringBuilder1.append(someContent1);
        content1.setText(stringBuilder1.toString());

        title2.setText("1.CUT BACK ON SUGARS AND STARCHES");

        StringBuilder stringBuilder2= new StringBuilder();

        String someContent2="The most important part is to cut back on sugars and starches (carbs).\n" +
                "When you do that, your hunger levels go down and you end up eating much fewer calories (1).\n" +
                "Now instead of burning carbs for energy, your body starts feeding off of stored fat.\n" +
                "Another benefit of cutting carbs is that it lowers insulin levels, causing your kidneys to shed excess sodium and water out of your body. This reduces bloat and unnecessary water weight (2, 3).\n" +
                "It is not uncommon to lose up to 10 pounds (sometimes more) in the first week of eating this way, both body fat and water weight.\n" +
                "This is a graph from a study comparing low-carb and low-fat diets in overweight or obese women (4).\n" +
                "Share on Pinterest\n" +
                "The low-carb group is eating until fullness, while the low-fat group is calorie-restricted and hungry.\n" +
                "Cut the carbs and you will start to eat fewer calories automatically and without hunger (5).\n" +
                "Put simply, cutting carbs puts fat loss on autopilot.\n" +
                "SUMMARY Removing sugars and starches (carbs) from your diet will reduce your appetite, lower your insulin levels and make you lose weight without hunger.\n ";

        stringBuilder2.append(someContent2);
        content2.setText(stringBuilder2.toString());

        title3.setText("2.EAT PROTEIN, FAT AND VEGETABLS");

        StringBuilder stringBuilder3= new StringBuilder();

        String someContent3="Each one of your meals should include a protein source, a fat source and low-carb vegetables.\n" +
                "Constructing your meals in this way will automatically bring your carb intake into the recommended range of 20–50 grams per day.\n" +
                "Protein Sources\n" +
                "•\tMeat: Beef, chicken, pork, lamb, etc.\n" +
                "•\tFish and Seafood: Salmon, trout, shrimp, etc.\n" +
                "•\tEggs: Whole eggs with the yolk are best.\n" +
                "The importance of eating plenty of protein cannot be overstated.\n" +
                "This has been shown to boost metabolism by 80 to 100 calories per day (6, 7, 8).\n" +
                "High-protein diets can also reduce cravings and obsessive thoughts about food by 60%, reduce the desire for late-night snacking by half, and make you so full that you automatically eat 441 fewer calories per day — just by adding protein to your diet (9, 10).\n" +
                "When it comes to losing weight, protein is the king of nutrients. Period.\n" +
                "Low-Carb Vegetables\n" +
                "•\tBroccoli\n" +
                "•\tCauliflower\n" +
                "•\tSpinach\n" +
                "•\tTomatoes\n" +
                "•\tKale\n" +
                "•\tBrussels sprouts\n" +
                "•\tCabbage\n" +
                "•\tSwiss chard\n" +
                "•\tLettuce\n" +
                "•\tCucumber\n" +
                "•\tFull list here.\n" +
                "Don’t be afraid to load your plate with these low-carb vegetables. You can eat massive amounts of them without going over 20–50 net carbs per day.\n" +
                "A diet based mostly on meat and vegetables contains all the fiber, vitamins and minerals you need to be healthy.\n" +
                "Fat Sources\n" +
                "•\tOlive oil\n" +
                "•\tCoconut oil\n" +
                "•\tAvocado oil\n" +
                "•\tButter\n" +
                "Eat 2–3 meals per day. If you find yourself hungry in the afternoon, add a 4th meal.\n" +
                "Don’t be afraid of eating fat, as trying to do both low-carb AND low-fat at the same time is a recipe for failure. It will make you feel miserable and abandon the plan.\n" +
                "To see how you can assemble your meals, check out this low-carb meal plan and this list of 101 healthy low-carb recipes.\n" +
                "SUMMARY Assemble each meal out of a protein source, a fat source and low-carb vegetables. This will put you in the 20–50 gram carb range and significantly lower your hunger levels.\n";

        stringBuilder3.append(someContent3);
        content3.setText(stringBuilder3.toString());

        title4.setText("3.LIFT WEIGHT 3 TIMES PER WEEK ");

        StringBuilder stringBuilder4= new StringBuilder();

        String someContent4="You don't need to exercise to lose weight on this plan, but it is recommended.\n" +
                "The best option is to go to the gym 3–4 times a week. Do a warm-up and lift some weights.\n" +
                "If you're new to the gym, ask a trainer for some advice.\n" +
                "By lifting weights, you will burn lots of calories and prevent your metabolism from slowing down, which is a common side effect of losing weight (11, 12).\n" +
                "Studies on low-carb diets show that you can even gain a bit of muscle while losing significant amounts of body fat (13).\n" +
                "If lifting weights is not an option for you, then doing some cardio workouts like walking, jogging, running, cycling or swimming will suffice.\n" +
                "SUMMARY It is best to do some sort of resistance training like weight lifting. If that is not an option, cardio workouts are also effective.\n";

        stringBuilder4.append(someContent4);
        content4.setText(stringBuilder4.toString());

        title5.setText("WHAT ABOUT CALORIES AND PROTEIN CONTROL?");

        StringBuilder stringBuilder5= new StringBuilder();

        String someContent5="It is NOT necessary to count calories as long as you keep the carbs very low and stick to protein, fat and low-carb vegetables.\n" +
                "However, if you really want to count them, use this calculator.\n" +
                "Enter your details, and then pick the number from either the \"Lose Weight\" or the \"Lose Weight Fast\" section — depending on how fast you want to lose weight.\n" +
                "There are many great tools you can use to track the number of calories you are eating. Here is a list of 5 calorie counters that are free and easy to use.\n" +
                "The main goal of this plan is to keep carbs under 20–50 grams per day and get the rest of your calories from protein and fat.\n" +
                "SUMMARY It is not necessary to count calories to lose weight on this plan. It is most important to strictly keep your carbs in the 20–50 gram range.\n";


        stringBuilder5.append(someContent5);
        content5.setText(stringBuilder5.toString());

        title6.setText("10 WEIGHT LOSS TIPS TO MAKE THINGS EASIER (AND FASTER) ");

        StringBuilder stringBuilder6= new StringBuilder();

        String someContent6="Here are 10 more tips to lose weight even faster:\n" +
                "1.\tEat a high-protein breakfast. Eating a high-protein breakfast has been shown to reduce cravings and calorie intake throughout the day (16, 17).\n" +
                "2.\tAvoid sugary drinks and fruit juice. These are the most fattening things you can put into your body, and avoiding them can help you lose weight (18, 19).\n" +
                "3.\tDrink water a half hour before meals. One study showed that drinking water a half hour before meals increased weight loss by 44% over 3 months (20).\n" +
                "4.\tChoose weight loss-friendly foods (see list). Certain foods are very useful for losing fat. Here is a list of the 20 most weight loss-friendly foods on earth.\n" +
                "5.\tEat soluble fiber. Studies show that soluble fibers may reduce fat, especially in the belly area. Fiber supplements like glucomannan can also help (21, 22).\n" +
                "6.\tDrink coffee or tea. If you're a coffee or tea drinker, then drink as much as you want as the caffeine can in them boost your metabolism by 3–11% (23, 24, 25).\n" +
                "7.\tEat mostly whole, unprocessed foods. Base most of your diet on whole foods. They are healthier, more filling and much less likely to cause overeating.\n" +
                "8.\tEat your food slowly. Fast eaters gain more weight over time. Eating slowly makes you feel more full and boosts weight-reducing hormones (26, 27).\n" +
                "9.\tWeigh yourself every day. Studies show that people who weigh themselves every day are much more likely to lose weight and keep it off for a long time (28, 29).\n" +
                "10.\tGet a good night's sleep, every night. Poor sleep is one of the strongest risk factors for weight gain, so taking care of your sleep is important (30).\n" +
                "Even more tips here: 30 Easy Ways to Lose Weight Naturally (Backed by Science).\n" +
                "SUMMARY It is most important to stick to the three rules, but there are a few other things you can do to speed things up.\n";


        stringBuilder6.append(someContent6);
        content6.setText(stringBuilder6.toString());

        title7.setText("YOU DON'T NEED TO STARVE YOURSELF TO LOOSE WEIGHT");

        StringBuilder stringBuilder7= new StringBuilder();

        String someContent7="If you have a medical condition, talk to your doctor before making changes because this plan can reduce your need for medication.\n" +
                "By reducing carbs and lowering insulin levels, you change the hormonal environment and make your body and brain \"want\" to lose weight.\n" +
                "This leads to drastically reduced appetite and hunger, eliminating the main reason that most people fail with conventional weight loss methods.\n" +
                "This is proven to make you lose up to 2–3 times as much weight as a typical low-fat, calorie-restricted diet (38, 39, 40).\n" +
                "Another great benefit for the impatient folks is that the initial drop in water weight can lead to a big difference on the scale as early as the next morning.\n" +
                "Here are a few examples of low-carb meals that are simple, delicious and can be prepared in under 10 minutes: 7 Healthy Low-Carb Meals in 10 Minutes or Less.\n" +
                "On this plan, you can eat good food until you’re full and still lose a ton of fat. Welcome to paradise.\n";

        stringBuilder7.append(someContent7);
        content7.setText(stringBuilder7.toString());



        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WeightLoss.this,FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}
