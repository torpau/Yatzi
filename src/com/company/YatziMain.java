package com.company;

import java.util.Scanner;

public class YatziMain {
    public static Face[] dice;
    public static boolean GameIsOn = true;

    public static void main(String[] args) {
        int turn = 1;
        initDices();
        while (GameIsOn) {
            System.out.println("Welcome to Yatzi!");
            while (turn < 4) {
                startingTurn(turn);
                for (int i = 0; i < dice.length; i++) {
                    dice[i].rollDice();
                }
                for (int i = 0; i < dice.length; i++) {
                    System.out.println(i+1 + ": " + dice[i].getString());
                }

                if (didYouGetYatzi(dice)) {
                    youGotYatzi(dice);
                } else {
                    if (turn < 3) {
                        if (wannaPlay("Want to throw again? (y for yes, anything else for no)")){
                            turn++;
                        } else {
                            GameIsOn = false;
                            break;
                        }
                    } else {
                        if (wannaPlay("Game over! Want to play again?")) {
                            turn = 1;
                        } else {
                            GameIsOn = false;
                            break;
                        }
                    }
                }
            }
        }
    }

    public static boolean didYouGetYatzi(Face[] ds) {
        boolean isYatzi = true;
        for (int j = 1; j < 5; j++) {
            if (ds[j].getDiceValue() != ds[j - 1].getDiceValue()) {
                return false;
            }
        }
        return isYatzi;
    }

    public static void youGotYatzi(Face[] ds) {
        System.out.println("You got YATZI! in " + ds[0].getDiceValue() + "'s");
    }

    public static boolean wannaPlay(String text){
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        return sc.next().toLowerCase().equals("y");
    }

    public static void startingTurn(int turn){
        System.out.println("Starting turn " + turn + " of 3, rolling dice.");
    }

    public static void initDices(){
        dice = new Face[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Face();
        }
    }

    public static void rollYourDices(){
        for(int i = 0; i < dice.length; i++){
            dice[i].rollDice();
        }
    }

}