package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Metabolism extends AppCompatActivity {

    private TextView heading;

    private TextView title;
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

    private Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metabolism);

        heading=(TextView)findViewById(R.id.heading);

        title=(TextView)findViewById(R.id.title);
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
        prev=(Button)findViewById(R.id.prev);

        heading.setText("DIGESTION METABOLISM ");

        //title.setText("DIGESTIVE HEALTH DIET GUIDELINES");

        title1.setText("A FEW SIMPLE DIETARY TWEAKS CAN OFTEN GO A LONG WAY TOWARD IMPROVING DIGESTIVE HEALTH");

        StringBuilder stringBuilder1= new StringBuilder();

        String someContent1="A few simple dietary tweaks can often go a long way toward improving digestive health.\n" +
                "Digestive problems—from constipation to lactose intolerance—affect up to 70 million people, according to the National Institutes of Health. Modifying your diet to treat a digestive problem requires a lot of trial and error and should be done in conjunction with your health-care provider. Still, making a few simple dietary changes (e.g., eating a healthful diet rich in fiber and making sure to drink plenty of fluids) often can go a long way in improving your digestive health. The nutrition experts at EatingWell recommend following these guidelines for healthy digestion.\n" +
                "Eat plenty of fiber.\n" +
                "Fiber adds bulk to the stool and helps it move through the colon quicker, which helps prevent digestive problems like constipation and diarrhea. A fiber-rich diet may also play a part in lowering your risk of colon and rectal cancer. Shoot for 25 to 30 grams of fiber per day—most Americans only get half that—by eating plenty of fruits and vegetables, whole grains and beans. If you have trouble getting enough fiber in your diet, consider a fiber supplement. [Note: Eating high-fiber foods is a healthy choice for most people, but they can exacerbate symptoms of a few digestive conditions. If you’ve ever received medical treatment for a digestive problem, check with your health-care provider before you start loading up.]\n" +
                "Fill up on fluids.\n" +
                "Liquids lubricate the colon and soften stool so it’s easier to pass, helping to prevent constipation. Aim to drink at least 8 cups per day. Since it’s calorie-free, water is an excellent choice, but most beverages—such as milk and juice—are about 90 percent water, so they count too.\n" +
                "Go easy on fatty fare.\n" +
                "Too much fat slows digestion, which can lead to heartburn, bloating and constipation. What’s more, research suggests that a diet high in saturated fat may increase your risk of colon cancer.\n" +
                "Watch alcohol intake.\n" +
                "Drinking too much alcohol can irritate your stomach lining and relax your lower esophageal sphincter—the valve that prevents stomach acid from backing up into your esophagus. This can cause bleeding or heartburn. If you drink, do so in moderation—no more than one drink a day for women or two drinks a day for men. Alcohol is also dehydrating, which can worsen constipation\n";

        stringBuilder1.append(someContent1);
        content1.setText(stringBuilder1.toString());

        title2.setText("3 TIPS TO IMPROVE YOUR DIGESTION ");
        StringBuilder stringBuilder2= new StringBuilder();

        String someContent2="1. Eat mindfully\n" +
                "\n" +
                "Give your food the time and attention it deserves. Make a rule never to eat on the go, or when your attention is directed elsewhere. Take the time to notice the textures and flavours of your food and chew it properly – the first step in digestion. Being distracted by TV, laptops or smartphones means that you're more likely to absent-mindedly snack. Read more about how to eat mindfully.\n" +
                "2. Eat probiotics and prebiotics\n" +
                "\n" +
                "Choose wisely, focusing on foods that supply good gut bacteria (probiotics) as well as the fuel these bacteria need to thrive (prebiotics). The peanut butter breakfast pots in our Healthy Diet Plan are perfect – rich in resistant starch (from the oats) which feeds the beneficial gut bacteria. The bio yogurt provides a tasty probiotic start to your day.\n" +
                "3. Eat lightly at night\n" +
                "\n" +
                "If you're eating late, a lighter dinner can help to satiate hunger without making you feel uncomfortably full, so you're more likely to drift off to sleep easily. The dinners in our Healthy Diet Plan are light and flavoursome, including a tasty vegetarian pasta dish and herby stuffed chicken breasts.\n";

        stringBuilder2.append(someContent2);
        content2.setText(stringBuilder2.toString());

        title3.setText("BEST WAYS TO BOOST YOUR METABOLISM ");

        StringBuilder stringBuilder3= new StringBuilder();

        String someContent3="Some people can eat more than others without gaining weight, a question of metabolism. It is unfair. Yes, it is unfair but not irremediable. Because even if your basic metabolism does not break bricks, you can do something to boost it. Check this fast metabolism diet plan that effectively helps in fat burning and fat cell shrinking";

        stringBuilder3.append(someContent3);
        content3.setText(stringBuilder3.toString());

        title4.setText("MEANING OF METABOLISM ");

        StringBuilder stringBuilder4= new StringBuilder();

        String someContent4="Metabolism is all the biochemical processes that take place in all cells and organs to convert nutrients into energy. Increasing your metabolism leads to greater caloric expenditure, which allows you to lose weight and stay slim.\n" +
                "The correct effect on metabolism is one of the most important ways to maintain health. The structure of our figure, the health of the organism as a whole, and the individual body of each organ depends on it. It is believed that every 10 years of metabolism tends to slow down by 10% – it does not depend on us at all, but knowing certain rules, we may well support it or even accelerate it.\n";

        stringBuilder4.append(someContent4);
        content4.setText(stringBuilder4.toString());

        title5.setText("CONSIDER THE EXISTING WAYS TO IMPROVE AND ACCELERATE METABOLISM ");

        StringBuilder stringBuilder5= new StringBuilder();

        String someContent5="Red Detox Tea is the best drink to stimulate metabolism. Filled with antioxidants, this drink improves blood circulation and helps the body burn fat. In order to feel the benefits, you must drink 2 to 3 cups daily. Add some natural homemade ice cream to make it an iced thirst-quencher during the summer!\n" +
                "The best feature of the Red Detox Tea is its natural wholesomeness. Red Detox Tea is not like any other of its kind available out there. It comes with the right combination and proportion of healthy food, ancient recipe, good fitness and detoxification – the fast metabolism diet plan pdf, all in a single pack, which when relied on and followed correctly, will never fail, but provides a robust boost in your body metabolism.\n" +
                " \n" +
                " \n" +
                " \n" +
                "•\tPhysical load\n" +
                " \n" +
                "You can regenerate muscle tissue and accelerate the rate of metabolism by regular exercises with weight loss. Running, lifting loads – it will accelerate metabolism.\n" +
                "Any physical activity, such as walking or riding a bike, helps to burn fat – and even more than an hour after its cessation. In order to spend calories, you do not even need excessive physical activity or special exercises. Any lessons will fit.\n" +
                "It does not necessarily have to be training on simulators or hiking in the fitness club. Ordinary walking, swimming, walks, sex or gardening will be suitable for this.\n" +
                " \n" +
                " \n" +
                "•\tThe rest and sleep\n" +
                " \n" +
                "Do not skip your rest time. A study conducted by an American university showed that people sleeping an average of 4 hours a night or less have difficulty metabolizing carbohydrates.\n" +
                "From 6 am and noon, the processes work at a maximum, so at this time you need to spend as much time as possible. And the dream itself is useful in growing thin. During sleep, the body produces a growth hormone, which also accelerates the exchange process, burns calories. Also, the metabolism is accelerated by updating the brain cells during sleep.\n" +
                "A tired, exhausted body does not burn calories efficiently but rather result in a slowed down metabolism.\n" +
                " \n" +
                "\n" +
                " \n" +
                " \n" +
                "•\tCorrect breakfast\n" +
                " \n" +
                "It is generally well known that if you regularly skip breakfast, you can recover, the body will feel the future hunger and begins to save energy, which slows down the metabolism. The morning meal accelerates metabolic processes in the body. But the rules of eating breakfast in Red Tea Detox fast metabolism diet plan pdf are quite different. If you want to lose weight quickly, this detox plan will not disappoint you.\n" +
                "However, do not forget to eat lightweight low-calorie foods.\n" +
                " \n" +
                " \n" +
                "•\tEasy dinner\n" +
                " \n" +
                "In the evening, the metabolic processes slow down a bit, but not completely, so you must have dinner, 2-3 hours before bedtime.\n" +
                "And it consists of light products, you cannot eat fruits and drink juices for dinner. However, in the evening you can drink Red Detox Tea because it does not contain calories and has many other medicinal properties. It does not contain caffeine so you can easily fall asleep. It is recommended to drink 6 cups of this tea per day.\n" +
                " \n" +
                "\n" +
                " \n" +
                " \n" +
                "•\tProteins\n" +
                " \n" +
                "Remember to consume 1 gram of protein per 500g of lean body mass on a daily basis. For example, if your lean body mass is 50 kg, you will consume 100 grams of protein each day. Whey powder is an ideal protein supplement because it is quickly absorbed by the body.\n" +
                "Research has shown that high protein intake can significantly boost metabolism, and enough to burn an extra 150-200 calories each day.\n" +
                " \n" +
                " \n" +
                "•\tLiquid\n" +
                " \n" +
                "Water – an important participant in the process of metabolism, it suppresses appetite, helps the metabolism to recycle already deferred fats. Water is the basis of metabolism.\n" +
                "Lack of fluid slows metabolism, so the liver begins to recover it, and not burn fat. The Red Tea Detox fast metabolism diet plan pdf describes in detail the importance of hydrating and drinking a red beverage from five herbs that flushes toxins from the body while maintaining body hydration.\n" +
                "The combination of five herbs in Red Detox Tea speeds up metabolism and, in addition to accelerating fat cell shrinking and appetite suppression, very beneficial effects on digestion and general health.\n" +
                " \n" +
                "\n" +
                " \n" +
                " \n" +
                "•\tAnti-cellulite and force massage\n" +
                " \n" +
                "During such massage, the blood is dispersed and the lymph is pumped, and eventually, the metabolism will be greatly accelerated. If you massage with a gel, your skin will become more elastic.\n" +
                "Also, to boost metabolism is useful honey massage and a vacuum that will remove the liquid and toxins.\n" +
                "Vacuum massage improves blood microcirculation in tissues, accelerates metabolism, promotes local elimination of excess fluid and toxins.\n" +
                " \n" +
                " \n" +
                "•\tThe HIIT:\n" +
                " \n" +
                "Practice HIIT (High-Intensity Interval Training). HIIT can burn fat at an accelerated rate.\n" +
                "Because of the intensity of this type of training, limit your sessions to 25 minutes maximum. Practice preferably on an empty stomach to promote the loss of fat reserves, which will serve as energy to your body.\n" +
                "Special exercises for accelerated fat burning can also be found in Red Tea Detox fast metabolism diet plan pdf.\n";
        stringBuilder5.append(someContent5);
        content5.setText(stringBuilder5.toString());

        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Metabolism.this,FourthActivity.class);
                startActivity(intent);
            }
        });

    }
}
