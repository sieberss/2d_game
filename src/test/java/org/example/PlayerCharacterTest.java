package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void getX_returns0() {
        PlayerCharacter.x = 0;
        int expected = 0;
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);

    }

    @Test
    void getY_returns0() {

        int expected = 0;
        int actual = PlayerCharacter.getY();
        assertEquals(expected, actual);

    }

    @Test
    void move_yShouldBe1_whenCalledWithW() {
        char userInput = 'W';
        int expected = 1;
        PlayerCharacter.move(userInput); // move hat keinen return, wird nur ausgeführt
        int actual = PlayerCharacter.y;
        assertEquals(expected, actual);


    }

}