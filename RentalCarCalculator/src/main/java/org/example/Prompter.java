package org.example;

import java.util.Scanner;

public class Prompter {

    static Scanner read = new Scanner(System.in);

    public static void FillPlan(RentalPlan plan) {

        System.out.println("Please enter your age: ");
        plan.age = read.nextInt();
        System.out.println("Pleaes enter the number of days you will be renting the car: ");
        plan.rentalDays = read.nextInt();
        tollTagPrompt(plan);
        GPSPrompt(plan);
        roadAssistPrompt(plan);
    }

    public static void tollTagPrompt(RentalPlan _plan) {

        int tollTagInput;
        System.out.println("Would you like an electronic toll tag? Enter 1 for Yes, 2 for No");
        tollTagInput = read.nextInt();

        switch (tollTagInput) {
            case 1:
                _plan.tollTag = true;
                break;
            case 2:
                break;

        }
    }

    public static void GPSPrompt(RentalPlan _plan){
        int gpsInput;
        System.out.println("Would you like a GPS Device? Enter 1 for Yes, 2 for No");
        gpsInput = read.nextInt();

        switch (gpsInput) {
            case 1:
                _plan.tollTag = true;
                break;
            case 2:
                break;

        }
    }

    public static void roadAssistPrompt(RentalPlan _plan){
        int roadAssistInput;
        System.out.println("Would you like a roadside assistance plan? Enter 1 for Yes, 2 for No");
        roadAssistInput = read.nextInt();

        switch (roadAssistInput) {
            case 1:
                _plan.tollTag = true;
                break;
            case 2:
                break;

        }
    }
}
