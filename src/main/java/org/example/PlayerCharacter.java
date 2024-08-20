package org.example;

public class PlayerCharacter {

    static int x = 0;
    static int y = 0;

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static void move(char userInput) {
        if (userInput == 'W') {
            y++;
        }
        ;
        if (userInput == 'S') {
            y--;
        }
        ;
        if (userInput == 'D') {
            x++;
        }
        ;
        if (userInput == 'A') {
            x--;
        }

    } }
