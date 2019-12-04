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
public class SecondFragment extends Fragment implements View.OnClickListener {
      EditText radius;
      Button calculateArea;
      TextView areaofResult;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        radius = view.findViewById(R.id.radius);
        calculateArea = view.findViewById(R.id.calculateArea);
        areaofResult = view.findViewById(R.id.areaofResult);

        calculateArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        Double rad = Double.parseDouble(radius.getText().toString());
        Double result = ((3.14) * rad * rad);

        areaofResult.setText(String.valueOf(result));
        Toast.makeText(this.getActivity(), "Area of result : " + result, Toast.LENGTH_SHORT).show();
    }
}
