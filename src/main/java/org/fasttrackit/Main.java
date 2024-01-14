package org.fasttrackit;

public class Main {
    public static void main(String[] args) {
        double valueFahrenheit = -40;
        double resultCelsius = Converter.convertToC(valueFahrenheit);
        System.out.println("Fahrenheit to Celsius: " + resultCelsius);

        double valueCelsius = 10;
        double resultFahrenheit = Converter.convertToF(valueCelsius);
        System.out.println("Celsius to Fahrenheit: " + resultFahrenheit);
    }
}
