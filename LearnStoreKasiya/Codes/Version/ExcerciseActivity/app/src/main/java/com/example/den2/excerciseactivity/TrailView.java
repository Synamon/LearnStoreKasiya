package com.example.den2.excerciseactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Den2 on 9/7/2015.
 */
public class TrailView extends LinearLayout {

    EditText firstText;
    EditText secondText;


    public TrailView(Context context) {
        super(context);
        String inflaterService = context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater layoutInflater;

        layoutInflater = (LayoutInflater) getContext().getSystemService(inflaterService);
         layoutInflater.inflate(R.layout.factor_pair_unit,this,true);
                }
}
