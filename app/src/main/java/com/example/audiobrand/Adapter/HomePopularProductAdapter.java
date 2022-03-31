package com.example.audiobrand.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.audiobrand.Fragments.ProductDetailFragment;
import com.example.audiobrand.Model.HomePopularProduct;
import com.example.audiobrand.R;
import com.example.audiobrand.databinding.HomeBrandSampleBinding;
import com.example.audiobrand.databinding.HomePopularProductSampleBinding;

import java.util.ArrayList;

public class HomePopularProductAdapter extends RecyclerView.Adapter<HomePopularProductAdapter.viewHolder>{

    Context context;
    ArrayList<HomePopularProduct> homePopularProducts;

    public HomePopularProductAdapter(Context context, ArrayList<HomePopularProduct> homePopularProducts) {
        this.context = context;
        this.homePopularProducts = homePopularProducts;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_popular_product_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        HomePopularProduct homePopularProduct = homePopularProducts.get(position);

        holder.binding.igProductImage.setImageResource(homePopularProduct.getProductImage());
        holder.binding.txProductName.setText(homePopularProduct.getProductName());
        holder.binding.txProductType.setText(homePopularProduct.getProductType());
        holder.binding.txProductPrice.setText(homePopularProduct.getProductPrice());

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
        return homePopularProducts.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        HomePopularProductSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = HomePopularProductSampleBinding.bind(itemView);
        }
    }
}
