package com.example.audiobrand.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.audiobrand.Fragments.ProductDetailFragment;
import com.example.audiobrand.Model.HomeBestProduct;
import com.example.audiobrand.R;
import com.example.audiobrand.databinding.HomeBestProductSampleBinding;
import com.example.audiobrand.databinding.HomePopularProductSampleBinding;

import java.util.ArrayList;

public class HomeBestProductAdapter extends RecyclerView.Adapter<HomeBestProductAdapter.viewHolder>{

    Context context;
    ArrayList<HomeBestProduct> homeBestProducts;

    public HomeBestProductAdapter(Context context, ArrayList<HomeBestProduct> homeBestProducts) {
        this.context = context;
        this.homeBestProducts = homeBestProducts;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_best_product_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        HomeBestProduct homeBestProduct = homeBestProducts.get(position);

        holder.binding.igProductImage.setImageResource(homeBestProduct.getProductImage());
        holder.binding.txProductName.setText(homeBestProduct.getProductName());
        holder.binding.txProductPrice.setText(homeBestProduct.getProductPrice());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frMainContainer , new ProductDetailFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return homeBestProducts.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        HomeBestProductSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = HomeBestProductSampleBinding.bind(itemView);
        }
    }
}
