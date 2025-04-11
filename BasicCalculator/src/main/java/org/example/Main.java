package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long num1 = read.nextLong();
        read.nextLine();
        System.out.print("Enter the second number: ");
        long num2 = read.nextLong();
        read.nextLine();

        System.out.print("Available Operations:\n   (A)dd\n   (S)ubtract\n" +
                "   (M)ultiply\n   (D)ivide\nPlease select an option: ");

        String choice = read.nextLine();
        long answer;
        if (choice.equals("M")){
            answer = Math.multiplyExact(num1, num2);
            System.out.println(num1 + " * " + num2 + " = " + answer);
        }


    }

}