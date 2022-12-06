package com.card.exercise.format;

import com.card.exercise.Card;
import com.card.exercise.Spot;
import com.card.exercise.Suit;
import org.apache.commons.lang3.StringUtils;

/**
 * Utility method for cards
 */
public class CardFormat {

    /**
     * return first letter of the spot value
     *
     * @param spot the spot value
     * @return first letter of spot value
     */
    public static String observationOf(final Spot spot) {
        if (spot == null) throw new IllegalArgumentException("Invalid spot value");

        if (spot.isDigit()) {
            return spot.value.toString();
        } else {
            return spot.name().substring(0, 1);
        }
    }

    /**
     * return spot and suit value
     *
     * @param card the card
     * @return
     */
    public static String observationOf(final Card card) {
        if (card != null) {
            return observationOf(card.getSpot()) + Suit.getFirstChar(card.getSuit());
        }
        throw new IllegalArgumentException("Invalid Card value");
    }

    /**
     * Capitalize the given value
     *
     * @param str the string value
     * @return capitalize value
     */
    public static String capitalize(String str) {
        if (!StringUtils.isEmpty(str)) {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
        return str;
    }

    /**
     * return value of given suit
     *
     * @param suit the suit value
     * @return
     */
    public static String nameOf(Suit suit) {
        if (suit != null) {
            return capitalize(suit.name());
        }
        throw new IllegalArgumentException("Invalid suit value");
    }

    /**
     * return value of spot value
     *
     * @param spot the spot value
     * @return
     */
    public static String nameOf(Spot spot) {
        if (spot != null) {
            return (spot.isDigit()) ? spot.getValue().toString() : capitalize(spot.name());
        }
        throw new IllegalArgumentException("Invalid Spot value");
    }

    /**
     * return value of given card
     *
     * @param card the card value
     * @return
     */
    public static String nameOf(Card card) {
        if (card != null) {
            return nameOf(card.getSpot()) + " of " + nameOf(card.getSuit());
        }
        throw new IllegalArgumentException("Invalid Card");
    }
}