package com.example.fragmentbackbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private FragmentOne fragmentOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.idClick);

        fragmentOne = new FragmentOne();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setFrament(fragmentOne);

            }
        });
    }


    private  void setFrament (Fragment frament){

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container,frament);
        fragmentTransaction.commit();

    }
}