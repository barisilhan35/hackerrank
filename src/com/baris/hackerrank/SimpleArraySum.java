package com.baris.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class SimpleArraySum {


    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int sum = 0;
        System.out.println("enter how many numbers will be used");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("enter operational numbers");
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("sum is = " + sum);
    }
}
