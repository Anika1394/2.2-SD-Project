package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GeneralFitness extends AppCompatActivity {


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
        setContentView(R.layout.activity_general_fitness);

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
        title5=(TextView)findViewById(R.id.title5);
        content5=(TextView)findViewById(R.id.content5);
        title6=(TextView)findViewById(R.id.title6);
        content6=(TextView)findViewById(R.id.content6);
        title7=(TextView)findViewById(R.id.title7);
        content7=(TextView)findViewById(R.id.content7);
        title8=(TextView)findViewById(R.id.title8);
        content8=(TextView)findViewById(R.id.content8);


        heading.setText("GENERAL FITNESS TIPS ");
        title.setText("NUTRITION IS IMPORTANT FOR FITNESS ");

        StringBuilder stringBuilder= new StringBuilder();

        String someContent="Eating a well-balanced diet can help you get the calories and nutrients you need to fuel your daily activities, including regular exercise.\n" +
                "When it comes to eating foods to fuel your exercise performance, it’s not as simple as choosing vegetables over doughnuts. You need to eat the right types of food at the right times of the day.\n" +
                "Learn about the importance of healthy breakfasts, workout snacks, and meal plans.\n";

        stringBuilder.append(someContent);
        introduction.setText(stringBuilder.toString());

        title1.setText("GET OFF TO A GOOD START ");

        StringBuilder stringBuilder1= new StringBuilder();

        String someContent1="Your first meal of the day is an important one.\n" +
                "According to an article published in Harvard Health Letter, eating breakfast regularly has been linked to a lower risk of obesity, diabetes, and heart disease. Starting your day with a healthy meal can help replenish your blood sugar, which your body needs to power your muscles and brain.\n" +
                "Eating a healthy breakfast is especially important on days when exercise is on your agenda. Skipping breakfast can leave you feeling lightheaded or lethargic while you’re working out.\n" +
                "Choosing the right kind of breakfast is crucial. Too many people rely on simple carbohydrates to start their day. A plain white bagel or doughnut won’t keep you feeling full for long.\n" +
                "In comparison, a fiber- and protein-rich breakfast may fend off hunger pangs for longer and provide the energy you need to keep your exercise going.\n" +
                "Follow these tips for eating a healthy breakfast:\n" +
                "•\tInstead of eating sugar-laden cereals made from refined grains, try oatmeal, oat bran, or other whole-grain cereals that are high in fiber. Then, throw in some protein, such as milk, yogurt, or chopped nuts.\n" +
                "•\tIf you’re making pancakes or waffles, replace some of the all-purpose flour with whole-grain options. Then, stir some cottage cheese into the batter.\n" +
                "•\tIf you prefer toast, choose whole-grain bread. Then pair it with an egg, peanut butter, or another protein source.\n";

        stringBuilder1.append(someContent1);
        content1.setText(stringBuilder1.toString());

        title2.setText("COUNT ON THE RIGHT CARBOHYDRATES ");

        StringBuilder stringBuilder2= new StringBuilder();

        String someContent2="Thanks to low-carb fad diets, carbohydrates have gotten a bad rap. But carbohydrates are your body’s main source of energy. According to the Mayo Clinic, about 45 to 65 percent of your total daily calories should come from carbohydrates. This is especially true if you exercise.\n" +
                "Consuming the right kind of carbohydrates is important. Many people rely on the simple carbs found in sweets and processed foods. Instead, you should focus on eating the complex carbs found in whole grains, fruits, vegetables, and beans.\n" +
                "Whole grains have more staying power than refined grains because you digest them more slowly.\n" +
                "They can help you feel full for longer and fuel your body throughout the day. They can also help stabilize your blood sugar levels. Finally, these quality grains have the vitamins and minerals you need to keep your body running at its best.\n";

        stringBuilder2.append(someContent2);
        content2.setText(stringBuilder2.toString());

        title3.setText("PACK PROTEIN INTO YOUR SNACKS AND MEALS ");

        StringBuilder stringBuilder3= new StringBuilder();

        String someContent3="Protein is needed to help keep your body growing, maintained, and repaired. For example, the University of Rochester Medical Center reports that red blood cells die after about 120 days.\n" +
                "Protein is also essential for building and repairing muscles, helping you enjoy the benefits of your workout. It can be a source of energy when carbohydrates are in short supply, but it’s not a major source of fuel during exercise.\n" +
                "Adults need to eat about 0.8 grams of protein per day for every kilogram of their body weight, reports Harvard Health Blog. That’s equal to about 0.36 grams of protein for every pound of body weight. Exercisers and older adults may need even more.\n" +
                "Protein can come from:\n" +
                "•\tpoultry, such as chicken and turkey\n" +
                "•\tred meat, such as beef and lamb\n" +
                "•\tfish, such as salmon and tuna\n" +
                "•\tdairy, such as milk and yogurt\n" +
                "•\tlegumes, such as beans and lentils\n" +
                "•\teggs\n" +
                "For the healthiest options, choose lean proteins that are low in saturated and trans fats. Limit the amount of red meat and processed meats that you eat.\n";

        stringBuilder3.append(someContent3);
        content3.setText(stringBuilder3.toString());

        title4.setText("BOOST YOUR FOOD AND VEGETABLE INTAKE ");

        StringBuilder stringBuilder4= new StringBuilder();

        String someContent4="Fruits and vegetables are rich sources of natural fiber, vitamins, minerals, and other compounds that your body needs to function properly. They’re also low in calories and fat.\n" +
                "Aim to fill half your plate with fruits and veggies at every meal, recommends the United States Department of Agriculture.\n" +
                "Try to “eat the rainbow” by choosing fruits and veggies of different colors. This will help you enjoy the full range of vitamins, minerals, and antioxidants that the produce aisle has to offer.\n" +
                "Every time you go to the grocery store, consider choosing a new fruit or vegetable to try. For snacks, keep dried fruits in your workout bag and raw veggies in the fridge.\n";

        stringBuilder4.append(someContent4);
        content4.setText(stringBuilder4.toString());

        title5.setText("CHOOSE HEALTHY FATS ");

        StringBuilder stringBuilder5= new StringBuilder();

        String someContent5="Unsaturated fats may help reduce inflammation and provide calories.\n" +
                "While fat is a primary fuel for aerobic exercise, we have plenty stored in the body to fuel even the longest workouts. However, getting healthy unsaturated fats helps to provide essential fatty acids and calories to keep you moving.\n" +
                "Healthy options include:\n" +
                "•\tnuts\n" +
                "•\tseeds\n" +
                "•\tavocados\n" +
                "•\tolives\n" +
                "•\toils, such as olive oil\n";

        stringBuilder5.append(someContent5);
        content5.setText(stringBuilder5.toString());

        title6.setText("FUEL UP BEFORE EXERCISE ");

        StringBuilder stringBuilder6= new StringBuilder();

        String someContent6="When it comes to fueling up before or after a workout, it’s important to achieve the right balance of carbs and protein. Pre-workout snacks that combine carbohydrates with protein can make you feel more energized than junk foods made from simple sugars and lots of fat.\n" +
                "Consider stocking your workout bag and refrigerator with some of these simple snacks:\n" +
                "Bananas\n" +
                "Bananas are full of potassium and magnesium, which are important nutrients to get on a daily basis. Eating a banana can help replenish these minerals while providing natural sugars to fuel your workout. For added protein, enjoy your banana with a serving of peanut butter.\n" +
                "Berries, grapes, and oranges\n" +
                "These fruits are all full of vitamins, minerals, and water. They’re easy on your intestines, give you a quick boost of energy, and help you stay hydrated. Consider pairing them with a serving of yogurt for protein.\n" +
                "Nuts\n" +
                "Nuts are a great source of heart-healthy fats and also provide protein and essential nutrients. They can give you a source of sustained energy for your workout.\n" +
                "Pair them with fresh or dried fruit for a healthy dose of carbohydrates. However, test these options to see how they settle. High-fat foods can slow digestion, and they may make food sit in your stomach too long if your workout is coming up quickly.\n" +
                "Nut butter\n" +
                "Many grocery stores carry single-serving packets of peanut butter that don’t require refrigeration and can be easily stored in a gym bag. For a tasty protein-carbohydrate combo, you can spread peanut butter on:\n" +
                "•\tan apple\n" +
                "•\ta banana\n" +
                "•\twhole-grain crackers\n" +
                "•\ta slice of whole-grain bread\n" +
                "If you don’t like peanut butter, try almond butter, soy butter, or other protein-rich alternatives.\n ";

        stringBuilder6.append(someContent6);
        content6.setText(stringBuilder6.toString());

        title7.setText("DON'T CUT TOO MANY CALORIES ");

        StringBuilder stringBuilder7= new StringBuilder();

        String someContent7="If you’re trying to lose weight or tone your body, you may be tempted to cut a ton of calories from your meals. Cutting calories is a key part of weight loss, but it’s possible to go too far.\n" +
                "Weight loss diets should never leave you feeling exhausted or ill. Those are signs that you’re not getting the calories you need for good health and fitness.\n" +
                "According to the National Heart, Lung, and Blood Institute, a diet containing 1,200 to 1,500 daily calories is suitable for most women who are trying to lose weight safely. A diet with 1,500 to 1,800 daily calories is appropriate for most men who are trying to shed excess pounds.\n" +
                "If you’re very active or you don’t want to lose weight while getting fit, you may need to eat more calories. Talk to your doctor or a dietitian to learn how many calories you need to support your lifestyle and fitness goals.\n";


        stringBuilder7.append(someContent7);
        content7.setText(stringBuilder7.toString());

        title8.setText("BALANCE IS KEY ");

        StringBuilder stringBuilder8= new StringBuilder();

        String someContent8="As you settle into an active lifestyle, you’ll probably discover which foods give you the most energy and which have negative effects. The key is learning to listen to your body and balancing what feels right with what’s good for you.\n" +
                "Follow these tips:\n" +
                "•\tAim to make breakfast a part of your routine.\n" +
                "•\tChoose complex carbohydrates, lean protein sources, healthy fats, and a wide variety of fruits and veggies.\n" +
                "•\tStock your fridge and gym bag with healthy workout snacks.\n" +
                "The right balance of carbohydrates, protein, and other nutrients can help fuel your exercise routine.\n";

        stringBuilder8.append(someContent8);
        content8.setText(stringBuilder8.toString());

        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GeneralFitness.this,FourthActivity.class);
                startActivity(intent);
            }
        });


    }
}
