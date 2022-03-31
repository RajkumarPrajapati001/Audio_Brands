package com.example.audiobrand.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.audiobrand.R;
import com.example.audiobrand.databinding.FragmentProductDetailBinding;


public class ProductDetailFragment extends Fragment {

    public ProductDetailFragment() {
        // Required empty public constructor
    }

    private FragmentProductDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProductDetailBinding.inflate(getLayoutInflater());

        binding.btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Cart Successfully Added", Toast.LENGTH_SHORT).show();
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new HomeFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });





        return binding.getRoot();
    }
}