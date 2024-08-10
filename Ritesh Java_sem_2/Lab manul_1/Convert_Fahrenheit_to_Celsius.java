//7. WAP to convert temperature from Fahrenheit to Celsius.

import java.util.Scanner;

public class Convert_Fahrenheit_to_Celsius {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        System.out.println("enter temperature in Fahrenheit :");
        float f = s.nextInt();

        System.out.println("temperature in celsius is = "+((f-32)*5/9));
    }
}