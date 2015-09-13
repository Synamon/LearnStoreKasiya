package com.example.den2.excerciseactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Den2 on 9/7/2015.
 */
public class DynamicCreator extends LinearLayout {




    public DynamicCreator(Context context) {
        super(context);

        EditText firstText = new EditText(context);
        EditText secondText = new EditText(context);
       TrailView testing = new TrailView(context);

        this.addView(firstText);
        this.addView(secondText);
        addView(testing);


    }
}