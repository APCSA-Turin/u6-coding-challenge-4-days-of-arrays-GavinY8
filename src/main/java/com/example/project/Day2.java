package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names) { // your will be tested on this method
        String[] goodbad = new String[names.length];


        for (int i = 0; i < names.length; i++) {
            int fate = (int)(Math.random() * 2);
            if (fate == 0) {
                goodbad[i] = "Nice";
            }
            else {
                goodbad[i] = "Naughty";
            }
        }


        String[] good = new String[names.length];
        String[] bad = new String[names.length];
        int idx1 = 0;
        int idx2 = 0;


        for (int i = 0; i < names.length; i++) {
            if (goodbad[i].equals("Nice")) {
                good[idx1] = names[i];
                idx1++;
            }
            else {
                bad[idx2] = names[i];
                idx2++;
            }
        }




        String[][] finalList = {good, bad};
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < names.length; j++)
                System.out.print(finalList[i][j]+" ");
              System.out.println();
        }


        return finalList; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        String[] temp = {"John", "Alex", "Lucy", "1", "2", "3", "4", "5", "6"};
        nameSort(temp);
    }
}