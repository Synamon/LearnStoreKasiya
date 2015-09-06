package com.learnstore.learnstore.myapplication.quadraticchapter;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.learnstore.learnstore.myapplication.R;

/**
 * Created by Den2 on 9/4/2015.
 */
public class LessonContentFrag1 extends Fragment {

    View myView;
    TextView tvTitle;
    TextView tvDisplayContent;
    TextView tvLessonText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.lesson_content_fragtemp, container, false);


        //Initializing the TextViews and setting their text
        tvTitle = (TextView) myView.findViewById(R.id.tvLessonFragTitle);
        tvDisplayContent = (TextView) myView.findViewById(R.id.tvLessonFragDisplayContent);
        tvLessonText = (TextView) myView.findViewById(R.id.tvLessonFragLessonText);

        tvTitle.setText(R.string.quadraticLessonTitle);
        tvDisplayContent.setText(R.string.quadraticLessonTDisplay);
        tvLessonText.setText(R.string.quadraticLessonText);

        return myView;
    }
}
