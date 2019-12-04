package com.example.fragmentsassesment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fragmentsassesment.MathematicActions;
import com.example.fragmentsassesment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment {

    private Button btnAutomorphic;
    private EditText etAutomorhicNum;
    private TextView tvOutput;


    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_automorphic,container,false);

        etAutomorhicNum = view.findViewById(R.id.etAutomorphicNum);
        tvOutput = view.findViewById(R.id.tvOutput);
        final Button btnautomorphic = (Button) view.findViewById(R.id.btnCheck);

        btnautomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int automorphicNum = Integer.parseInt(String.valueOf(etAutomorhicNum.getText()));
                boolean isAutomorphic = MathematicActions.isAutomorphic(automorphicNum);

                if(isAutomorphic)
                {
                    tvOutput.setText(etAutomorhicNum.getText()+" is automorphic number");
                }
                else{
                    tvOutput.setText(etAutomorhicNum.getText()+" is not automorphic number");
                }
            }
        });

        return view;
    }

}
