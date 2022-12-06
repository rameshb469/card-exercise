package com.card.exercise;

/**
 * Spot enum
 */
public enum Spot {
    
    TWO(2, true),
    THREE(3, true),
    FOUR(4, true),
    FIVE(5, true),
    SIX(6, true),
    SEVEN(7, true),
    EIGHT(8, true),
    NINE(9, true),
    TEN(10, true),
    JACK(11, false),
    QUEEN(12, false),
    KING(13, false),
    ACE(1, false);

    public final Integer value;
    public final boolean isDigit;

    Spot(Integer value, boolean isDigit) {
        this.value = value;
        this.isDigit = isDigit;
    }

    public boolean isDigit() {
        return isDigit;
    }

    public Integer getValue() {
        return value;
    }

    public static boolean isAce(final Spot spot){
        return ACE.name().equals(spot.name());
    }
}
