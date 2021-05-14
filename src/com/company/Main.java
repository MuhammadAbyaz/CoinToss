package com.company;

import java.util.Random;

public class Main {

    public String tossACoin(){
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0){
            return "HEADS";
        }
        else {
            return "TAILS";
        }
    }

    public static void main(String[] args) {
        Main game = new Main();
        System.out.println(game.tossACoin());
    }
}
