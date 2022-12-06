package com.card.exercise;

public class Card {

    private final Suit suit;
    private final Spot spot;
    public Card(Suit suit, Spot spot ){
        this.suit = suit;
        this.spot = spot;
    }

    public Spot getSpot() {
        return spot;
    }

    public Suit getSuit() {
        return suit;
    }
}
