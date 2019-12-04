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
public class Automorphic extends Fragment implements View.OnClickListener {
  EditText numtoCheck;
  Button btnCheck;
  TextView showResult;

    public Automorphic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        numtoCheck = view.findViewById(R.id.numtoCheck);
        btnCheck = view.findViewById(R.id.bthCheck);
        showResult = view.findViewById(R.id.showResult);

        btnCheck.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
     int Number = Integer.parseInt(numtoCheck.getText().toString());
     String result = isAutomorphic(Number) ? "Given Number is Automorphic" : "Given Number is Not Automorphic";
     showResult.setText(result);
     Toast.makeText(this.getActivity(), result, Toast.LENGTH_SHORT).show();

    }


    public static Boolean isAutomorphic (int Num) {
        int Sq = Num * Num;

        while (Num > 0) {
            if(Num % 10 != Sq % 10) {
                return false;
            }
            Num /= 10;
            Sq /= 10;


        }
        return true;


    }
}
