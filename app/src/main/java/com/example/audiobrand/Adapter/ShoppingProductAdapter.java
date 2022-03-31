package com.example.audiobrand.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.audiobrand.Fragments.ProductDetailFragment;
import com.example.audiobrand.Model.ShoppingProduct;
import com.example.audiobrand.R;
import com.example.audiobrand.databinding.HomePopularProductSampleBinding;
import com.example.audiobrand.databinding.ShoppingProductSampleBinding;

import java.util.ArrayList;

public class ShoppingProductAdapter extends RecyclerView.Adapter<ShoppingProductAdapter.viewHolder>{


    Context context;
    ArrayList<ShoppingProduct> shoppingProducts;

    public ShoppingProductAdapter(Context context, ArrayList<ShoppingProduct> shoppingProducts) {
        this.context = context;
        this.shoppingProducts = shoppingProducts;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.shopping_product_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        ShoppingProduct shoppingProduct = shoppingProducts.get(position);

        holder.binding.igProductImage.setImageResource(shoppingProduct.getProductImage());
        holder.binding.txProductName.setText(shoppingProduct.getProductName());
        holder.binding.txProductType.setText(shoppingProduct.getProductType());
        holder.binding.txProductPrice.setText(shoppingProduct.getProductPrice());

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
        return shoppingProducts.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        ShoppingProductSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ShoppingProductSampleBinding.bind(itemView);
        }
    }
}
