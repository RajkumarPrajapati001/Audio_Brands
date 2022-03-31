package com.example.audiobrand.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.audiobrand.Model.HomeBrand;
import com.example.audiobrand.R;
import com.example.audiobrand.databinding.HomeBrandSampleBinding;

import java.util.ArrayList;

public class HomeBrandAdapter extends RecyclerView.Adapter<HomeBrandAdapter.viewHolder>{
    Context context;
    ArrayList<HomeBrand> homeBrands;

    public HomeBrandAdapter(Context context, ArrayList<HomeBrand> homeBrands) {
        this.context = context;
        this.homeBrands = homeBrands;
    }



    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_brand_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        HomeBrand homeBrand = homeBrands.get(position);

        holder.binding.igBrandImage.setImageResource(homeBrand.getItemImage());
        holder.binding.txBrandName.setText(homeBrand.getItemName());

    }

    @Override
    public int getItemCount() {
        return homeBrands.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        HomeBrandSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = HomeBrandSampleBinding.bind(itemView);
        }
    }
}
