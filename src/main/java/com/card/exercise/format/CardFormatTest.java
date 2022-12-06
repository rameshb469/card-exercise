package com.card.exercise.format;

import com.card.exercise.Card;
import com.card.exercise.Spot;
import com.card.exercise.Suit;

public class CardFormatTest {

    public static void main(String[] args) {
        System.out.println("------------CardFormat.observationOf(spot)--------------------------");
        for (Spot spot : Spot.values()){
            System.out.println(CardFormat.observationOf(spot));
        }
        System.out.println("-------------CardFormat.observationOf(card)-------------------------");
        for (Suit suit : Suit.values()) {
            for (Spot spot : Spot.values()) {
                Card card= new Card(suit, spot);
                System.out.println(CardFormat.observationOf(card));
            }
        }
        System.out.println("------------CardFormat.nameOf(suit)--------------------------");
        for (Suit suit : Suit.values()){
            System.out.println(CardFormat.nameOf(suit));
        }

        System.out.println("---------------------CardFormat.nameOf(spot)---------------------------------");
        for (Spot spot : Spot.values()){
            System.out.println(CardFormat.nameOf(spot));
        }

        System.out.println("--------------------CardFormat.nameOf(card)----------------------------------");
        for (Suit suit : Suit.values()) {
            for (Spot spot : Spot.values()) {
                Card card= new Card(suit, spot);
                System.out.println(CardFormat.nameOf(card));
            }
        }
    }
}
