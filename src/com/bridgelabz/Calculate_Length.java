package com.bridgelabz;
import java.util.Scanner;
public class Calculate_Length {
    public static void main(String[] args) {
        System.out.println("Welome to Line Comparison Computation Problem");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates  For X1");
        int x1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For Y1");
        int y1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For X2");
        int x2 = sc.nextInt();
        System.out.println("Enter co-ordinates  For Y1");
        int y2 = sc.nextInt();
        Integer length1 = (int) Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);

        System.out.println("\n");

        System.out.println("Enter co-ordinates  For A1");
        int a1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For B1");
        int b1 = sc.nextInt();
        System.out.println("Enter co-ordinates  For A2");
        int a2 = sc.nextInt();
        System.out.println("Enter co-ordinates For B2");
        int b2 = sc.nextInt();

        Integer length2 = (int) Math.sqrt((a2 - a1) * 2 + (b2 - a1) * 2);

        System.out.println("Length of 1st line is : " + length1);
        System.out.println("Length of second line is : " + length2);
    }

}
