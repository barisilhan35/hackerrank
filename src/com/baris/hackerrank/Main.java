package com.baris.hackerrank;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main2(String[] args) {
	// write your code here
        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s ="";

        if (n%2 == 1) {
            s="weird";
        }
        else if (n>=2 && n<=5) {
            s="Not Weird";
        }
        else if (n>=6 && n<=20) {
            s="Weird";
        }
        else if (n>20) {
            s="Not Weird";
        }

        System.out.println(s);
    }

    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");

        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n",s1,x);

        }
        System.out.println("================================");

    }

    public static void main4(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //System.out.println(n);
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int a=0;
        int b=0;
        int n=0;
        int sum = 0;

        for (int i=0; i<t; i++){

            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();

            sum = a;

            if (i >0){
                System.out.print("\n");
            }

            for (int j=0; j<n; j++){
                sum+= Math.pow(2,j) * b;

                System.out.print(sum + " ");
            }
        }
        sc.close();
    }

    static Scanner input = new Scanner(System.in);
    static int B = input.nextInt();
    static int H = input.nextInt();
    static Boolean flag = B > 0 && H > 0;

    static{
        if(!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

    }
}
