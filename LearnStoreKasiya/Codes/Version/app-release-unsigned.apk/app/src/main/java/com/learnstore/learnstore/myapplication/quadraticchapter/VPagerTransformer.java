package com.learnstore.learnstore.myapplication.quadraticchapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.learnstore.learnstore.myapplication.R;

import org.w3c.dom.Text;

/**
 * Created by Den2 on 9/4/2015.
 */
public class VPagerTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {

        TextView tvTitleFragTitle = (TextView) page.findViewById(R.id.tvTitleFragTitle);
        TextView tvTitleFragSubTitle = (TextView) page.findViewById(R.id.tvTitleFragSubTit);

       View theBar = page.findViewById(R.id.theBar);
        TextView tvLessonFragTitle = (TextView) page.findViewById(R.id.tvLessonFragTitle);
        TextView tvLessonFragDisplay = (TextView) page.findViewById(R.id.tvLessonFragDisplayContent);
        TextView tvLessonFragLessonText = (TextView) page.findViewById(R.id.tvLessonFragLessonText);


        int pageWidth = page.getWidth();
        int pageHeight = page.getHeight();


        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 1) { // [-1,1]

            if (tvTitleFragTitle != null) {
                tvTitleFragTitle.setTranslationX((position) * (pageWidth / 2));

            }

            if (tvTitleFragSubTitle != null) {
                tvTitleFragSubTitle.setTranslationX((position) * (pageWidth / 4));
            }

            //LoL! how did I even do thisXD
            if (theBar != null && position>0) {
                theBar.setTranslationY((position) * (pageHeight / 4));
            }

            if (tvLessonFragTitle != null) {
                tvLessonFragTitle.setTranslationX((position) * (pageWidth / 2));
            }
            if (tvLessonFragDisplay != null) {
                tvLessonFragDisplay.setTranslationX((position) * (pageWidth / 1));
            }
            if (tvLessonFragLessonText != null) {
                tvLessonFragLessonText.setTranslationX((position) * (pageWidth / 4));
            }

        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);

        }

    }
}
