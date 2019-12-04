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
public class AreaFragment extends Fragment implements View.OnClickListener {

    private Button btnArea;
    private EditText etRadius;
    private TextView tvArea;


    public AreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_area,container,false);

    etRadius = view.findViewById(R.id.etRadius);
    btnArea = view.findViewById(R.id.btnArea);
    tvArea = view.findViewById(R.id.tvArea);

    btnArea.setOnClickListener(this);
    return view;
    }

    @Override
    public void onClick(View v) {

        if(TextUtils.isEmpty(etRadius.getText()))
        {
            etRadius.setError("Enter radius of circle");
            return;
        }
        else{
            float radius = Float.parseFloat(etRadius.getText().toString());
            float cArea;

             cArea = MathematicActions.areaOfCircle(radius);

            tvArea.setText("Area of Circle :" + cArea + " cm");

            Toast.makeText(getActivity(),"Area of Circle :"+cArea,Toast.LENGTH_LONG).show();
        }

    }
}
