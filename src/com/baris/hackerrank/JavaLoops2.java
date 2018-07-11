package com.baris.hackerrank;

import java.util.Scanner;

/**
 * Created by barisilhan on 6/21/2018.
 */
public class JavaLoops2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();

        for (int i = 0; i < s; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j =0; j<n;j++) {
                a+= (int) (a + Math.pow(2,j)*b);
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}
