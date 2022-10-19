package com.yeasinhproject.mytodos;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView tvUserId,tvTodo;
    Button btnCompleted,btnMarkAsComp;
    ImageView imgCheckBox;
    MaterialCardView materialCard;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        tvUserId = itemView.findViewById(R.id.tvUserId);
        tvTodo = itemView.findViewById(R.id.tvTodo);
        btnMarkAsComp = itemView.findViewById(R.id.btnMarkAsComp);
        btnCompleted = itemView.findViewById(R.id.btnCompleted);
        imgCheckBox = itemView.findViewById(R.id.imgCheckBox);
        materialCard = itemView.findViewById(R.id.materialCard);

    }



}
