package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class YatziTest {

    @Test
    @DisplayName("testing when all dices are the same")
    void isYatziWhenAllFacesMatches() {
        Dice[] dices = new Dice[5];
        for(int i = 0; i < dices.length; i++ ) {
            dices[i] = new Dice();
            dices[i].setDiceValue(6);
        }
        for(Dice dice : dices) { assertEquals(6, dice.getDiceValue(), "No Yatzi"); }

        if(YatziMain.didYouGetYatzi(dices)) { YatziMain.youGotYatzi(dices); }
    }

    @Test
    @DisplayName("testing when dices are not all equal")
    void isNotYatziWhenOneFaceIsNotMatchingTheOther() {
        Dice[] dices = new Dice[5];
        for(int i = 0; i < dices.length; i++) {
            dices[i] = new Dice();
            dices[i].setDiceValue(6);
        }
        dices[4].setDiceValue(1);
        for(Dice dice : dices) { assertEquals(6, dice.getDiceValue(), "No Yatsi"); }
    }
}
