package com.company;

import java.util.Scanner;

public class YatziMain {
    public static int turn = 1;
    public static boolean GameIsOn = true;

    public static void main(String[] args) {
        Dice.initDices();
        while(GameIsOn && turn < 4) {
           if(turn == 1) {
               System.out.println("Welcome to Yatzi!");
           }
               startingTurn(turn);
               Dice.rollYourDices();
               Dice.printYourDices();
           if(didYouGetYatzi(Dice.dice)) {
                youGotYatzi(Dice.dice);
            } else if(turn < 3) {
                howToContinue("Want to throw again? (y for yes, anything else for no)");
            } else {
                howToContinue("Game over! Want to play again?");
            }
            if(!GameIsOn) {
                break;
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

    public static boolean wannaPlay() {
        Scanner sc = new Scanner(System.in);
        return sc.next().toLowerCase().equals("y");
    }

    public static void startingTurn(int turn) {
        System.out.println("Starting turn " + turn + " of 3, rolling dice.");
    }

    public static void howToContinue(String msg) {
        System.out.println(msg);
        if(wannaPlay()) {
            if (msg.equals("Want to throw again? (y for yes, anything else for no)")) {
                turn++;
            } else {
                turn = 1;
            }
        } else { GameIsOn = false; }
    }

}