package com.example.excersicerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rcvFood;
    private Button btnCafe,btnTraSua,btnSuaChua;
    private GridLayoutManager gridLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCafe= findViewById(R.id.btn_cafe);
        btnTraSua= findViewById(R.id.btn_trasua);
        btnSuaChua= findViewById(R.id.btn_suachua);
        rcvFood =findViewById(R.id.rcv_food);
        gridLayoutManager = new GridLayoutManager(this,3);
        rcvFood.setLayoutManager(gridLayoutManager);
        FoodAdapter adapter= new FoodAdapter(getListFood());
        rcvFood.setAdapter(adapter);
        btnCafe.setOnClickListener(this);
        btnTraSua.setOnClickListener(this);
        btnSuaChua.setOnClickListener(this);
        btnCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollToItem(0);
            }
        });

        btnTraSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollToItem(14);
            }
        });

        btnSuaChua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollToItem(27);
            }
        });
    }

    private List<Food> getListFood() {
        List<Food> list = new ArrayList<>();
        list.add(new Food(R.drawable.cup1,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cafe1,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cafe2,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cup2,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cafe4,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cafe5,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cup7,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cup4,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cup5,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cafe,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cafe,"Cafe", Food.TYPE_CAFE));
        list.add(new Food(R.drawable.cafe,"Cafe", Food.TYPE_CAFE));

        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));
        list.add(new Food(R.drawable.milktea,"TraSua", Food.TYPE_TRA_SUA));



        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));
        list.add(new Food(R.drawable.yogurt,"Yogurt", Food.TYPE_SUA_CHUA));


        return list;
    }



    private void scrollToItem(int i) {
        if(gridLayoutManager ==null){
            return;
        }
        gridLayoutManager.scrollToPositionWithOffset(i,0);
    }

    @Override
    public void onClick(View v) {

    }
}