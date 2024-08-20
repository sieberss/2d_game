package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



    }




    public static String play(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizz buzz";
        } ;
        if (number % 3 == 0) {
            return "fizz";
        } ;
        if (number % 5 == 0) {
            return "buzz";
        } ;
        return "" + number; // macht Zahl zu String
    }
}