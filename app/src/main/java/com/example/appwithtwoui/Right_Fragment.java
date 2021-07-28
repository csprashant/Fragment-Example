package com.example.appwithtwoui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class Right_Fragment extends Fragment {
    private TextView textView;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container, @Nullable  Bundle savedInstanceState) {
        Log.e("Wapp","oncreateviewRightGfgragment");
        View view=  inflater.inflate(R.layout.right_fragment,container,false);
        textView = view.findViewById(R.id.descriptionTxt);
        return view;
    }
    public void setDescription(String msg) {
        Log.e("Wapp","setDescription()");
        textView.setText(msg);
    }

}
