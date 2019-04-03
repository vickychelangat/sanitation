package com.example.sanitation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //name:chelangat vicky
    //institution:mbarara university of science and technology
    //regno:2017/bit/160
    //town:kapchorwa
Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton=findViewById(R.id.button4);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent(MainActivity.this,menulist.class);
                startActivity(myintent);
            }
        });
    }

    @Override
    protected void onStart() {
        String  my_tag="";
        super.onStart();
        Log.i(my_tag,"onStart");
        Toast.makeText(getApplicationContext(),"app started",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        String  my_tag="";
        super.onDestroy();
        Log.i(my_tag,"onDestroy");
        Toast.makeText(getApplicationContext(),"app destroyed",Toast.LENGTH_LONG).show();
    }
    protected void onResume() {
        String  my_tag="";
        super.onResume();
        Log.i(my_tag,"onResume");
        Toast.makeText(getApplicationContext(),"app resumed",Toast.LENGTH_LONG).show();

    }
}
