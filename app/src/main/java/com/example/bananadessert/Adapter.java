package com.example.bananadessert;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<FoodViewHolder> {
    private Context mContext;
    private List<RecipeInfo> myRecipeInfo;

    public Adapter(Context mContext, List<RecipeInfo> myRecipeInfo) {
        this.mContext = mContext;
        this.myRecipeInfo = myRecipeInfo;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_item,parent,false);

        return new FoodViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.imageView.setImageResource(myRecipeInfo.get(position).getFoodImage());
        holder.mName.setText(myRecipeInfo.get(position).getFoodName());
        //holder.mIntro.setText(myRecipeInfo.get(position).getFoodIntro());
        //holder.mIngredients.setText(myRecipeInfo.get(position).getFoodIngredients());
        //holder.mInstruction.setText(myRecipeInfo.get(position).getFoddInstruction());

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,RecipeDetails.class);
                intent.putExtra("Image",myRecipeInfo.get(holder.getAdapterPosition()).getFoodImage());
                intent.putExtra("Name",myRecipeInfo.get(holder.getAdapterPosition()).getFoodName());
                intent.putExtra("Intro",myRecipeInfo.get(holder.getAdapterPosition()).getFoodIntro());
                intent.putExtra("Ingredient",myRecipeInfo.get(holder.getAdapterPosition()).getFoodIngredients());
                intent.putExtra("Instruction",myRecipeInfo.get(holder.getAdapterPosition()).getFoddInstruction());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myRecipeInfo.size();
    }
}

class FoodViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView mName;
    CardView mCardView;

    public FoodViewHolder( View itemView) {
        super(itemView);

        imageView=itemView.findViewById(R.id.ivImage);
        mName=itemView.findViewById(R.id.tvName);
        //mIntro=itemView.findViewById(R.id.tvIntro);
        //mIngredients=itemView.findViewById(R.id.tvIngredients);
        //mInstruction=itemView.findViewById(R.id.tvInstruction);
        mCardView=itemView.findViewById(R.id.myCardView);
    }
}
