package com.example.anika.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Diabetes_Care extends AppCompatActivity {

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

    private Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes__care);

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


        heading.setText("DIABETES CARE ");
        title1.setText(" BEST DIET PLAN FOR DIABETIC PATIENT ");



        StringBuilder stringBuilder= new StringBuilder();

        String someContent="Diabetes has today become rampant among both men and women all across the globe. It is imperative to know more about the disease and how the same can be controlled. Let us understand the very meaning of diabetes first. Diabetes is a disease which is caused either due to the lack of proper production of insulin by the pancreas or due to the improper use of insulin in the human body. This gives rise to the blood sugar level or the glucose level in the body since the hormone insulin is responsible for the essential breakdown of carbohydrates and fats which, in turn, help in maintaining the required level of sugar and glucose in the blood.\n" +
                "There are two main types of diabetes: Type 1 diabetes and Type 2 diabetes. It is often very complicated to deal with the condition. The reason being that when a person is suffering from diabetes, he or she tends to develop conditions which give rise to other complications in the body. Most serious amongst these complications include cardiovascular diseases, kidney-related diseases, diabetic eye, nerve damage, etc. Hence it is of prime importance that we use means and methods to control the condition.\n" +
                "In this article, we shall analyze the diet plan which is recommended by experts for a diabetes patient. We shall further study the details and delve inside and check what is the best and most preferred diet plan for a diabetic patient. Join in for the article ‘Diabetes Diet Chart: Best Diet Chart for Diabetic Patient.’\n" +
                "Table of Contents \n" +
                "•\tBreakdown of Nutrients Present in Food\n" +
                "•\tRelation of Fats with Blood Glucose\n" +
                "•\tRelation of Proteins with Blood Glucose\n" +
                "•\tRelation of Carbohydrates with Blood Glucose\n" +
                "•\tMeal Plan When You Are Suffering from Diabetes\n" +
                "•\tWhat are the Recommended Foods that Will Help to Manage Diabetes?\n" +
                "•\tVegetables\n" +
                "•\tProteins\n" +
                "•\tFiber\n" +
                "•\tBlueberries\n" +
                "•\tFish\n" +
                "•\tNuts\n" +
                "•\tApples\n" +
                "•\tGrapefruit\n" +
                "•\tBroccoli\n" +
                "•\tAsparagus\n" +
                "•\tCarrots\n" +
                "•\tTomatoes\n" +
                "•\tDifferent Type of Teas\n" +
                "•\tCinnamon\n" +
                "•\tOatmeal\n" +
                "•\tSome Tips To be Kept in Mind While Dealing with Diabetes as Far as Food is Concerned\n";

        stringBuilder.append(someContent);
        content1.setText(stringBuilder.toString());

        title2.setText("BREAKDOWN OF NUTRITIENTS PRESENT IN FOOD");

        StringBuilder stringBuilder1= new StringBuilder();

        String someContent2="Let us first begin by understanding more about food and the nutrients present in the food. We shall thereafter analyze the relationship between each of these nutrients with the level of blood glucose it has on the body.\n" +
                "Any basic food item consists of three most essential nutrients. The following are the nutrients:\n" +
                "\uF0A7\tFats\n" +
                "\uF0A7\tProteins and\n" +
                "\uF0A7\tCarbohydrates\n" +
                "Let us now analyze in the following paragraphs how each of these affects the level of blood glucose in the body, and thereby diabetes.\n";

        stringBuilder1.append(someContent2);
        content2.setText(stringBuilder1.toString());

        title3.setText("RELATIONS OF FAT WITH BLOOD GLUCOSE");

        StringBuilder stringBuilder3= new StringBuilder();

        String someContent3="Let us first look into the relationship of fats with the blood glucose of the body.\n" +
                "A few fat does not affect the blood glucose of the body to a large extent. However, one should have fats in a limited amount because these food does affect and slower down the process of digestion with the result that the level of glucose or sugar in the blood rises.\n" +
                "Following are some of the benefits that you derive when you have fat in the food you intake:\n" +
                "\uF0A7\tFats are useful as they slow down the absorption of carbohydrates. This goes a long way in helping to maintain balanced level of blood glucose in the body\n" +
                "\uF0A7\tYou can manage and remain far away from overeating when you have had fat. The reason for the same is that you feel a lot more satisfied when your diet contains fat\n" +
                "\uF0A7\tOlive oil, nuts are known to contain fat as well. However, these are essential fats which our body requires because that will go a long way in helping to avoid other diseases.\n";

        stringBuilder3.append(someContent3);
        content3.setText(stringBuilder3.toString());

        title4.setText("RELATIONS OF PROTEINS WITH BLOOD GLUCOSE ");


        StringBuilder stringBuilder4= new StringBuilder();

        String someContent4="Let us now try to understand the relationship between blood glucose level and proteins in food.\n" +
                "Proteins affect the body glucose once you eat too much quantity of the same. You should carefully intake only the recommended quantity of protein, which in most cases is around 6 ounces\n";

        stringBuilder4.append(someContent4);
        content4.setText(stringBuilder4.toString());

        title5.setText("RELATIONS OF CARBOHYDRATE WITH BLOOD GLUCOSE ");


        StringBuilder stringBuilder5= new StringBuilder();

        String someContent5="It is this nutrient which affects the blood glucose of our body more than any other nutrient present in food. The carbohydrates present in the food turn into sugar much quickly when compared to the other nutrients mentioned above and therefore it is of utmost importance that you limit the intake of this nutrient. It is also the quantum of carbohydrates intake which will determine the amount of insulin which needs to be taken by those who suffer from diabetes.\n" +
                "Following is the list of recommended carbohydrates for a person suffering from the condition:\n" +
                "\uF0A7\tBrown Rice\n" +
                "\uF0A7\tOatmeal\n" +
                "\uF0A7\tBeans\n" +
                "\uF0A7\tLentils\n" +
                "\uF0A7\tWhole Wheat\n";

        stringBuilder5.append(someContent5);
        content5.setText(stringBuilder5.toString());

        title6.setText("MEAL PLAN WHEN YOU ARE SUFFERING FROM DIABETES ");

        StringBuilder stringBuilder6= new StringBuilder();

        String someContent6="When you are someone who is dealing with diabetes, experts recommend that you include the following types of meal in your daily diet:\n" +
                "\uF0A7\tWhole-grain carbohydrates and take the dosage on insulin accordingly\n" +
                "\uF0A7\tColorful foods as they are often very high in essential nutrients\n" +
                "\uF0A7\tMediterranean foods and diet plan which shall include vegetables, a few fruits, plant based fats such as olive oil and nuts, meat and dairy products to be consumed only occasionally.\n" +
                "\uF0A7\tFoods which are low in glycemic index\n" +
                "Also, keep in mind the following points regarding a meal plan for diabetes:\n" +
                "\uF0A7\tThe above dietary plan is something which is recommended not only for dealing with diabetes but is something which is considered healthy in general. The only difference being, that when you are dealing with diabetes, you should be more mindful about the total consumption of carbohydrates as part of your regular meal plan.\n" +
                "\uF0A7\tMake sure that when you are consuming food which has carbohydrates in them, the glycemic load present therein should be low in such foods\n" +
                "\uF0A7\tThe consumed fats and proteins should ideally come from the plants. This is helpful in managing diabetes to a great extent\n" +
                "\uF0A7\tFor every calorie consumed, you need to make sure you get all the essential vitamin, nutrient, and fiber.\n";


        stringBuilder6.append(someContent6);
        content6.setText(stringBuilder6.toString());

        prev=(Button)findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Diabetes_Care.this,FourthActivity.class);
                startActivity(intent);
            }
        });
    }



}
