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

import com.example.fragmentsassesment.MathematicActions;
import com.example.fragmentsassesment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalindromeFragment extends Fragment{


    private Button btnCheckPalindrome;
    private EditText etpalinNum;
    private TextView tvOutput;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_palindrome,container,false);

        etpalinNum = view.findViewById(R.id.etPalindromeNumber);
        tvOutput = view.findViewById(R.id.tvOutput);
      final Button btncheck = (Button) view.findViewById(R.id.btnCheck);

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int palindromeNum = Integer.parseInt(String.valueOf(etpalinNum.getText()));
                boolean isPalindrome = MathematicActions.isPalindrome(palindromeNum);

                if(isPalindrome)
                {
                    tvOutput.setText(etpalinNum.getText()+" is palindrome number");
                }
                else{
                    tvOutput.setText(etpalinNum.getText()+" is not palindrome number");
                }
            }
        });
        return view;


         }

        }

