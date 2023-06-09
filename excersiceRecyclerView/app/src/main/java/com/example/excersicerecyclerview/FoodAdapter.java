package com.example.excersicerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{
    private List<Food>mListFood;

    public FoodAdapter(List<Food> mListFood) {
        this.mListFood = mListFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = mListFood.get(position);
        if(food==null){
            return;
        }
        holder.imageFood.setImageResource(food.getImage());
        holder.tvNameFood.setText(food.getName());
    }

    @Override
    public int getItemCount() {
        if(mListFood!=null){
            return mListFood.size();
        }
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageFood;
        private TextView tvNameFood;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFood =itemView.findViewById(R.id.img_food);
            tvNameFood = itemView.findViewById(R.id.tv_name_food);
        }
    }
}
