package com.example.andy1.poker;

import java.util.Random;

public class Poker {

    Card [] card = new Card [52];

    public Poker (){
        for ( int i = 0 ; i < 52 ; i++){
            card [i] = new Card(i);
        }

    }
    public void shuffle(){
        for (int i=0 ; i <52; i++ ){
            int r = new Random().nextInt(52);
            Card tmp = card [i];
            card [i] = card[r];
            card [r] = tmp;

        }
    }
}
