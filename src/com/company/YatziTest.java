package com.company;

import org.junit.jupiter.api.*;
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
            dices[i].value = 6;
        }
        for(Face face : dices) { assertEquals(6, face.value, "Not six"); }

    }

    @Test
    @DisplayName("testing when dice are not all equal")
    void isNotYatziWhenOneFaceIsNotMatchingTheOther() {
        Face[] dices = new Face[5];
        for(int i = 0; i < dices.length; i++) {
            dices[i] = new Face();
            dices[i].value = 6;
        }
        dices[4].value = 1;
        for(Face face : dices) { assertEquals(6, face.value, "Not six"); }
    }
}
