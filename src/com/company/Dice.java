package com.company;

public class Dice {
    private int value;
    public static Dice[] dice;

    public Dice() { value = 0; }

    public void rollDice() { this.value = (int)(Math.random() * 6 + 1); }

    public void setDiceValue(int value){ this.value = value; }

    public int getDiceValue() { return this.value; }

    public String getString() { return "Dice shows " + value; }


    public static void initDices() {
        dice = new Dice[5];
        for(int i = 0; i < 5; i++) {
            dice[i] = new Dice();
        }
    }

    public static void rollYourDices() {
        for(int i = 0; i < dice.length; i++) {
            dice[i].rollDice();
        }
    }

    public static void printYourDices() {
        for(int i = 0; i < dice.length; i++) {
            System.out.println(i + 1 + ": " + dice[i].getString());
        }
    }
}
