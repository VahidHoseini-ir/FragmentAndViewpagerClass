package com.example.myapp2;

import static com.example.myapp2.FragmentB.KEY_NAME;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class ActivityMain extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString(KEY_NAME , "some Text From Acivity Main");
                FragmentB fragmentB  = new FragmentB();
                fragmentB.setArguments(bundle);


                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.fragmentContainerView, fragmentB );
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();

            }
        });

    }
}
