package com.pluralsight;


public class MathApp {
    public static void main(String[] args) {
        //Question 1: Find greater salary (higher variable)
        float bobSalary = 100.00f;
        float garySalary = 199.99f;
        float highestSalary;

        highestSalary = Math.max(garySalary,bobSalary);

        System.out.println("The highest salary is: " + highestSalary);

        //Question 2: Find lower price of 2 variables
        float carPrice = 10000f;
        float truckPrice = 20000f;
        float lowestVehiclePrice;

        lowestVehiclePrice = Math.min(carPrice,truckPrice);

        System.out.println("The cheapest vehicle is: " + lowestVehiclePrice);

        //Question 3: Area of circle with radius 7.25
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + area);

        //Question 7: Find and display random number from 0 - 1
        double random = Math.random();
        System.out.println(random);

        System.out.print("Hello ");
        System.out.print("World");
        System.out.println();
        System.out.println("Hello World");
        System.out.println();

        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77123f;
        System.out.printf("%s (id: %d) $%.2f", name, id, pay);
    }
}
