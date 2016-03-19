package com.team360.magictrades;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jonth on 3/9/2016.
 */
public class History {

    private ArrayList<HashMap<String,ArrayList<Card>>> historyList;

    History(){
        historyList = new ArrayList<HashMap<String,ArrayList<Card>>>();
    }

    public void save(HashMap cardsLists){

        //store hashmap in historyList

    }

    public ArrayList getHistoryList(){

        return historyList;
    }

    public void clearHistory(){

    }

}
