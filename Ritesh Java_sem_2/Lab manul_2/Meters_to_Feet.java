//1. WAP that reads a number in meters, converts it to feet, and displays the result.

import java.util.Scanner;

public class Meters_to_Feet {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number in Meter =");
        float m = s.nextFloat();

        System.out.println("entered Meeter to feet is ="+(m*3.28084));
    }
}