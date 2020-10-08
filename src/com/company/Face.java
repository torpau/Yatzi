package com.company;

public class Face {
    private int value;

    public Face() { value = 0; }

    public void rollDice() { this.value = (int) (Math.random() * 6 + 1); }

    public void setDiceValue(int value){ this.value = value; }

    public int getDiceValue() { return this.value; }

    public String getString() { return "Dice shows " + value; }
}
