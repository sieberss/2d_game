package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void getX_returns0() {
        int expected = 0;
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

}