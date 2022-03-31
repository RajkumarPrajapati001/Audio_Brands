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
import android.widget.Toast;

import com.example.audiobrand.MainActivity;
import com.example.audiobrand.R;
import com.example.audiobrand.databinding.FragmentLoginBinding;


public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Required empty public constructor
    }

   private FragmentLoginBinding binding;
    private  String Name,Email,Password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(getLayoutInflater());


        binding.igBackAero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frLoginContainer,new StartScreenFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        binding.btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (binding.edName.getText().toString().isEmpty()) {
                    Toast.makeText(getContext(), "Please Enter Name ", Toast.LENGTH_SHORT).show();}
                else if (binding.edName.getText().toString().length() < 4) {
                    Toast.makeText(getContext(), "Name must be Minimum 3 characters", Toast.LENGTH_SHORT).show();
                } else if (binding.edEmail.getText().toString().isEmpty()) {
                    Toast.makeText(getContext(), "Please Enter Email In Valid Format ", Toast.LENGTH_SHORT).show();
                } else if (!(binding.edEmail.getText().toString().contains("@"))) {
                    Toast.makeText(getContext(), "Please Enter Email In Valid Format ", Toast.LENGTH_SHORT).show();
                } else if (!(binding.edEmail.getText().toString().endsWith(".com"))) {
                    Toast.makeText(getContext(), "Please Enter Email In Valid Format ", Toast.LENGTH_SHORT).show();
                } else if (binding.edPassword.getText().toString().isEmpty()) {
                    Toast.makeText(getContext(), "Please Enter Password ", Toast.LENGTH_SHORT).show();
                }else if(binding.edPassword.getText().toString().length() < 8 ) {
                    Toast.makeText(getContext(), "Password Must Be Minimum 8 Characters ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Profile Saved...", Toast.LENGTH_SHORT).show();

                    Name = binding.edName.getText().toString();
                    Email = binding.edEmail.getText().toString();
                    Password = binding.edPassword.getText().toString();

                    StoreUserDetails(Name, Email, Password);

                    Intent intent = new Intent(getContext(), MainActivity.class);
                    startActivity(intent);
                    requireActivity().finishAffinity();
                }
            }
        });

        return binding.getRoot();
    }
        private SharedPreferences StoreUserDetails(String UserName , String UserEmail,String UserPassword)
        {
            SharedPreferences spf = getContext().getSharedPreferences("UserDetails" , Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = spf.edit();
            editor.putString("UserName" , UserName);
            editor.putString("UserEmail" , UserEmail);
            editor.putString("UserPassword" , UserPassword);
            editor.apply();
            return spf;
        }
}