package com.yeasinhproject.mytodos;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<MyTodos> myTodosList;
    private Context context;

    // ----------------------- MyAdapter Constructor -----------------------------------

    public MyAdapter(List<MyTodos> myTodosList, Context context) {

        this.myTodosList=myTodosList;
        this.context=context;

    }
    // ----------------------- MyAdapter Constructor Ends Here ---------------------------



    // ----------------------- MyAdapter Method Starts Here ---------------------------
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.todos, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(myView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        MyTodos myTodosPosition = myTodosList.get(position);

        holder.tvUserId.setText("User ID : "+myTodosPosition.getTvUserId());
        holder.tvTodo.setText(myTodosPosition.getTvTodo());

        String task = myTodosPosition.getBtnCompleted();

        SetTextData(holder, task);

        LoadAnimation(holder, context);

    }

    @Override
    public int getItemCount() {

        return myTodosList.size();
    }
    // ----------------------- MyAdapter Method Ends Here ---------------------------


    private void SetTextData (MyViewHolder holder, String task) {

        if (task.contains("true")) {

            holder.btnCompleted.setText("Completed");
            holder.btnCompleted.setTextColor(context.getResources().getColor(R.color.black));
            holder.imgCheckBox.setColorFilter(context.getResources().getColor(R.color.green));
            holder.btnMarkAsComp.setVisibility(View.GONE);

        } else {
            holder.btnCompleted.setText("Pending");
            holder.btnMarkAsComp.setVisibility(View.VISIBLE);
            holder.imgCheckBox.setColorFilter(context.getResources().getColor(R.color.red));
            holder.btnCompleted.setTextColor(Color.parseColor("#FF0000"));
        }

        holder.btnMarkAsComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                holder.btnCompleted.setText("Completed");
                holder.btnCompleted.setTextColor(context.getResources().getColor(R.color.black));
                holder.btnMarkAsComp.setVisibility(View.GONE);
                holder.imgCheckBox.setColorFilter(context.getResources().getColor(R.color.green));
            }
        });

    }


    private void LoadAnimation (MyViewHolder holder, Context context) {

        holder.tvUserId.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_two));
        holder.tvTodo.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_two));
        holder.imgCheckBox.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_two));

        holder.materialCard.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_scale));

    }



} // MyAdapter Class Ends Here ------------------------------------------
