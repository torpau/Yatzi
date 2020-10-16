package com.company;

public class DiceRoll {
    private int value;
    private final DiceRoll[] dices;

    public DiceRoll() {
        value = 0;
        dices = new DiceRoll[5];
    }

    public DiceRoll[] getDices() { return dices; }

    public void rollDice() { this.value = (int)(Math.random() * 6 + 1); }

    public void setDiceValue(int value){ this.value = value; }

    public int getDiceValue() { return this.value; }

    public String getString() { return "Dice shows " + value; }


    public void initDices(DiceRoll diceRoll) {
        for(int i = 0; i < 5; i++) {
            dices[i] = new DiceRoll();
        }
    }

    public void rollYourDices() {
        for(int i = 0; i < dices.length; i++) {
            dices[i].rollDice();
        }
    }

    public void printYourDices() {
        for(int i = 0; i < dices.length; i++) {
            System.out.println(i + 1 + ": " + dices[i].getString());
        }
    }
}
