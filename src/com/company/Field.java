package com.company;

public class Field {
    static char[][] playGround = new char[10][10];
    static String[] rawChars = {" ", " A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    static String[] columnNumbers = {"1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10"};

    static void initField() {
        for (int i = 0; i < playGround.length; i++) {
            for (int j = 0; j < playGround.length; j++) {
                playGround[i][j] = '*';
            }
        }
    }

    static void drawField() {
        for (int i = 0; i < rawChars.length; i++) {
            System.out.print(rawChars[i] + " ");
        }
        for (int i = 0; i < playGround.length; i++) {
            System.out.println();
            for (int j = 0; j < playGround.length; j++) {
                if (j == 0) {
                    System.out.print(columnNumbers[i] + " ");
                }
                System.out.print(playGround[j][i] + " ");
            }
        }
    }

}
