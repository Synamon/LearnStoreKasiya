package com.learnstore.learnstore.myapplication.quadraticchapter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.learnstore.learnstore.myapplication.R;

/**
 * Created by Den2 on 9/4/2015.
 */
public class LessonContentFrag6 extends Fragment {

    View myView;
    TextView tv;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.butfirstlayout, container, false);
        tv =(TextView) myView.findViewById(R.id.tVButFirstText);
        tv.setText("Good Luck!");
        return myView;
    }
}
