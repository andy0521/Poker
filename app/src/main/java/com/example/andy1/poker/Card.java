package com.example.andy1.poker;

public class Card {
    int value;
    char[] suits = {'\u2663', '\u2666', '\u2665', '\u2660'};
    public Card(int value){
        this.value= value;

    }

    public  String get(){
    return value % 13 +1 +" "+ suits[value/13];
    }
}
