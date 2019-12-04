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
public class ReverseNumFragment extends Fragment implements View.OnClickListener {

    //referencing variables
    private Button btnReverse;
    private EditText etNumber;
    private TextView tvReverse;

    public ReverseNumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_reverse_num,container,false);

        etNumber = view.findViewById(R.id.etReverseNum);
        btnReverse = view.findViewById(R.id.btnReverse);
        tvReverse = view.findViewById(R.id.tvReverseOutput);

        btnReverse.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {


        if(TextUtils.isEmpty(etNumber.getText()))
        {
            etNumber.setError("Enter number");
            return;
        }
        else{
            int revNum, result;

            revNum = Integer.parseInt(etNumber.getText().toString());

            //calling the function from another class

            result = MathematicActions.reverseNumber(revNum);

            tvReverse.setText(Integer.toString(result)+" is a reverse output");


            Toast.makeText(getActivity(),"Reverse Number is :"+result,Toast.LENGTH_LONG).show();
        }
    }
}
