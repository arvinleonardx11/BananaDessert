package com.example.bananadessert;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;
    private NavigationView nav_view;
    private Button button;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        button=(Button) findViewById(R.id.recipebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecipeList();
            }
        });
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
        nav_view.setCheckedItem(R.id.home);

        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModels= new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.bananachips,"Banana Chips"));
        slideModels.add(new SlideModel(R.drawable.ginataan,"Ginataang Bilo Bilo"));
        slideModels.add(new SlideModel(R.drawable.ginataangsagingatsago,"Ginataang Saging at Sago"));
        slideModels.add(new SlideModel(R.drawable.sagingconhielo,"Minatamis na Saging"));
        slideModels.add(new SlideModel(R.drawable.turon,"Turon"));
        imageSlider.setImageList(slideModels,true);
    }
    public void openRecipeList(){
        Intent intent = new Intent(this,RecipeList.class);
        startActivity(intent);
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
            dl.closeDrawer(GravityCompat.START);
        } else if (id == R.id.recipelist) {
            intent=new Intent(this,RecipeList.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.settings) {
            intent=new Intent(this,Settings.class);
            startActivity(intent);
            finish();
        }
        return true;
    }
}