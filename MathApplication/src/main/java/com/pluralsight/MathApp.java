package com.pluralsight;


public class MathApp {
    public static void main(String[] args) {
        //Question 1:
        float bobSalary = 100.00f;
        float garySalary = 199.99f;
        float highestSalary;

        highestSalary = Math.max(garySalary,bobSalary);

        System.out.println("The highest salary is: " + highestSalary);

        //Question 2:
        float carPrice = 10000f;
        float truckPrice = 20000f;
        float lowestVehiclePrice;

        lowestVehiclePrice = Math.min(carPrice,truckPrice);

        System.out.println("The cheapest vehicle is: " + lowestVehiclePrice);

        //Question 3:
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("Area of cicle is" + area);
    }
}
