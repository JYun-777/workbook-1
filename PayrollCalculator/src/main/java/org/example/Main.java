package org.example;

import java.util.Scanner;

public class Main {

    static Scanner read = new Scanner(System.in);
    static String name;
    static double hours;
    static double pay;
    static double gross;

    public static void main(String[] args) {

        enterInfo();
        gross = Calculator.calcGrossPay(hours,pay);

        System.out.printf("Employee name: %s \nGross Pay: %.2f",name, gross);
    }

    public static void enterInfo(){
        System.out.println("Enter name: ");
        name = read.nextLine();
        System.out.println("Enter hours worked: ");
        hours = read.nextDouble();
        read.nextLine();
        System.out.println("Enter pay rate: ");
        pay = read.nextDouble();
        read.nextLine();
    }
}