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
public class ReveseString extends Fragment implements View.OnClickListener {
 Button reverse;
 EditText reverseText;

    public ReveseString() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_revese_string, container, false);

        reverse = view.findViewById(R.id.reverseString);
        reverseText = view.findViewById(R.id.reverseText);

        reverse.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
      String text = reverseText.getText().toString();
      String reverseText =  new StringBuilder(text).reverse().toString();
      Toast.makeText(getActivity(), "The reverse string " + reverseText, Toast.LENGTH_SHORT ).show();
    }
}
