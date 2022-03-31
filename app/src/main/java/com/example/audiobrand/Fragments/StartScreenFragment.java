package com.example.audiobrand.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.audiobrand.MainActivity;
import com.example.audiobrand.R;
import com.example.audiobrand.databinding.FragmentStartScreenBinding;


public class StartScreenFragment extends Fragment {


    public StartScreenFragment() {
        // Required empty public constructor
    }

    private FragmentStartScreenBinding binding;
    private SharedPreferences spf;
    private String Name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding = FragmentStartScreenBinding.inflate(getLayoutInflater());

        spf = requireContext().getSharedPreferences("UserDetails" , Context.MODE_PRIVATE);
        Name = spf.getString("UserName" , null);


       binding.btnGatStarted.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if(Name == null){
                   FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                   fragmentTransaction.replace(R.id.frLoginContainer, new LoginFragment())
                           .addToBackStack(null).commit();
               }else {
                   Intent intent = new Intent(getContext(), MainActivity.class);
                   startActivity(intent);
                   requireActivity().finishAffinity();
               }

           }
       });


       return binding.getRoot();
    }
}