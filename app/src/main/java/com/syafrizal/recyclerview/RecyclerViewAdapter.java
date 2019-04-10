package com.syafrizal.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> rvData;
    private Context context;


    public RecyclerViewAdapter(ArrayList<String> inputData,Context context) {
        this.rvData = inputData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_rv_student,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final String name = rvData.get(i);
        viewHolder.tvTitle.setText(rvData.get(i));
        viewHolder.tvSubtitle.setText("Frau " + i);
    }

    @Override
    public int getItemCount()  {
        return (rvData != null) ? rvData.size() : 0;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        TextView tvSubtitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvSubtitle = itemView.findViewById(R.id.tv_subtitle);

        }
    }
}
