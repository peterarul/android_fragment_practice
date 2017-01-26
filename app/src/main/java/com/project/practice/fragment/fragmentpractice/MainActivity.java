package com.project.practice.fragment.fragmentpractice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                if(v == findViewById(R.id.button)){
                        fragment = new FragmentOne();
                } else {
                    fragment = new FragmentTwo();
                }
                FragmentManager manage = getSupportFragmentManager();
                FragmentTransaction transaction = manage.beginTransaction();
                transaction.replace(R.id.fragment_one, fragment);
                transaction.commit();
            }
        };
        Button btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(listener);
        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(listener);
    }
}
