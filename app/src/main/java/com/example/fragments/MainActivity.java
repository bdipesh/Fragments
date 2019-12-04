package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.example.fragments.fragments.Automorphic;
import com.example.fragments.fragments.FirstFragment;
import com.example.fragments.fragments.ReverseNum;
import com.example.fragments.fragments.ReveseString;
import com.example.fragments.fragments.SecondFragment;
import com.example.fragments.fragments.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSum, areaofcircle, reverse, palindrome, automorphic, reverseString ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum = findViewById(R.id.btnSum);
        areaofcircle = findViewById(R.id.areaofcircle);
         reverseString= findViewById(R.id.reverseString);
        palindrome = findViewById(R.id.palindrome);
        automorphic = findViewById(R.id.automorphic);
        reverse = findViewById(R.id.reverse);

        btnSum.setOnClickListener(this);
        areaofcircle.setOnClickListener(this);
        reverse.setOnClickListener(this);
        palindrome.setOnClickListener(this);
        automorphic.setOnClickListener(this);
        reverseString.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (view.getId()){
            case R.id.btnSum:
                Fragment sumfragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, sumfragment);
                break;
            case R.id.areaofcircle:
                Fragment areafragment = new SecondFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, areafragment);
                break;

            case R.id.reverseString:
                Fragment rstringFragment = new ReveseString();
                fragmentTransaction.replace(R.id.fragmentContainer, rstringFragment);
                break;

            case R.id.palindrome:
                Fragment palindromeFragment = new FirstFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, palindromeFragment);
                break;

            case R.id.automorphic:
                Fragment automorphicFragment = new Automorphic();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphicFragment );
                break;

            case R.id.reverse:
                Fragment treverseFragment = new ReverseNum();
                fragmentTransaction.replace(R.id.fragmentContainer, treverseFragment);
                break;

        }
        fragmentTransaction.commit();
    }

}
