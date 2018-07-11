package com.baris.hackerrank;

import java.util.Scanner;

/**
 * Created by barisilhan on 6/22/2018.
 */
public class DataTypes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();

        for(int i=0;i<t;i++)
        {
            try {
                long x=scanner.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                try{
                    byte y = (byte) x;
                    if(y == x)
                    {
                        System.out.println("* byte");
                    }
                }catch(Exception e){}
                try{
                    short y = (short) x;
                    if(y == x)
                    {
                        System.out.println("* short");
                    }
                }catch(Exception e){}
                try{
                    int y = (int) x;
                    if(y == x)
                    {
                        System.out.println("* int");
                    }
                }catch(Exception e){}



                System.out.println("* long");
            }
            catch (Exception e) {
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }

        }
    }
}
