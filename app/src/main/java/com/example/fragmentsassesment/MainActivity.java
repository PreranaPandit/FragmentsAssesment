package com.example.fragmentsassesment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentsassesment.fragments.AreaFragment;
import com.example.fragmentsassesment.fragments.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnArea;
    private Button btnSum;

    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum = findViewById(R.id.btnSum);
        btnArea = findViewById(R.id.btnArea);

        btnSum.setOnClickListener(this);
        btnArea.setOnClickListener(this);

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

        }


    }
}
