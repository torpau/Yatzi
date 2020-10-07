package com.company;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class YatziTest {

    @Test
    @DisplayName("testing when all dices are the same")
    void isYatziWhenAllDiceMatches() {
        int[] dice = {6,6,6,6,6};
        for(int content : dice) { assertEquals(6, content, "Not six"); }

    }

    @Test
    @DisplayName("testing when dice are not all equal")
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }
        dice[5].value = 1;
        for(Die die: dice) { assertEquals(6, die.value, "Not six"); }
    }
}
