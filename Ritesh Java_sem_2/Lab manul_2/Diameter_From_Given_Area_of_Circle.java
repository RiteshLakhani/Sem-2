// 3. WAP to find a diameter from given area of circle. 

import java.util.Scanner;
import java.lang.Math;
public class Diameter_From_Given_Area_of_Circle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value Of Area Of Circle :");
        float A = s.nextFloat();

        float r =  A/3.14f;
        System.out.println("The Diameter Of Circle Is = "+(Math.sqrt(r)));
    }
}