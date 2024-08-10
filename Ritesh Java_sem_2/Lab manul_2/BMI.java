//2. Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a 
//   program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.

import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        System.out.println("Enter Your Height in Inch: ");
        Scanner s = new Scanner(System.in);
        float h = s.nextFloat();
        System.out.println("Enter Your Weight in Pound:");
        float w = s.nextFloat();

        w *= 0.45359237f;
        h *= 0.0254;
        float BMI = w / (h * h);

        System.out.println("Your Body Mass Index(BMI) is = "+BMI);
    }
}