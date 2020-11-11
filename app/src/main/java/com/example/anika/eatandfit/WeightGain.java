package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeightGain extends AppCompatActivity {

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
    private TextView title8;
    private TextView content8;
    private Button prev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_gain);

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
        title8=(TextView)findViewById(R.id.title8);
        content8=(TextView)findViewById(R.id.content8);


        heading.setText("WEIGHT GAIN TIPS ");



        title1.setText("HOW TO GAIN WEIGHT FAST AND SAFELY ");

        StringBuilder stringBuilder1= new StringBuilder();

        String someContent1="About two thirds of people in the US are either overweight or obese (1).\n" +
                "However, there are also many people with the opposite problem of being too skinny (2).\n" +
                "This is a concern, as being underweight can be just as bad for your health as being obese.\n" +
                "Additionally, many people who are not clinically underweight still want to gain some muscle.\n" +
                "Whether you’re clinically underweight or simply struggling to gain muscle weight, the main principles are the same.\n" +
                "This article outlines a simple strategy to quickly gain weight — the healthy way.\n";
        stringBuilder1.append(someContent1);
        content1.setText(stringBuilder1.toString());

        title2.setText("WHAT DOES UNDERWEIGHT REALLY MEANS?");

        StringBuilder stringBuilder2= new StringBuilder();

        String someContent2="Being underweight is defined as having a body mass index (BMI) below 18.5. This is estimated to be less than the body mass needed to sustain optimal health.\n" +
                "Conversely, over 25 is considered overweight and over 30 is considered obese.\n" +
                "Use this calculator to see where you fit on the BMI scale (opens in a new tab).\n" +
                "However, keep in mind that there are many problems with the BMI scale, which only looks at weight and height. It does not take muscle mass into account.\n" +
                "Some people are naturally very skinny but still healthy. Being underweight according to this scale does not necessarily mean that you have a health problem.\n" +
                "Being underweight is about 2–3 times more common among girls and women, compared to men. In the US, 1% of men and 2.4% of women 20 years and older are underweight (2).\n" +
                "SUMMARY Being underweight is defined as having a body mass index (BMI) below 18.5. It’s much more common in women and girls.\n";
        stringBuilder2.append(someContent2);
        content2.setText(stringBuilder2.toString());

        title3.setText("HOW TO GAIN WEIGHT IN HEALTHY WAY");

        StringBuilder stringBuilder3= new StringBuilder();

        String someContent3="If you want to gain weight, it’s very important to do it right.\n" +
                "Binging on soda and donuts may help you gain weight, but it can destroy your health at the same time.\n" +
                "If you’re underweight, you want to gain a balanced amount of muscle mass and subcutaneous fat rather than a lot of unhealthy belly fat.\n" +
                "There are plenty of normal-weight people who get type 2 diabetes, heart disease and other health problems often associated with obesity (11).\n" +
                "Therefore, it’s absolutely essential to eat healthy foods and live an overall healthy lifestyle.\n" +
                "The next chapter looks at several effective ways to gain weight fast, without ruining your health at the same time.\n" +
                "SUMMARY It’s very important to eat mostly healthy foods even when you’re trying to gain weight.\n";
        stringBuilder3.append(someContent3);
        content3.setText(stringBuilder3.toString());

        title4.setText("EAT MORE CALORIES THAN YOUR BODY BURN ");

        StringBuilder stringBuilder4= new StringBuilder();

        String someContent4="The most important thing you can do to gain weight is to create a calorie surplus, meaning you eat more calories than your body needs.\n" +
                "You can determine your calorie needs using this calorie calculator.\n" +
                "If you want to gain weight slowly and steadily, aim for 300–500 calories more than you burn each day according to the calculator.\n" +
                "If you want to gain weight fast, aim for around 700–1,000 calories above your maintenance level.\n" +
                "Keep in mind that calorie calculators only provide estimates. Your needs may vary by several hundred calories per day, give or take.\n" +
                "You don't need to count calories for the rest of your life, but it helps to do it for the first few days or weeks to get a feel for how many calories you’re eating. There are many great tools out there to help you.\n" +
                "SUMMARY You need to eat more calories than your body burns to gain weight. Aim for 300–500 calories per day above your maintenance level for slow weight gain or 700–1,000 calories if you want to gain weight fast.\n";
        stringBuilder4.append(someContent4);
        content4.setText(stringBuilder4.toString());

        title5.setText("EAT PLENTY OF PROTEIN ");

        StringBuilder stringBuilder5= new StringBuilder();

        String someContent5="The single most important nutrient for gaining healthy weight is protein.\n" +
                "Muscle is made of protein and without it most of those extra calories may end up as body fat.\n" +
                "Studies show that during periods of overfeeding, a high-protein diet causes many of the extra calories to be turned into muscle (12).\n" +
                "However, keep in mind that protein is a double-edged sword. It’s also highly filling, which may reduce your hunger and appetite significantly, making it harder to get in enough calories (13, 14).\n" +
                "If you're trying to gain weight, aim for 0.7–1 grams of protein per pound of body weight (1.5–2.2 grams of protein per kilogram). You can even go above that if your calorie intake is very high.\n" +
                "High-protein foods include meats, fish, eggs, many dairy products, legumes, nuts and others. Protein supplements like whey protein can also be useful if you struggle to get enough protein in your diet.\n" +
                "SUMMARY Protein forms the building blocks of your muscles. Eating sufficient protein is required to gain muscle weight instead of just fat.\n";

        stringBuilder5.append(someContent5);
        content5.setText(stringBuilder5.toString());

        title6.setText("EAT ENERGY DENSE FOODS");

        StringBuilder stringBuilder6= new StringBuilder();

        String someContent6="Again, it’s very important to eat mostly whole, single-ingredient foods.\n" +
                "The problem is that these foods tend to be more filling than processed junk foods, making it harder to get in enough calories.\n" +
                "Using plenty of spices, sauces and condiments can help with this. The tastier your food is, the easier it is to eat a lot of it.\n" +
                "Also, try to emphasize energy-dense foods as much as possible. These are foods that contain many calories relative to their weight.\n" +
                "Here are some energy-dense foods that are perfect for gaining weight:\n" +
                "•\tNuts: Almonds, walnuts, macadamia nuts, peanuts, etc.\n" +
                "•\tDried fruit: Raisins, dates, prunes and others.\n" +
                "•\tHigh-fat dairy: Whole milk, full-fat yogurt, cheese, cream.\n" +
                "•\tFats and oils: Extra virgin olive oil and avocado oil.\n" +
                "•\tGrains: Whole grains like oats and brown rice.\n" +
                "•\tMeat: Chicken, beef, pork, lamb, etc. Choose fattier cuts.\n" +
                "•\tTubers: Potatoes, sweet potatoes and yams.\n" +
                "•\tDark chocolate, avocados, peanut butter, coconut milk, granola, trail mixes.\n" +
                "Many of these foods are very filling, and sometimes you may need to force yourself to keep eating even if you feel full.\n" +
                "It may be a good idea to avoid eating a ton of vegetables if gaining weight is a priority for you. It simply leaves less room for energy-dense foods.\n" +
                "Eating whole fruit is fine, but try to emphasize fruit that doesn't require too much chewing, such as bananas.\n" +
                "If you need more suggestions, consider reading this article on 18 healthy foods to gain weight fast.\n" +
                "SUMMARY You can add sauces, spices and condiments to your foods to make it easier to eat more. Base your diet on energy-dense foods as much as possible.\n";



        stringBuilder6.append(someContent6);
        content6.setText(stringBuilder6.toString());

        title7.setText("LIFT HEAVY WEIGHTS AND IMPROVE YOUR STRENGTHS ");

        StringBuilder stringBuilder7= new StringBuilder();

        String someContent7="To make sure that the excess calories go to your muscles instead of just your fat cells, it’s absolutely crucial to lift weights.\n" +
                "Go to a gym and lift 2–4 times per week. Lift heavy and try to increase the weights and volume over time.\n" +
                "If you’re completely out of shape or new to training, consider hiring a qualified personal trainer to help you get started.\n" +
                "You may also want to consult with a doctor if you have skeletal problems or any medical issue.\n" +
                "It’s probably best to take it easy on the cardio for now — focus mostly on the weights.\n" +
                "Doing some cardio is fine to improve fitness and well-being, but don't do so much that you end up burning all the additional calories you’re eating.\n" +
                "SUMMARY It’s very important to lift heavy weights and improve your strength. This will help you gain muscle mass instead of just fat.\n";


        stringBuilder7.append(someContent7);
        content7.setText(stringBuilder7.toString());

        title8.setText("10 MORE TIPS TO GAIN WEIGHT");

        StringBuilder stringBuilder8= new StringBuilder();

        String someContent8="Combining a high calorie intake with heavy strength training are the two most important factors.\n" +
                "That being said, there are several other strategies to gain weight even faster.\n" +
                "Here are 10 more tips to gain weight:\n" +
                "1.\tDon't drink water before meals. This can fill your stomach and make it harder to get in enough calories.\n" +
                "2.\tEat more often. Squeeze in an additional meal or snack whenever you can, such as before bed.\n" +
                "3.\tDrink milk. Drinking whole milk to quench thirst is a simple way to get in more high-quality protein and calories.\n" +
                "4.\tTry weight gainer shakes. If you’re really struggling then you can try weight gainer shakes. These are very high in protein, carbs and calories.\n" +
                "5.\tUse bigger plates. Definitely use large plates if you’re trying to get in more calories, as smaller plates cause people to automatically eat less.\n" +
                "6.\tAdd cream to your coffee. This is a simple way to add in more calories.\n" +
                "7.\tTake creatine. The muscle building supplement creatine monohydrate can help you gain a few pounds in muscle weight.\n" +
                "8.\tGet quality sleep. Sleeping properly is very important for muscle growth.\n" +
                "9.\tEat your protein first and vegetables last. If you have a mix of foods on your plate, eat the calorie-dense and protein-rich foods first. Eat the vegetables last.\n" +
                "10.\tDon't smoke. Smokers tend to weigh less than non-smokers, and quitting smoking often leads to weight gain.\n" +
                "SUMMARY There are several other things you can do to gain weight even faster. These include drinking milk, using weight gainer shakes, adding cream to your coffee and eating more often.\n";

        stringBuilder8.append(someContent8);
        content8.setText(stringBuilder8.toString());

        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WeightGain.this,FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}
