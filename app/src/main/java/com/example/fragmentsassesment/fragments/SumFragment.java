package com.example.fragmentsassesment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragmentsassesment.MathematicActions;
import com.example.fragmentsassesment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment implements View.OnClickListener {


    //referencing variables
    private Button btnCalculate;
    private EditText etFirst, etSecond;
    private TextView tvResult;

    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_sum,container,false);

        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        tvResult = view.findViewById(R.id.tvOutput);

        btnCalculate.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {

        if(TextUtils.isEmpty(etFirst.getText()))
        {
            etFirst.setError("Enter first number");
            return;
        }
        else if(TextUtils.isEmpty(etSecond.getText()))
        {
            etSecond.setError("Enter second number");
        }
        else{
            int first, second, result;

            first = Integer.parseInt(etFirst.getText().toString());
            second = Integer.parseInt(etSecond.getText().toString());

            //calling the function from another class
            MathematicActions sumMath = new MathematicActions(first,second);

            result = sumMath.sumNumbers();

            tvResult.setText(Integer.toString(result) + " is output of Sum");

            Toast.makeText(getActivity(),"Sum is :"+result,Toast.LENGTH_LONG).show();
        }

    }
}
