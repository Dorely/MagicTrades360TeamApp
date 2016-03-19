package com.team360.magictrades;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {


    HashMap<String, ArrayList<Card>> tradeLists; //this contains the trade lists
    ArrayList<Card> searchList; //this will be the list of cards to scroll through
    History history; //history contains any saved trades


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_menu);


        tradeLists = new HashMap<>();
        searchList = new ArrayList<Card>();
        history = new History();

        tradeLists.put("listOne",new ArrayList<Card>());
        tradeLists.put("listTwo",new ArrayList<Card>());

    }


    public void search(){
        //this method will be called when the searchbox has a type event happen
    }

    public void viewHistory(){
        //this method will be called when the user touches the History Button
    }

    public void saveTrade(){
        //this method will be called when the user touches the save button
    }

    public void clearAll(){
        //this method will be called when the user touches the clear all button
    }

    public void addToListOne(){
        //this method will be called when a user drags a card image to the left side, or to list one
    }

    public void addToListTwo(){
        //this method will be called when a user drags a card image to the right side, or to list two
    }

    public void showListOne(){
        //this method will be called when the user touches the left list button
    }

    public void showListTwo(){
        //this method will be called when the user touches the right list button
    }

    public void clearListOne(){
        //this method will be called when a user touches the clear button inside the first list extended view
    }

    public void clearListTwo(){
        //this method will be called when a user touches the clear button inside the second list extended view
    }


}
