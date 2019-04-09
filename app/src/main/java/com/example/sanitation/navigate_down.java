package com.example.sanitation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class navigate_down extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate_down);

        BottomNavigationView Bottom_nav=findViewById(R.id.bottom_navg);
        Bottom_nav.setOnNavigationItemSelectedListener(navlistner );
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new myhome()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navlistner=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment=null;
                    switch(menuItem.getItemId()){
                        case R.id.home:
                            selectedFragment=new myhome();
                            break;
                        case R.id.favorites:
                            selectedFragment=new myfavorites();
                            break;
                        case R.id.comunity:
                            selectedFragment=new mycommunity();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };
}
