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
import com.example.audiobrand.databinding.FragmentFavoriteBinding;

import java.util.ArrayList;


public class FavoriteFragment extends Fragment {


    public FavoriteFragment() {
        // Required empty public constructor
    }

    private FragmentFavoriteBinding binding;
    private ArrayList<ShoppingProduct> shoppingProducts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(getLayoutInflater());

        shoppingProducts = new ArrayList<>();
        shoppingProducts.add(new ShoppingProduct(R.drawable.xtend,"Boat Xtend SmartWatch","SmartWatch","$300"));
        shoppingProducts.add(new ShoppingProduct(R.drawable.rockerz600,"Boat Rockerz 600","Headphone","$200"));
        shoppingProducts.add(new ShoppingProduct(R.drawable.stone180,"Boat Stone 180","Speaker","$200"));
        shoppingProducts.add(new ShoppingProduct(R.drawable.rockerz450,"Boat Rockerz 450","Headphone","$150"));
        shoppingProducts.add(new ShoppingProduct(R.drawable.airdopes171,"Boat Airdopes 171","Airdopes","$160"));


        ShoppingProductAdapter shoppingProductAdapter = new ShoppingProductAdapter(getContext(),shoppingProducts);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1);
        binding.rvShoppingRecyclerView.setLayoutManager(gridLayoutManager);
        binding.rvShoppingRecyclerView.setAdapter(shoppingProductAdapter);





        return binding.getRoot();
    }
}