package com.jshen;

public class Main {

    public static void main(String[] args) {
        int newScore1 = calculateScore("Sam", 100);
        System.out.println("new score " + newScore1);
        int newScore2 = calculateScore(200);
        System.out.println("new socre " + newScore2);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player and no score");
        return 0;
    }

//    public static void calculateScore(){
//        System.out.println("No player and no score");
//    }
//    error: same method name, same parameter, different return type
}
