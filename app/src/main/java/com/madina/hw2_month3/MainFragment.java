package com.madina.hw2_month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainFragment extends Fragment {

    private Button btnMinus, btnPlus;
    private TextView tvCounter;
    private int num;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        btnMinus = view.findViewById(R.id.btn_minus);
        btnPlus = view.findViewById(R.id.btn_plus);
        tvCounter = view.findViewById(R.id.counter);

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            num = Integer.parseInt(tvCounter.getText().toString())-1;
            tvCounter.setText(num + "");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Integer.parseInt((tvCounter.getText().toString()))+1;
                tvCounter.setText((num + ""));
            }
        });

    }
}