package com.card.exercise;

public class Player {
    private int bank;

    public Player(int bank){
        this.bank = bank;
    }

    public PlayerHand play(final Card ownerCard, final Card dealerCard){
        return new PlayerHand(this, 10, ownerCard, dealerCard);
    }

    public void winOrLose(int amount){
        this.bank-= amount;
    }

    public int getBank() {
        return bank;
    }
}
