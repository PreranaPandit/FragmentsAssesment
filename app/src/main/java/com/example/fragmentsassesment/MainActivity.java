package com.example.fragmentsassesment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentsassesment.fragments.AreaFragment;
import com.example.fragmentsassesment.fragments.PalindromeFragment;
import com.example.fragmentsassesment.fragments.ReverseNumFragment;
import com.example.fragmentsassesment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnArea;
    private Button btnSum;
    private Button btnReverseNum;
    private Button btnPalindrome;

    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum = findViewById(R.id.btnSum);
        btnArea = findViewById(R.id.btnArea);
        btnReverseNum = findViewById(R.id.btnReverseNum);
        btnPalindrome = findViewById(R.id.btnPalindrome);

        btnSum.setOnClickListener(this);
        btnArea.setOnClickListener(this);
        btnReverseNum.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnSum:
                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,sumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnArea:
                AreaFragment areaFragment = new AreaFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,areaFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnReverseNum:
                ReverseNumFragment reverseNumFragment = new ReverseNumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseNumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnPalindrome:
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;


        }


    }
}
