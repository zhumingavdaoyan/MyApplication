package com.example.administrator.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fragment.FragmentTwo;
import fragment.Fragmentone;

public class MainActivity extends Activity {
    private Fragmentone fragmentone;
    private FragmentTwo fragmentTwo;
    private int showState=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentone=new Fragmentone();
        fragmentTwo=new FragmentTwo();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.ftame_main,fragmentone);
        transaction.commit();
    }
    public void change(View view){
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        if(showState==0){
            transaction.replace(R.id.ftame_main,fragmentTwo);
            showState=1;
        }
        else if(showState==1){
            transaction.replace(R.id.ftame_main,fragmentone);
            showState=0;
        }
    }
}
