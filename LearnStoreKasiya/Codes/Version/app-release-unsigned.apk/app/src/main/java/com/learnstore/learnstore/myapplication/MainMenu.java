package com.learnstore.learnstore.myapplication;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Den2 on 9/1/2015.
 */
public class MainMenu extends ListActivity{

    String classNames[] = {"Factors_Tutorial_Questions", "PlaceHolder",
                            "PlaceHolder2"};
    String displayNames[] = {"Quadratic Equations", "PlaceHolder",
            "PlaceHolder2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,displayNames));

    }

    protected void onListItemClick(ListView lv, View v, int position, long id){
        super.onListItemClick(lv,v,position,id);
        String openClass = classNames[position];
        try{
            Class selected = Class.forName("com.learnstore.learnstore.myapplication."+openClass);
            Intent selectedIntent = new Intent(this,selected);
            startActivity(selectedIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
