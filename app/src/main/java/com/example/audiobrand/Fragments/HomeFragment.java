package com.example.audiobrand.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.audiobrand.Adapter.HomeBestProductAdapter;
import com.example.audiobrand.Adapter.HomeBrandAdapter;
import com.example.audiobrand.Adapter.HomePopularProductAdapter;
import com.example.audiobrand.Model.HomeBestProduct;
import com.example.audiobrand.Model.HomeBrand;
import com.example.audiobrand.Model.HomePopularProduct;
import com.example.audiobrand.R;
import com.example.audiobrand.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

   private FragmentHomeBinding binding;
    private ArrayList<HomeBrand> homeBrands;
    private ArrayList<HomePopularProduct> homePopularProducts;
    private ArrayList<HomeBestProduct> homeBestProducts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getLayoutInflater());

        //Brand RecyclerView
        homeBrands = new ArrayList<>();
        homeBrands.add(new HomeBrand(R.drawable.boat1,"Boat"));
        homeBrands.add(new HomeBrand(R.drawable.jbl,"JBL"));
        homeBrands.add(new HomeBrand(R.drawable.sony,"Sony"));
        homeBrands.add(new HomeBrand(R.drawable.mi,"Mi"));
        homeBrands.add(new HomeBrand(R.drawable.apple,"Apple"));
        homeBrands.add(new HomeBrand(R.drawable.samsung,"Samsung"));
        homeBrands.add(new HomeBrand(R.drawable.oneplus,"OnePlus"));
        homeBrands.add(new HomeBrand(R.drawable.oppo,"Oppo"));

        HomeBrandAdapter homeBrandAdapter = new HomeBrandAdapter(getContext(),homeBrands);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1, RecyclerView.HORIZONTAL,false);
        binding.rvBrandRecyclerView.setLayoutManager(gridLayoutManager);
        binding.rvBrandRecyclerView.setAdapter(homeBrandAdapter);


        //Popular Product RecyclerView
        homePopularProducts = new ArrayList<>();
        homePopularProducts.add(new HomePopularProduct(R.drawable.rockerz450,"Boat Rockerz 450","Headphone","$150"));
        homePopularProducts.add(new HomePopularProduct(R.drawable.xtend,"Boat Xtend SmartWatch","SmartWatch","$300"));
        homePopularProducts.add(new HomePopularProduct(R.drawable.rockerz255,"Boat Rockerz 255","Earphone","$100"));
        homePopularProducts.add(new HomePopularProduct(R.drawable.rockerz400,"Boat Rockerz 400","Headphone","$130"));
        homePopularProducts.add(new HomePopularProduct(R.drawable.rockerz510,"Boat Rockerz 510","Headphone","$180"));
        homePopularProducts.add(new HomePopularProduct(R.drawable.rockerz600,"Boat Rockerz 600","Headphone","$200"));
        homePopularProducts.add(new HomePopularProduct(R.drawable.airdopes121,"Boat Airdopes 121","Airdopes","$140"));
        homePopularProducts.add(new HomePopularProduct(R.drawable.airdopes171,"Boat Airdopes 171","Airdopes","$160"));
        homePopularProducts.add(new HomePopularProduct(R.drawable.airdopes441,"Boat Airdopes 441","Airdopes","$190"));
        homePopularProducts.add(new HomePopularProduct(R.drawable.stone180,"Boat Stone 180","Speaker","$200"));


        HomePopularProductAdapter homePopularProductAdapter = new HomePopularProductAdapter(getContext(),homePopularProducts);
        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(getContext(),1,RecyclerView.HORIZONTAL,false);
        binding.rvPopularProduct.setLayoutManager(gridLayoutManager1);
        binding.rvPopularProduct.setAdapter(homePopularProductAdapter);


        //Best Product RecyclerView
        homeBestProducts = new ArrayList<>();
        homeBestProducts.add(new HomeBestProduct(R.drawable.rockerz600,"Boat Rockerz 600","$200"));
        homeBestProducts.add(new HomeBestProduct(R.drawable.rockerz510,"Boat Rockerz 510","$180"));
        homeBestProducts.add(new HomeBestProduct(R.drawable.xtend,"Boat Xtend SmartWatch","$300"));
        homeBestProducts.add(new HomeBestProduct(R.drawable.airdopes121,"Boat Airdopes 121","$140"));
        homeBestProducts.add(new HomeBestProduct(R.drawable.stone180,"Boat Stone 180","$200"));
        homeBestProducts.add(new HomeBestProduct(R.drawable.rockerz400,"Boat Rockerz 400","$130"));
        homeBestProducts.add(new HomeBestProduct(R.drawable.airdopes171,"Boat Airdopes 171","$160"));
        homeBestProducts.add(new HomeBestProduct(R.drawable.rockerz255,"Boat Rockerz 255","$100"));
        homeBestProducts.add(new HomeBestProduct(R.drawable.airdopes441,"Boat Airdopes 441","$190"));
        homeBestProducts.add(new HomeBestProduct(R.drawable.rockerz450,"Boat Rockerz 450","$150"));


        HomeBestProductAdapter homeBestProductAdapter = new HomeBestProductAdapter(getContext(),homeBestProducts);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(),1,RecyclerView.HORIZONTAL,false);
        binding.rvBestSelling.setLayoutManager(gridLayoutManager2);
        binding.rvBestSelling.setAdapter(homeBestProductAdapter);










        return binding.getRoot();
    }
}