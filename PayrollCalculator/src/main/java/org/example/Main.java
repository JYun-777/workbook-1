package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
       float hours;
       float pay;
       float gross = 0;

       Scanner read = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = read.nextLine();
        System.out.println("Enter hours worked: ");
        hours = read.nextFloat();
        read.nextLine();
        System.out.println("Enter pay rate: ");
        pay = read.nextFloat();
        read.nextLine();

        gross += pay * hours;
        if (hours > 40){
            gross += (hours - 40) * pay * 0.5f;
        }

        System.out.printf("Employee name: %s \nGross Pay: %.2f",name, gross);
    }
}