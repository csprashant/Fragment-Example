package com.example.appwithtwoui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //FragmentManager fragmentManager;
   // FragmentTransaction fragmentTransaction;
    TextView descTv;
    //ImageView iv1,iv2,iv3,iv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        descTv=(TextView) findViewById(R.id.descriptionTxt);

        //addFragment();

    }
   /* public void addFragment(){
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();

        Left_Fragement left_fragement=new Left_Fragement();
        Right_Fragment right_fragment=new Right_Fragment();

        fragmentTransaction.add(R.id.leftFrame,left_fragement);
        fragmentTransaction.add(R.id.rightFrame,right_fragment);

        fragmentTransaction.commit();
    }*/

    public void fun1(View view) {
        descTv.setText("Image name:\n"+view.getResources().getResourceName(R.id.image1)+"\n"+ "Image type:"+view.getResources().getResourceTypeName(R.id.image1));
    }
    public void fun2(View view) {
        descTv.setText("Image name:\n"+view.getResources().getResourceName(R.id.image2)+"\n"+ "Image type:"+view.getResources().getResourceTypeName(R.id.image1));
    }
    public void fun3(View view) {
        descTv.setText("Image name:\n"+view.getResources().getResourceName(R.id.image3)+"\n"+ "Image type:"+view.getResources().getResourceTypeName(R.id.image1));
    }
    public void fun4(View view) {
        descTv.setText("Image name:\n"+view.getResources().getResourceName(R.id.image4)+"\n"+ "Image type:"+view.getResources().getResourceTypeName(R.id.image1));
    }




}