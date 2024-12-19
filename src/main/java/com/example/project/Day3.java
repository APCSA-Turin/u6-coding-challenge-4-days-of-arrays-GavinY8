package com.example.project;

  public class Day3 {
    public static String[][] generateSnowflake(int size) { //you will be tested on this method
      String[][] grid = new String[size][size];
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          grid[i][j] = " ";
        }
      }

      int testing = 0;

      for (int i = 0; i < size; i++) {
        int middle = size / 2;
          grid[i][middle] = "*";  //middle column
          grid[middle][i] = "*";
          grid[i][i] = "*";
          grid[size-i-1][i] = "*";
      }
      return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      for (int i = 0; i < snowflake.length; i++){
        for (int j = 0; j < snowflake.length; j++)
          System.out.print(snowflake[i][j]);
          System.out.println();
      }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      printSnowflake(      generateSnowflake(7));
    }
}