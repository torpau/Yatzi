package com.company;

public class Face extends BoardGameMaterial {
    public int value = 0;

    public Face() {
        value = (int) Math.random();
    }

    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    public int DieReroll() {
        return DieRoll();
    }

    public String getString() {
        return "Dice shows " + value;
    }
}
