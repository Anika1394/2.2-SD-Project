package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnemiaCare extends AppCompatActivity {

    private TextView heading;


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
        setContentView(R.layout.activity_anemia_care);

        heading=(TextView)findViewById(R.id.heading);


        title1=(TextView)findViewById(R.id.title1);
        content1=(TextView)findViewById(R.id.content1);
        title2=(TextView)findViewById(R.id.title2);
        content2=(TextView)findViewById(R.id.content2);
        title3=(TextView)findViewById(R.id.title3);
        content3=(TextView)findViewById(R.id.content3);


        heading.setText("ANEMIA CARE ");



        title1.setText("WHAT IS ANEMIA?");

        StringBuilder stringBuilder1= new StringBuilder();

        String someContent1="Anemia is a condition that develops when your blood lacks enough healthy red blood cells or hemoglobin. Hemoglobin is a main part of red blood cells and binds oxygen. If you have too few or abnormal red blood cells, or your hemoglobin is abnormal or low, the cells in your body will not get enough oxygen. Symptoms of anemia -- like fatigue -- occur because organs aren't getting what they need to function properly.\n" +
                "Anemia is the most common blood condition in the U.S. It affects about 5.6% of the people in the U.S. Women, young children, and people with chronic diseases are at increased risk of anemia. Important factors to remember are:\n" +
                "•\tCertain forms of anemia are hereditary and infants may be affected from the time of birth.\n" +
                "•\tWomen in the childbearing years are particularly susceptible to iron-deficiency anemia because of the blood loss from menstruation and the increased blood supply demands during pregnancy.\n" +
                "•\tOlder adults also may have a greater risk of developing anemia because of poor diet and other medical conditions.\n" +
                "There are many types of anemia. All are very different in their causes and treatments. Iron-deficiency anemia, the most common type, is very treatable with diet changes and iron supplements. Some forms of anemia -- like the mild anemia that develops during pregnancy -- are even considered normal. However, some types of anemia may present lifelong health problems.\n" +
                "What Causes Anemia?\n" +
                "There are more than 400 types of anemia, which are divided into three groups: \n" +
                "•\tAnemia caused by blood loss\n" +
                "•\tAnemia caused by decreased or faulty red blood cell production\n" +
                "•\tAnemia caused by destruction of red blood cells \n";
        stringBuilder1.append(someContent1);
        content1.setText(stringBuilder1.toString());

        title2.setText("ANEMIA DIET PLAN");

        StringBuilder stringBuilder2= new StringBuilder();

        String someContent2="Anemia treatment plans often include dietary changes. The best diet plan for anemia includes foods rich in iron and other vitamins essential to hemoglobin and red blood cell production. It should also include foods that help your body absorb iron better.\n" +
                "There are two types of iron in foods: heme iron and nonheme iron. Heme iron is found in meat, poultry, and seafood. Nonheme iron is found in plant foods and foods fortified with iron. Your body can absorb both types, but it absorbs heme iron more easily.\n" +
                "Although anemia treatment plans are individualized, most require 150 to 200 milligrams of iron daily. It’s hard to get these levels through diet alone. You may also need to take prescription iron or an over-the-counter iron supplement until your levels are replenished.\n" +
                "Add these foods to your diet to get more iron and help fight iron deficiency anemia:\n" +
                "1. Leafy greens\n" +
                "Leafy greens, especially dark ones, are among the best sources of nonheme iron. They include:\n" +
                "•\tspinach\n" +
                "•\tkale\n" +
                "•\tcollard greens\n" +
                "•\tdandelion greens\n" +
                "•\tSwiss chard\n" +
                "Some leafy greens such as Swiss chard and collard greens also contain folate. A diet low in folate may cause folate-deficiency anemia. Citrus fruits, beans, and whole grains are good sources of folate.\n" +
                "When eating dark, leafy greens for iron, there’s a catch. Some greens high in iron, such as spinach and kale, are also high in oxalates. Oxalates are compounds that prevent the absorption of nonheme iron. So, while it’s beneficial to eat your greens as part of an overall anemia diet, don’t depend on them solely to treat the condition.\n" +
                "Vitamin C helps your stomach absorb iron. Eating leafy greens with foods that contain vitamin C such as oranges, red peppers, and strawberries, may increase iron absorption. Some greens are good sources of both iron and vitamin C, such as collard greens and Swiss chard.\n" +
                "2. Meat and poultry\n" +
                "All meat and poultry contain heme iron. Red meat, lamb, and venison are the best sources. Poultry and chicken have lower amounts. Eating meat or poultry with nonheme iron foods, such as leafy greens, can increase iron absorption.\n" +
                "3. Liver\n" +
                "Many people shy away from organ meats, but they’re a great source of iron. Liver is arguably the most popular organ meat. It’s rich in iron and folate. Some other iron-rich organ meats are heart, kidney, and beef tongue.\n" +
                "4. Seafood\n" +
                "Some seafood provides heme iron. Shellfish such as oysters, clams, and shrimp are good sources. Most fish contain iron. Fish high in iron include:\n" +
                "•\tsardines, canned in oil\n" +
                "•\tcanned or fresh tuna\n" +
                "•\tfresh salmon\n" +
                "•\tfresh halibut\n" +
                "•\tfresh perch\n" +
                "•\tfresh haddock\n" +
                "Shop for canned sardines and canned tuna online.\n" +
                "Although both fresh and canned salmon are good sources of iron, canned salmon is high in calcium. Calcium binds with iron and reduces its absorption. Foods high in calcium shouldn’t be eaten at the same time as iron-rich foods. Other examples of calcium-rich foods include:\n" +
                "•\traw milk\n" +
                "•\tyogurt\n" +
                "•\tkefir\n" +
                "•\tcheese\n" +
                "•\tsardines\n" +
                "•\tbroccoli\n" +
                "•\ttofu\n" +
                "5. Fortified foods\n" +
                "Many foods are fortified with iron. Add these foods to your diet if you’re a vegetarian or struggle to eat other sources of iron:\n" +
                "•\tfortified orange juice\n" +
                "•\tfortified, ready-to-eat cereals\n" +
                "•\tfoods made from fortified refined flour such as white bread\n" +
                "•\tfortified pasta\n" +
                "•\tfoods made from fortified cornmeal\n" +
                "•\tfortified white rice\n" +
                "6. Beans\n" +
                "Beans are good sources of iron for vegetarians and meat eaters alike. They’re also inexpensive and versatile. Some iron-rich options are:\n" +
                "•\tkidney beans\n" +
                "•\tchickpeas\n" +
                "•\tsoybeans\n" +
                "•\tblack-eyed peas\n" +
                "•\tpinto beans\n" +
                "•\tblack beans\n" +
                "•\tpeas\n" +
                "•\tlima beans\n" +
                "Shop for canned beans.\n" +
                "7. Nuts and seeds\n" +
                "Many types of nuts and seeds are good sources of iron. They taste great on their own or sprinkled on salads or yogurt. When choosing nuts and seeds, choose raw varieties whenever possible. Some nuts and seeds that contain iron are:\n" +
                "•\tpumpkin seeds\n" +
                "•\tcashews\n" +
                "•\tpistachios\n" +
                "•\themp seeds\n" +
                "•\tpine nuts\n" +
                "•\tsunflower seeds\n" +
                "Find raw pumpkin seeds, raw cashews, and raw pine nuts online.\n" +
                "Almonds are also a good source of iron. They’re great as part of a healthy eating plan, but since they’re also high in calcium, they may not increase your iron levels that much.\n";

        stringBuilder2.append(someContent2);
        content2.setText(stringBuilder2.toString());

        title3.setText("TAKEAWAY");

        StringBuilder stringBuilder3= new StringBuilder();

        String someContent3="No one food will cure anemia. But eating an overall healthy diet rich in dark, leafy greens, nuts and seeds, seafood, meat, and beans can help you get the iron you need to manage anemia.\n" +
                "A cast-iron skillet is an anemia diet plan staple. Foods cooked in cast iron absorb iron from the skillet. Acidic foods absorb the most iron, and foods cooked for short periods of time absorb the least.\n" +
                "When following a diet plan for anemia, remember these guidelines:\n" +
                "•\tDon’t eat iron-rich foods with foods or beverages that block iron absorption. These include coffee or tea, eggs, foods high in oxalates, and foods high in calcium.\n" +
                "•\tEat iron-rich foods with vitamin C-rich foods, such as oranges, tomatoes, or strawberries, to improve absorption.\n" +
                "•\tEat iron-rich foods with foods that contain beta carotene, such as apricots, red peppers, and beets, to improve absorption.\n" +
                "•\tEat a variety of heme and nonheme iron foods throughout the day to up your iron intake.\n" +
                "•\tEat heme and nonheme iron foods together whenever possible to increase iron absorption.\n" +
                "•\tAdd foods rich in folate and vitamin B-12 to support red blood cell production.\n";
        stringBuilder3.append(someContent3);
        content3.setText(stringBuilder3.toString());

        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AnemiaCare.this,FourthActivity.class);
                startActivity(intent);
            }
        });



    }
}
