package com.company;

import java.util.Scanner;

public class YatziMain {
    public static int turn = 1;
    public static Dice[] dice;
    public static boolean GameIsOn = true;

    public static void main(String[] args) {
        Dice.initDices();
        while(GameIsOn) {
            System.out.println("Welcome to Yatzi!");
            while(turn < 4) {
                startingTurn(turn);
                Dice.rollYourDices();
                Dice.printYourDices();
                if(didYouGetYatzi(dice)) {
                    youGotYatzi(dice);
                } else if(turn < 3) {
                    howToContinue("message1");
                } else {
                    howToContinue("message2");
                }
                if(!GameIsOn) {
                    break;
                }
            }
        }
    }

    public static boolean didYouGetYatzi(Dice[] dice) {
        for(int i = 1; i < 5; i++) {
            if(dice[i].getDiceValue() != dice[i - 1].getDiceValue()) {
                return false;
            }
        }
        return true;
    }

    public static void youGotYatzi(Dice[] dice) {
        System.out.println("You got YATZI! in " + dice[0].getDiceValue() + "'s");
    }

    public static boolean wannaPlay(String text) {
        if(text.equals("message1")) {
            System.out.println("Want to throw again? (y for yes, anything else for no)");
        } else {
            System.out.println("Game over! Want to play again?");
        }

        Scanner sc = new Scanner(System.in);
        return sc.next().toLowerCase().equals("y");
    }

    public static void startingTurn(int turn) {
        System.out.println("Starting turn " + turn + " of 3, rolling dice.");
    }

    public static void howToContinue(String msg) {
        if(msg.equals("message1") && wannaPlay("message1")) {
            turn++;
        } else if(msg.equals("message2") && wannaPlay("message2")) {
            turn = 1;
        } else {
            GameIsOn = false;
        }
    }

}