package com.baris.hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n);

        int leftDiagonal = input.nextInt(); //Handles first edge case of the element at matrix pos 0
        int rightDiagonal = 0;
        System.out.println(leftDiagonal);

        for (int i = 0; i < n*n; i++) {
            int value = input.nextInt();
            if(i%(n+1) == 0) {
                leftDiagonal += value;
                System.out.println(leftDiagonal + " " + value);
            }

        }
    }
}
