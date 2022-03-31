package com.example.audiobrand.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.audiobrand.Adapter.ShoppingProductAdapter;
import com.example.audiobrand.Model.ShoppingProduct;
import com.example.audiobrand.R;
import com.example.audiobrand.databinding.FragmentShopBinding;

import java.util.ArrayList;


public class ShopFragment extends Fragment {



    public ShopFragment() {
        // Required empty public constructor
    }

    private FragmentShopBinding binding;
    private ArrayList<ShoppingProduct> shoppingProducts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding  = FragmentShopBinding.inflate(getLayoutInflater());

        shoppingProducts = new ArrayList<>();
        shoppingProducts.add(new ShoppingProduct(R.drawable.airdopes441,"Boat Airdopes 441","Airdopes","$190"));
        shoppingProducts.add(new ShoppingProduct(R.drawable.rockerz510,"Boat Rockerz 510","Headphone","$180"));
        shoppingProducts.add(new ShoppingProduct(R.drawable.rockerz255,"Boat Rockerz 255","Earphone","$100"));
        shoppingProducts.add(new ShoppingProduct(R.drawable.xtend,"Boat Xtend SmartWatch","SmartWatch","$300"));
        shoppingProducts.add(new ShoppingProduct(R.drawable.stone180,"Boat Stone 180","Speaker","$200"));


        ShoppingProductAdapter shoppingProductAdapter = new ShoppingProductAdapter(getContext(),shoppingProducts);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1);
        binding.rvShoppingRecyclerView.setLayoutManager(gridLayoutManager);
        binding.rvShoppingRecyclerView.setAdapter(shoppingProductAdapter);



        return  binding.getRoot();
    }
}