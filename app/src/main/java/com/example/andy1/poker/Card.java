package com.example.andy1.poker;

public class Card {
    int value;
    char[] suits = {'\u2663', '\u2666', '\u2665', '\u2660'};
    public Card(int value){
        this.value= value;

    }

    public  String get(){
        if (value%13+1 == 1){
            return  "A"+ " "+suits[value/13];
        }
        if (value%13+1 ==11){
            return  "J"+ " "+suits[value/13];
        }
        if (value%13+1 ==12){
            return  "Q"+ " "+suits[value/13];
        }
        if (value%13+1 ==13){
            return  "K"+ " "+suits[value/13];
        }
    return value % 13 +1 +" "+ suits[value/13];

    }
}
