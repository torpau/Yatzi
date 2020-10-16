package com.company;

import java.util.Scanner;

public class YatziMain {
    private int turn = 1;
    private boolean gameIsOn = true;

    public YatziMain() {
        mainGame();
    }

    public static void main(String[] args) {
        new YatziMain();
    }

    public void mainGame() {
        DiceRoll diceRoll = new DiceRoll();
        diceRoll.initDices(diceRoll);
        while (gameIsOn && turn < 4) {
            if (turn == 1) {
                System.out.println("Welcome to Yatzi!");
            }
            startingTurn(turn);
            diceRoll.rollYourDices();
            diceRoll.printYourDices();
            if (didYouGetYatzi(diceRoll.getDices())) {
                youGotYatzi(diceRoll.getDices());
            } else if (turn < 3) {
                howToContinue("Want to throw again? (y for yes, anything else for no)");
            } else {
                howToContinue("Game over! Want to play again?");
            }
            if (!gameIsOn) {
                break;
            }
        }
    }

    public static boolean didYouGetYatzi(DiceRoll[] dices) {
        for(int i = 1; i < 5; i++) {
            if(dices[i].getDiceValue() != dices[i - 1].getDiceValue()) {
                return false;
            }
        }
        return true;
    }

    public static void youGotYatzi(DiceRoll[] dices) {
        System.out.println("You got YATZI! in " + dices[0].getDiceValue() + "'s");
    }

    public boolean wannaPlay() {
        Scanner sc = new Scanner(System.in);
        return sc.next().toLowerCase().equals("y");
    }

    public void startingTurn(int turn) {
        System.out.println("Starting turn " + turn + " of 3, rolling dice.");
    }

    public void howToContinue(String msg) {
        System.out.println(msg);
        if(wannaPlay()) {
            if (msg.equals("Want to throw again? (y for yes, anything else for no)")) {
                turn++;
            } else {
                turn = 1;
            }
        } else { gameIsOn = false; }
    }

}