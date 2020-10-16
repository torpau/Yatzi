package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    public final DiceRoll[] dices = new DiceRoll[5];

    @Test
    @DisplayName("testing when all dices are the same")
    void isYatziWhenAllFacesMatches() {
        for(int i = 0; i < 5; i++ ) {
            dices[i] = new DiceRoll();
            dices[i].setDiceValue(6);
        }
        for(DiceRoll dice : dices) { assertEquals(6, dice.getDiceValue(), "No Yatzi"); }

        if(YatziMain.didYouGetYatzi(dices)) { YatziMain.youGotYatzi(dices); }
    }

    @Test
    @DisplayName("testing when dices are not all equal")
    void isNotYatziWhenOneFaceIsNotMatchingTheOther() {
        //DiceRoll[] dices = new DiceRoll[5];
        for (int i = 0; i < dices.length; i++) {
            dices[i] = new DiceRoll();
            dices[i].setDiceValue(6);
        }
        dices[4].setDiceValue(1);

        assertFalse(YatziMain.didYouGetYatzi(dices), "Wrong, all the dices are equal");
    }
}
