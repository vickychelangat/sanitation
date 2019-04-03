package com.example.sanitation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class menulist extends AppCompatActivity {
Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulist);

        mybutton=findViewById(R.id.button3);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent(menulist.this,MainActivity.class);
                startActivity(myintent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int s=item.getItemId();
        switch (s){
            case R.id.home:
                Intent myintent1 =new Intent(menulist.this,MainActivity.class);
                startActivity(myintent1);
            case R.id.tracks:
                Intent myintent2 =new Intent(menulist.this,tracks.class);
                startActivity(myintent2);
                break;
            case R.id.status:
                Intent myintent3 =new Intent(menulist.this,status.class);
                startActivity(myintent3);
                break;
            case R.id.catlogue:
                Intent myintent4 =new Intent(menulist.this,viewlist.class);
                startActivity(myintent4);
                break;

            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }
}
