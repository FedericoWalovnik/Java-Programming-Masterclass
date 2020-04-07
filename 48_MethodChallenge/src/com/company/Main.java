package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int positionPlayer1 = CalculatedHighScorePosition(1500);
        int positionPlayer2 = CalculatedHighScorePosition(900);
        int positionPlayer3 = CalculatedHighScorePosition(400);
        int positionPlayer4 = CalculatedHighScorePosition(50);

        DisplayHighScorePosition("Raul",positionPlayer1);
        DisplayHighScorePosition("Juan",positionPlayer2);
        DisplayHighScorePosition("Manuel",positionPlayer3);
        DisplayHighScorePosition("Juana",positionPlayer4);


    }

    public static void DisplayHighScorePosition(String playerName, int tablePosition){
        System.out.println(playerName + " managed to get into position " + tablePosition + " on the high scpre table");
    }

    public static int CalculatedHighScorePosition(int playerScore){
        int position=4;
        if (playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500 & playerScore < 1000){
            position = 2;
        }
        else if(playerScore >= 100 & playerScore < 500){
            position = 3;
        }

        return position;
    }
}

