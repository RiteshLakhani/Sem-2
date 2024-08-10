//6. WAP to calculate Area of Circle.

import java.util.Scanner;

public class Area_of_circle{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("enter radius of circle :");
        int r = s.nextInt();

        System.out.println("the Area of circle is = "+(3.14*r*r));
    }
}