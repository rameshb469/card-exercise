package com.card.exercise;

public enum Suit {

    CLUBS, DIAMONDS, HEARTS,SPADES;

    public static String getFirstChar(final Suit suit){
        if (suit != null){
            return suit.name().substring(0, 1);
        }
        throw new IllegalArgumentException("Invalid Suit value");
    }
}
