package org.example;

public class Calculator {

    static double otThreshold = 40;

    public static double calcGrossPay(double _hours, double _pay){
        double gross = 0;
        gross += _pay * _hours;
        //Add overtime pay
        if (_hours > otThreshold){
            gross += (_hours - otThreshold) * 0.5;
        }
        return gross;
    }
}
