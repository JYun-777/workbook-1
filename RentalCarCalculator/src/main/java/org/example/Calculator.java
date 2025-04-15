package org.example;

public class Calculator {
    public static float calculateBill(RentalPlan _plan){
        float basicRentalPrice = 29.99f;
        float tollTagPrice = 3.95f;
        float gpsPrice = 2.95f;
        float roadAssistPrice = 3.95f;
        float surcharge = 0.3f;
        float totalPrice = 0;

        totalPrice += basicRentalPrice * _plan.rentalDays;
        //if age under 25, add surcharge
        if (_plan.age < 25) {
            System.out.println("Surcharge applied.");
            totalPrice += basicRentalPrice * surcharge * _plan.rentalDays;
        }

        if (_plan.tollTag) totalPrice += tollTagPrice * _plan.rentalDays;

        if (_plan.GPS) totalPrice += gpsPrice * _plan.rentalDays;

        if (_plan.roadAssist) totalPrice += roadAssistPrice * _plan.rentalDays;

        System.out.printf("Your final bill is %.2f", totalPrice);
        return totalPrice;
    }
}
