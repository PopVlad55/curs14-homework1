package org.fasttrackit;

public class Converter {
    // F to C
    public static double convertToC(double tempInF){
        return (tempInF - 32) * 5 / 9;
    }
    // C to F
    public static double convertToF(double tempInC){
        return tempInC * 9 / 5 + 32;
    }
}
