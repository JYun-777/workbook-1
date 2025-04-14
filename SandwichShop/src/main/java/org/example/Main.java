package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);//Initialize Scanner

        float regularPrice = 5.001f;
        float largePrice = 8.95f;


        float studentDiscount = 0.1f;
        float seniorDiscount = 0.2f;

        float discount = 0;
        float finalCost = 0.00f;


        float basePrice = 0;

        basePrice = sizeSelectionPrompt(read, regularPrice, largePrice);

        discount = ageDiscountCalc(read,studentDiscount,seniorDiscount);

        finalCost = basePrice - (basePrice * discount);

        System.out.printf("Your sandwich costs: %.2f", finalCost);

    }

    public static float sizeSelectionPrompt(Scanner _read, float _regularPrice,float _largePrice){
        int sizeSelect = 0;
        float _basePrice = 0;

        System.out.println("Please select a sandwich size.\n Enter 1 for Regular, 2 for Large: ");
        sizeSelect = _read.nextInt();
        if (sizeSelect == 1) {
            _basePrice = _regularPrice;
        } else if (sizeSelect == 2) {
            _basePrice = _largePrice;
        }else{
            System.out.println("Invalid menu selection. ");
        }

        _basePrice = calcLoadedSandwich(_read, sizeSelect, _basePrice);

        return _basePrice;
    }

    public static float ageDiscountCalc (Scanner _read, float _studentDiscount, float _seniorDiscount){
        System.out.println("Please enter your age: ");
        int age = _read.nextInt();
        float discount = 0;

        if (age < 17){
            discount = _studentDiscount;
        }else if (age > 65){
            discount = _seniorDiscount;
        }

        return  discount;
    }

    public static float calcLoadedSandwich(Scanner _read, int _sizeSelect, float _basePrice){

        float regularLoadedPrice = 1.00f;
        float largeLoadedPrice = 1.75f;

        System.out.println("Would you like your sandwich Loaded?\nEnter 1 for Yes, 2 for No: ");
        int loaded = _read.nextInt();

        if (loaded == 1){
            if (_sizeSelect == 1){ //if regular loaded sandwich
                _basePrice += regularLoadedPrice;
            }else{
                _basePrice += largeLoadedPrice;
            }
        }

        return _basePrice;
    }
}