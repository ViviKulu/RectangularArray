package com.company;


public class Main {

    //    Assume that a two-dimensional rectangular array of integers called data
    //    has been declared with four rows and seven columns. Write a for loop to
    //    initialize the third row of data to store the numbers 1 through 7.

    public static void main(String[] args) {
        // write your code here
        int[][] data = new int[4][7];
        for(int i = 1; i <= data[2].length; i++){
            data[2][i - 1] = i;
        }
    }
}
