package com.company;

public class Dice {
    private int value;

    public Dice() { value = 0; }

    public void rollDice() { this.value = (int)(Math.random() * 6 + 1); }

    public void setDiceValue(int value){ this.value = value; }

    public int getDiceValue() { return this.value; }

    public String getString() { return "Dice shows " + value; }


    public static void initDices() {
        YatziMain.dice = new Dice[5];
        for(int i = 0; i < 5; i++) {
            YatziMain.dice[i] = new Dice();
        }
    }

    public static void rollYourDices() {
        for(int i = 0; i < YatziMain.dice.length; i++) {
            YatziMain.dice[i].rollDice();
        }
    }

    public static void printYourDices() {
        for(int i = 0; i < YatziMain.dice.length; i++) {
            System.out.println(i + 1 + ": " + YatziMain.dice[i].getString());
        }
    }
}
