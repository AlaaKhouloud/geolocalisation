package com.version.geolocalisationsafi;



import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {
    ConstraintLayout Menuuu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Menuuu=(ConstraintLayout) findViewById(R.id.menu);
        Menuuu.setVisibility(View.GONE);
        Menuuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menuuu.setVisibility(View.GONE);
            }
        });
    }

    public void hid(View view) {
        Menuuu.setVisibility(View.VISIBLE);
        Fragment fragment = new MenuFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.menu,fragment,fragment.getClass().getSimpleName())
                .addToBackStack(null).commit();
        Menuuu.bringToFront();
    }

}
