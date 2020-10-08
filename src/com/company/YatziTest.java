package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class YatziTest {

    @Test
    @DisplayName("testing when all dices are the same")
    void isYatziWhenAllFacesMatches() {
        Face[] dices = new Face[5];

        for(int i = 0; i < dices.length; i++ ) {
            dices[i] = new Face();
            dices[i].setDiceValue(6);
        }        for(Face face : dices) { assertEquals(6, face.getDiceValue(), "Not six"); }

        if(YatziMain.didYouGetYatzi(dices)) { YatziMain.youGotYatzi(dices); }

    }

    @Test
    @DisplayName("testing when dice are not all equal")
    void isNotYatziWhenOneFaceIsNotMatchingTheOther() {
        Face[] dices = new Face[5];
        for(int i = 0; i < dices.length; i++) {
            dices[i] = new Face();
            dices[i].setDiceValue(6);
        }
        dices[4].setDiceValue(1);
        for(Face face : dices) { assertEquals(6, face.getDiceValue(), "Not six"); }
    }
}
