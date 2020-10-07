package com.company;

import java.util.Scanner;

public class YatziMain {
    public static Face[] ds;
    public static boolean bGameIsOn = true;

    public static void main(String[] args) {
        int iturn = 0;
        ds = new Face[5];
        for(int d=0;d<5;d++) {
            ds[d] = new Face();
        }
        //We will continue until the game is over
        while(bGameIsOn == true) {
            iturn = 0;              // ett istället (int round)
            System.out.println("Welcome to Yatzi!");
            while(iturn < 3) {
                System.out.println("Starting turn " + (iturn+1) + " of 3, rolling dice.");
                for(int i=0;i<ds.length;i++) {
                    ds[i].DieRoll();
                    System.out.println(i + ": " + ds[i].getString());
                }

                //YATZI
                /* ersatt med didYouGotYatzi(Face[] ds)
                boolean flag = true;
                for(int j=1;j<5;j++) {
                    if(ds[j].value!=ds[j-1].value) {
                        //Set flag to false
                        flag = false;
                    }
                }
                 */

                if(didYouGotYatzi(ds)) {
                    /* ersatt med youGotYatzi(Face[] ds)
                    System.out.println("You got YATZI! in " + ds[0].value + "'s");
                     */
                    youGotYatzi(ds);
                    return;
                } else {
                    //Here we check if there is no Yatzy: then we check what turn we are on and asks the player if we want to continue or not
                    if(iturn != 2) {
                        System.out.println("Want to throw again? (y for yes, anything else for no)");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            ++iturn;
                        } else {
                            bGameIsOn = !bGameIsOn;
                            break;
                        }
                    } else {
                        System.out.println("Game over! Want to play again?");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            iturn = 0;
                        } else {
                            bGameIsOn = !bGameIsOn;
                            break;
                        }
                    }
                }
            }
        }
    }
    public static boolean didYouGotYatzi(Face[] ds) {
        boolean isYatzi = true;
        for (int j = 1; j < 5; j++) {
            if(ds[j].value != ds[j - 1].value){ return false; }
        }
        return isYatzi;
    }

    public static void youGotYatzi(Face[] ds){
        System.out.println("You got YATZI! in " + ds[0].value + "'s");
    }
}