package com.example.anika.eatandfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class DatabaseActivityVeg extends AppCompatActivity {

   Button b1;
   TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_veg);

        b1 = (Button)findViewById(R.id.b1);
        textView=(TextView)findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

        final DatabaseHandlerVeg db=new DatabaseHandlerVeg(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<VegRecipe>myrecipeList=db.getAllRecipe();

                db.addVegRecipe(new VegRecipe("VEGETABLE ROLL:","Vegetable oil-1 tbsp; Onion, chopped-1;\tGinger, chopped-1 teaspoon; Garlic, chopped-1 teaspoon; Cabbage, grated-1 cup; Carrot, grated-1/4 cup; Capsicum, chopped\t-1/4 cup; Cauliflower, grated-1/4 cup; Pepper powder-1/2 teaspoon; Soya sauce-1 teaspoon; Salt to taste; Green Chilly-2; All purpose flour-1 cup; Vegetable oil-2 tbsp plus for deep frying the roll.","In a broad bowl, add flour, 2tbsp oil and salt. Mix it well, and add a little water at a time and knead the flour to make a stiff dough. Cover the dough with the wet muslin cloth and keep it aside for 15-20 minutes. Meanwhile, we can prepare the stuffing for the roll. Chop the vegetables finely or you can grate the veggies. Heat the pan with oil and saute with onion, ginger and garlic. Fry it till the onions are translucent in the color. Add capsicum, cabbage, carrot and cauliflower." ));
                db.addVegRecipe(new VegRecipe("VEGETABLE FRIED RICE:","Basmati Rice-1 cup boiled; Capsicum (chopped)-2 medium size; Cabbage (chopped)-2 cup; Spring Onion (chopped)-1 cup; French Beans(chopped)-1 cup; Onion-1; Cumin Seeds-1/2 teaspoon; Soya Sauce-2 teaspoon; Salt To taste; Carrot-250 gram; Red Chilli-1 teaspoon.","Soak basmati rice for half an hour and cook rice . Cool and make the grains separate. Then chopped vegetables as shown below. Heat olive oil in a pan , add cumin seeds and chopped onions . Stir For a Minute. Then add chopped Vegetables and Talmakhana , stir for 2 –3 minutes . Lastly add soya sauce , salt , red chilli powder . Fry for 5 more Minutes , All the process has to be done in high flame. Transfer this to the cooled rice and mix well . Serve Hot With Vegetable Manchurian. Don’t over fry the veggies, retain its colour and crunchiness. Enjoy!!!"));

                String result = "";
                for(VegRecipe vegRecipe : myrecipeList)
                {
                    result +="Id: "+ vegRecipe.get_id()+" Name: "+vegRecipe.get_name()+" Ingredients: "+ vegRecipe.get_ingredients()+" Method "+vegRecipe.get_method();
                    result +="\n";
                    Log.d("Result",result);
                }
                if(myrecipeList.size()  == 0)
                {
                    result = "No contact to display.";
                }
                textView.setText(result);


            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        notify("onStart");
    }


    @Override
    protected void onPause() {
        super.onPause();
        notify("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        notify("onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        notify("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        notify("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        notify("onDestroy");
    }

   /* @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        notify("onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        notify("onSaveInstanceState");
    }*/

    private void notify(String methodName) {
        Log.d("Demo-MainActivity: ",methodName);
    }

}
