package com.card.exercise;

import java.util.ArrayList;
import java.util.List;

import static com.card.exercise.Spot.isAce;

public class PlayerHand {

    private Player owner;
    private int wager;

    private List<Card> cards;

    private Card dealerCard;

    private int ID;

    private boolean doubled;

    private int points = 0;

    public PlayerHand(final Player owner, final int wager,
                      final Card ownerCard, final Card dealerCard){
        this.cards = new ArrayList<>();
        this.owner = owner;
        this.wager = wager;
        this.dealerCard = dealerCard;
        this.cards.add(ownerCard);
    }

    public BlackJack.Action secondCard(final Card card){
        if (card != null){
            this.cards.add(card);
            return BlackJack.Action.NONE;
        }
        throw new IllegalArgumentException("Invalid card");
    }

    public boolean isBust(){
        return (this.points > 21);
    }

    public boolean isBlackJack(){
        boolean ace = false;
        for (Card card : this.cards) {
            if (isAce(card.getSpot())){
                ace = true;
            } else {
                this.points += (card.getSpot().isDigit) ? card.getSpot().value : 10;
            }
        }

        // Now, val is the value of the hand, counting any ace as 1.
        // If there is an ace, and if changing its value from 1 to
        // 11 would leave the score less than or equal to 21,
        // then do so by adding the extra 10 points to val.

        if ( ace == true  &&  this.points + 10 <= 21 )
            this.points = this.points + 10;
        return (this.points == 21);
    }

    public  boolean shouldHit(){
        return (this.points < 16);
    }

    public void hit(Card card){
        this.cards.add(card);
    }

    public void winOrLoose(int value){
        this.owner.winOrLose(value);
    }

    public void dubble(Card card){

    }

    public List<PlayerHand> split(final Card ownerCard, final Card dealerCard){
        return null;
    }
    public Player getOwner() {
        return owner;
    }

    public int getWager() {
        return wager;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public boolean isDoubled() {
        return doubled;
    }
}
