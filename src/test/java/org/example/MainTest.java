package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void play_return1_whenCalledWith1() {
        int number = 1;
        String expected = "1";
        String actual = Main.play(number);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void play_returnFizzBuzz_whenCalledWith15(){
        int number = 15;
        String expected = "fizz buzz";
        String actual = Main.play(number);
        Assertions.assertEquals(expected, actual);
    }
}