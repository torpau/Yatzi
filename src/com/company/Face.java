package com.company;

public class Face extends BoardGameMaterial {
    public int value = rollDice();

    /* används inte
    public Face() {
        value = (int) Math.random();
    }
     */

    /* ersatt med rollDice
    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }
     */

    public int rollDice(){ return Math.toIntExact(Math.round(Math.random()*6+1)); }

    /*
    public int DieReroll() {
        return DieRoll();
    }           //ta bort. används inte.
*/
    public String getString() {
        return "Dice shows " + value;
    }
}
