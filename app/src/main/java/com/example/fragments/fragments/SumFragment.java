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
public class SumFragment extends Fragment implements View.OnClickListener {
    Button calculate;
    EditText firstNum, secondNum;
    TextView resultSum;


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sum, container, false);
        calculate = view.findViewById(R.id.calculate);
        firstNum = view.findViewById(R.id.firstNum);
        secondNum = view.findViewById(R.id.secondNum);
        resultSum = view.findViewById(R.id.sumResult);

        calculate.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
      int first = Integer.parseInt(firstNum.getText().toString());
      int second = Integer.parseInt(secondNum.getText().toString());
      int result = first + second;
      resultSum.setText(Integer.toString(result));
        Toast.makeText(getActivity(),"Sum is" + result, Toast.LENGTH_SHORT);
    }
}
