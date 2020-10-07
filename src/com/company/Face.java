package com.company;

public class Face extends BoardGameMaterial {
    public int value = 0;


    public Face() { value = (int) Math.random(); }



    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    // varför fungerar inte denna?
    public int rollDice(){ return (int)(Math.random()*6+1); }

    /*
    public int DieReroll() {
        return DieRoll();
    }           //ta bort. används inte.
*/
    public String getString() {
        return "Dice shows " + value;
    }
}
