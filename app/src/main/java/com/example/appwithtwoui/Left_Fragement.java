package com.example.appwithtwoui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class Left_Fragement  extends Fragment {
ImageView i1,i2,i3,i4;
LeftFragmentLister activityCommander;

    public interface LeftFragmentLister{
         void createDescription(String msg);
    }
    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        try{
            activityCommander=(LeftFragmentLister)context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable Bundle savedInstanceState) {
       Log.e("Wapp","OncrateviewLeftFragement");
        View view= inflater.inflate(R.layout.left_fragment,container,false);
       i1=view.findViewById(R.id.image1);
       i2=view.findViewById(R.id.image2);
       i3=view.findViewById(R.id.image3);
       i4=view.findViewById(R.id.image4);
       i1.setOnClickListener(v -> {
           Log.e("Wapp","imageg1click1");
           imageClick(v,R.id.image1);
       });
        i2.setOnClickListener(v -> {
            Log.e("Wapp","imageg1click2");
            imageClick(v,R.id.image2);
        });
        i3.setOnClickListener(v -> {
            Log.e("Wapp","imageg1click3");
            imageClick(v,R.id.image3);
        });
        i4.setOnClickListener(v -> {
            Log.e("Wapp","imageg1click4");
            imageClick(v,R.id.image4);
        });
       return view;
    }
    public void imageClick(View view ,int i){
    Log.e("Wapp",String.valueOf(view.getResources().getResourceName(R.id.image1).equals("com.example.appwithtwoui:id/image1")));
    activityCommander.createDescription(i1.getContentDescription().toString());
    if(i==R.id.image1)
        activityCommander.createDescription(i1.getContentDescription().toString());
    else if(i==R.id.image2)
        activityCommander.createDescription(i2.getContentDescription().toString());
    else if(i==R.id.image3)
            activityCommander.createDescription(i3.getContentDescription().toString());
    else if(i==R.id.image4)
            activityCommander.createDescription(i4.getContentDescription().toString());
    }
}
