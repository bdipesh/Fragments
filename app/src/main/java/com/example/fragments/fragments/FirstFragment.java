package com.example.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {
 EditText palindromeText;
 Button checkPalindrome;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        palindromeText = view.findViewById(R.id.palindromeText);
        checkPalindrome = view.findViewById(R.id.checkPalindrome);
        checkPalindrome.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
      String word = palindromeText.getText().toString();
      String reverseText =  new StringBuilder(word).reverse().toString();
      if(word.equals(reverseText)){
          Toast.makeText(getActivity(), "This is palindrome", Toast.LENGTH_SHORT ).show();
      } else {
          Toast.makeText(getActivity(), "This is not palindrome", Toast.LENGTH_SHORT ).show();
      }
    }
}
