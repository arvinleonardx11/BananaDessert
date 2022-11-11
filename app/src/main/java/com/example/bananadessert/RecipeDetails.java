package com.example.bananadessert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeDetails extends AppCompatActivity {

    TextView name,intro,ingredients,instruction;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);

        name=(TextView)findViewById(R.id.tvname);
        intro=(TextView)findViewById(R.id.tvintro);
        ingredients=(TextView)findViewById(R.id.tvingredients);
        instruction=(TextView)findViewById(R.id.tvinstruction);
        image=(ImageView)findViewById(R.id.ivimage);

        Bundle mBundle=getIntent().getExtras();

        if(mBundle!=null){
            name.setText(mBundle.getString("Name"));
            intro.setText(mBundle.getString("Intro"));
            ingredients.setText(mBundle.getString("Ingredient"));
            instruction.setText(mBundle.getString("Instruction"));
            image.setImageResource(mBundle.getInt("Image"));
        }
    }
}