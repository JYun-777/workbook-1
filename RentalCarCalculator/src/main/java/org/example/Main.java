package org.example;


public class Main {

    public static void main(String[] args) {
        float finalBill;

        RentalPlan currentPlan = new RentalPlan();
        Prompter.FillPlan(currentPlan);
        Calculator.calculateBill(currentPlan);
    }
}