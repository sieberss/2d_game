package org.example;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void play_return1_whenCalledWith1() {
        int number = 1;
        String expected = "1";
        String actual = Main.play(number);
        assertEquals(expected, actual);
    }


    @Test
    void play_returnFizzBuzz_whenCalledWith15() {
        int number = 15;
        String expected = "fizz buzz";
        String actual = Main.play(number);
        assertEquals(expected, actual);
    }

//    @Test
//    void moveCharacter_ifUserClicksW_CharacterMovesUp() {
//        String userInput = "W";
//        String[][] board = new String[3][3];
//        board[1][1] = "X";
//        String[][] actual = new String[3][3];
//        actual[1][0] = "X";
//        assert.Equals
//    }

    // Write a test that ensures the method getX in the class PlayerCharacter returns the value 0. Initially, the player should always be positioned in the middle of the game field.



}