package com.geeks.aizhan_kanybekova_3_3_flowers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Flowers.Flowers;

public class FlowersAdapter extends RecyclerView.Adapter<FlowersAdapter.FlowersViewHolder> {

    private List<Flowers>flowers;

    public  FlowersAdapter(List<Flowers> flowers) {
        this.flowers = flowers;
    }

    @NonNull
    @Override
    public FlowersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.flowers_item_layout, parent, false);
        return new FlowersViewHolder(view);
    }




    @Override
    public void onBindViewHolder(@NonNull FlowersViewHolder holder, int position) {
         Flowers flower = flowers.get(position);
        holder.flowerImageView.setImageResource(flower.getImageResource());
        holder.flowerNameTextView.setText(flower.getName());
    }

    @Override
    public int getItemCount() {
        return flowers.size();
    }

    static class FlowersViewHolder extends RecyclerView.ViewHolder {
        ImageView flowerImageView;
        TextView flowerNameTextView;

        public FlowersViewHolder(@NonNull View itemView) {
            super(itemView);
            flowerImageView = itemView.findViewById(R.id.flowerImageView);
            flowerNameTextView = itemView.findViewById(R.id.flowerNameTextView);
        }
    }


        }
