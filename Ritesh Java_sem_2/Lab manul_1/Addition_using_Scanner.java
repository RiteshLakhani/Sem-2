//4. WAP to print addition of 2 number using command line

import java.util.Scanner;
public class Addition_using_Scanner{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("enter value of a:");
        int a = s.nextInt();

        System.out.println("enter value of b:");
        int b = s.nextInt();

        System.out.println("sum of a&b is = "+(a+b));
    }
}