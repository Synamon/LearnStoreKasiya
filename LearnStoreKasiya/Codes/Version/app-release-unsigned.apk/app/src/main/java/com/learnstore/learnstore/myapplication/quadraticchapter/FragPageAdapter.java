package com.learnstore.learnstore.myapplication.quadraticchapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Den2 on 9/4/2015.
 */
public class FragPageAdapter extends FragmentPagerAdapter{

    public FragPageAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return new TitlePageFrag();
            case 1:
               return new LessonContentFrag1();
            case 2:
                return new LessonContentFrag2();
            case 3:
                return new LessonContentFrag3();
            case 4:
                return new LessonContentFrag4();
            case 5:
                return new LessonContentFrag5();
            case 6:
                return new LessonContentFrag6();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 7;
    }
}
