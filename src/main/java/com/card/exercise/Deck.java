package com.card.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An object of type Deck represents an ordinary deck of 52 playing cards.
 * The deck can be shuffled, and cards can be dealt from the deck.
 */
public class Deck {

    private List<Card> cards; // 52 cards

    /**
     * Initialize the deck with 52 cards
     */
    public Deck() {
        cards = new ArrayList<>(52);
        for (Suit suit : Suit.values()) {
            for (Spot spot : Spot.values()) {
                cards.add(new Card(suit, spot));
            }
        }
        this.shuffle();
    }

    /**
     * Shuffle
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void sort() {

    }

    /**
     * Deal method
     *
     * @return @{@link Card}
     */
    public Card deal() {
        if (this.cards.size() == 0)
            shuffle();
        return cards.remove(0);
    }

    public boolean isCardAvailable() {
        return (this.cards.size() > 0);
    }

    public int cardsLeft() {
        return 52 - this.cards.size();
    }

    public List<Card> getCards() {
        return cards;
    }
}
