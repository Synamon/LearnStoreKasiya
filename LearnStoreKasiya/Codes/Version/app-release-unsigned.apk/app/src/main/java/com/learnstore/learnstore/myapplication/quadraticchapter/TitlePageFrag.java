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
public class TitlePageFrag extends Fragment {

    View myView;
    TextView tvTitle;
    TextView tvSubTitle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.title_page_template,container,false);

        //Initializing the TextViews and setting their text
        tvTitle = (TextView) myView.findViewById(R.id.tvTitleFragTitle);
        tvSubTitle = (TextView) myView.findViewById(R.id.tvTitleFragSubTit);

        tvTitle.setText(R.string.quadraticTitle);
        tvSubTitle.setText(R.string.quadraticSubTitle);



        return myView;
    }
}
