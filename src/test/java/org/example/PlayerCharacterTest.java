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
        PlayerCharacter.y = 0; PlayerCharacter.x = 0;
        char userInput = 'W';
        int expected = 1;
        PlayerCharacter.move(userInput); // move hat keinen return, wird nur ausgeführt
        int actual = PlayerCharacter.y;
        assertEquals(expected, actual);
    }

    @Test
    void move_yShouldBeMinus1_whenCalledWithS() {
        PlayerCharacter.y = 0; PlayerCharacter.x = 0;
        char userInput = 'S';
        int expected = -1;
        PlayerCharacter.move(userInput); // move hat keinen return, wird nur ausgeführt
        int actual = PlayerCharacter.y;
        assertEquals(expected, actual);
    }

    @Test
    void move_xShouldBe1_whenCalledWithD() {
        PlayerCharacter.y = 0; PlayerCharacter.x = 0;
        char userInput = 'D';
        int expected = 1;
        PlayerCharacter.move(userInput); // move hat keinen return, wird nur ausgeführt
        int actual = PlayerCharacter.x;
        assertEquals(expected, actual);
    }

    @Test
    void move_xShouldBeMinus1_whenCalledWithA() {
        PlayerCharacter.y = 0; PlayerCharacter.x = 0;
        char userInput = 'A';
        int expected = -1;
        PlayerCharacter.move(userInput); // move hat keinen return, wird nur ausgeführt
        int actual = PlayerCharacter.x;
        assertEquals(expected, actual);
    }

}