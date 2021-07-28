package com.example.appwithtwoui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Left_Fragement.LeftFragmentLister {
    FragmentManager fragmentManager;
   FragmentTransaction fragmentTransaction;
    TextView descTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment();
    }
    public void addFragment(){
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();

        Left_Fragement left_fragement=new Left_Fragement();
        Right_Fragment right_fragment=new Right_Fragment();

        fragmentTransaction.add(R.id.leftFrame,left_fragement);
        fragmentTransaction.add(R.id.rightFrame,right_fragment);

        fragmentTransaction.commit();
    }
    @Override
    public void createDescription(String msg) {
        Log.e("Wapp","createDescription");
        Right_Fragment right_fragment = (Right_Fragment) getSupportFragmentManager().findFragmentById(R.id.rightFrame);
        if(right_fragment!=null)
        right_fragment.setDescription(msg);

    }
}