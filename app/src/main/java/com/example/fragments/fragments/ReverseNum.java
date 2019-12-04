package com.example.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseNum extends Fragment implements View.OnClickListener {
    Button btnReverse;
    EditText reverseNum;
    TextView showResult;


    public ReverseNum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_num, container, false);
        btnReverse = view.findViewById(R.id.btnReverse);
        reverseNum = view.findViewById(R.id.reverseNumber);
        showResult = view.findViewById(R.id.showReverse);

        btnReverse.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        String numToReverse = String.valueOf(reverseNum.getText());
        String reverseNum =  new StringBuilder(numToReverse).reverse().toString();

        showResult.setText("Reversed Number is: " + reverseNum);

        Toast.makeText(this.getActivity(), "Reversed Num is: " + reverseNum, Toast.LENGTH_SHORT).show();
        
        
        
    }


}
