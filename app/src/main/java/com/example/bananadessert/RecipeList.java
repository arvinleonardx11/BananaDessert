package com.example.bananadessert;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class RecipeList extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView mRecyclerView;
    List<RecipeInfo> myRecipeList;
    RecipeInfo mRecipeInfo;
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;
    private NavigationView nav_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        dl=(DrawerLayout)findViewById(R.id.dl);
        nav_view=(NavigationView)findViewById(R.id.nav_view);
        nav_view.bringToFront();
        abdt=new ActionBarDrawerToggle(this,dl,R.string.Open,R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();


        nav_view.setNavigationItemSelectedListener(this);
        nav_view.setCheckedItem(R.id.recipelist);

        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(RecipeList.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myRecipeList=new ArrayList<>();
        mRecipeInfo=new RecipeInfo("Turon","Turon is a type of Filipino snack. It is also called deep-fried banana rolls or banana lumpia. A typical Filipino meryenda and dessert, Turon has gained popularity throughout the years.","6 pieces bananas saba or plantains, cut in half (lengthwise)\n" +
                "1 cup jackfruit ripe, sliced\n" +
                "1 1/2 cup sugar\n" +
                "12 pieces lumpia wrapper\n" +
                "2 cups cooking oil","Roll the banana on the sugar plate and ensure that the banana is coated with enough sugar\n" +
                "Place the banana with sugar coating in the spring roll wrapper and add some ripe jackfruit\n" +
                "Fold and lock the spring roll wrapper, use water to seal the edge\n" +
                "In a pan, heat the oil and put-in some sugar.Wait until the brown sugar floats\n" +
                "Put-in the wrapped banana and fry until the wrapper turns golden brown and the extra sugar sticks on wrapper\n" +
                "Serve hot as a dessert or snack. Share and Enjoy!",R.drawable.turon);
        myRecipeList.add(mRecipeInfo);
        mRecipeInfo=new RecipeInfo("Minatamis na Saging","Minatamis na Saging is a dessert dish wherein plantains (locally known as “saging na saba”) are sweetened by cooking in a sweet mixture composed of water, brown sugar, salt, and vanilla extract.","4 pieces saba banana saging na saba\n" +
                "3/4 cup brown sugar\n" +
                "1 1/2 cups water\n" +
                "1 teaspoon vanilla extract\n" +
                "1/4 teaspoon salt","Heat a cooking pot and pour-in water then let boil.\n" +
                "Add brown sugar and stir until diluted.\n" +
                "Add salt and vanilla extract and mix well.\n" +
                "Put-in the plantains and adjust the heat to medium. Cover the cooking pot and simmer for 8 to 12 minutes or until the liquid thickens.\n" +
                "Turn-off heat and allow the plantains to cool.",R.drawable.sagingconhielo);
        myRecipeList.add(mRecipeInfo);
        mRecipeInfo=new RecipeInfo("Ginataang Saging at Sago","Ginataang Saging at Sago also known as Cooking Banana and Tapioca Pearls cooked in Coconut Milk is a delicious Filipino snack or dessert. This yummy dessert is so easy to make and only few ingredients needed.","1 cup water\n" +
                "1 can (13.5 ounces) coconut milk\n" +
                "1/4 teaspoon salt \n" +
                "1/2 cup sugar (or adjust to your liking)\n" +
                "1/2 to 1 tsp vanilla extract\n" +
                "3 cup cooking banana (saba)\n" +
                "2 cups cooked (tapioca pearls) sago ","How to cook Sago - Boil 4 cups of water. Add 1/2 cup little sago (tapioca pearls and stir. Cook over low heat while stirring occasionally for about 15 minutes. Cook longer if needed. Rinse in cold water and drain well to remove excess water. Set aside.\n" +
                "In a medium deep pan, add 1 cup of water. Simmer and add coconut milk, salt, sugar and vanilla extract. Simmer for few minutes. \n" +
                "Add banana saba and simmer for 5 minutes. Cook a little longer if needed while stirring gently occasionally. Add cooked sago and stir gently to combine. Cook for a minute. \n" +
                "Remove pan from heat and transfer in a serving bowl. Serve hot or cold and Enjoy! ",R.drawable.ginataangsagingatsago);
        myRecipeList.add(mRecipeInfo);
        mRecipeInfo=new RecipeInfo("Banana Chips","Banana chips are crisp slices of bananas that are usually consumed as a snack. The banana slices are deep fried; some are baked; while others are dehydrated.There are several Banana chips Recipe available that produces different results.","2 lbs raw bananas peeled (plantains are recommended)\n" +
                "3 to 4 cups cooking oil\n" +
                "1/2 teaspoon turmeric powder Optional\n" +
                "2 tablespoons water Optional\n" +
                "1 teaspoon salt Optional\n" +
                "Simple Syrup\n" +
                "1/2 cup water\n" +
                "1/2 cup white sugar\n" +
                "Cooking Procedure","In a bowl, combine 2 tablespoons of water, turmeric powder, and salt. Mix well and set aside.\n" +
                "Pour cooking oil in a wide pot and heat.\n" +
                "When the oil is hot, slice the bananas using a mandolin slicer and place a batch of sliced bananas in the hot oil.\n" +
                "Deep fry the banana until almost crisp. When the bananas are almost done, scoop a teaspoon of the turmeric mixture and gently add to the oil. Note: Be very careful. This is an optional step. Doing this can add a yellowish color to the banana slices and make it more crisp.\n" +
                "Once the oil stops bubbling, remove the bananas and drain excess oil. Set aside.\n" +
                "Meanwhile, lets make the simple syrup. Heat a saucepan and pour in 1/2 cup of water and 1/2 cup sugar.Let boil.\n" +
                "Gently stir the mixture and turn off the heat. Let cool.\n" +
                "Quickly dip the banana chips in the simple syrup. Drain the excess liquid after dipping.\n" +
                "Once the liquid dries-up, place the banana chips in a container, or serve right away.\n" +
                "Share and enjoy!",R.drawable.bananachips);
        myRecipeList.add(mRecipeInfo);
        mRecipeInfo=new RecipeInfo("Ginataang Bilo Bilo","Ginataang Bilo-bilo is a Filipino snack dish. It is composed of glutinous rice balls (locally known as bilo-bilo), coconut cream, sugar, sago pearls, and ripe jackfruit. Some people consider this as a simplified version of the Ginataang halo-halo.","20 pieces glutinous rice balls (Bilo-bilo)\n" +
                "20 oz jackfruit ripe, sliced\n" +
                "2 cups water\n" +
                "2 cups coconut cream\n" +
                "3/4 cup granulated white sugar\n" +
                "1 1/2 cups tapioca pearls cooked","Pour the water in a cooking pot. Bring to a boil.\n" +
                "Add the coconut cream. Stir and cook until the mixture starts to boil again.\n" +
                "Gradually stir-in the sugar.\n" +
                "Add the ripe jackfruit. Cover and cook in low heat for 15 minutes.\n" +
                "Add-in the bilo-bilo. Continue to cook for another 15 minutes while stirring every 3 minutes.\n" +
                "Put-in the sago. Cook for 3 to 5 minutes.\n" +
                "Transfer to a serving bowl. Serve.\n" +
                "Share and enjoy!",R.drawable.ginataan);
        myRecipeList.add(mRecipeInfo);
        Adapter myAdapter=new Adapter(RecipeList.this,myRecipeList);
        mRecyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onBackPressed() {
        if (dl.isDrawerOpen(GravityCompat.START)){
            dl.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Intent intent;
        if (id == R.id.home) {
            intent=new Intent(RecipeList.this,Dashboard.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.recipelist) {
            dl.closeDrawer(GravityCompat.START);
        } else if (id == R.id.settings) {
            intent=new Intent(RecipeList.this,Settings.class);
            startActivity(intent);
            finish();
        }
        return true;
    }
}