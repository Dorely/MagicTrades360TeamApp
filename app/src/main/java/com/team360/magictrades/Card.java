package com.team360.magictrades;

/**
 * Created by jonth on 3/9/2016.
 */
public class Card {

    private String cardName;
    private String cardSet;
    private String cardImageUrl;
    private double cardPrice;
    private double cardFoilPrice;
    //I may also want to store an image here


    Card(String cardName,String cardSet, double cardPrice, double cardFoilPrice){
        this.cardName = cardName;
        this.cardSet = cardSet;
        this.cardPrice = cardPrice;
        this.cardFoilPrice = cardFoilPrice;
        this.cardImageUrl = null;
    }

    public void generateUrl(String cardName,String cardSet){
        //logic for generating Image url goes here
        String url = null;
        this.cardImageUrl = url;
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardSet() {
        return cardSet;
    }

    public String getCardImageUrl() {
        return cardImageUrl;
    }

    public double getCardPrice() {
        return cardPrice;
    }

    public double getCardFoilPrice() {
        return cardFoilPrice;
    }
}
