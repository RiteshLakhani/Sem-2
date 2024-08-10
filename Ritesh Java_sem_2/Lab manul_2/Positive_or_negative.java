//4. WAP to check whether the given number is positive or negative.

import java.util.Scanner;
public class Positive_or_negative{
    public static void main(String[] args){
        System.out.println("Enter Number:");
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();

        if(n < 0){
            System.out.println(n+"NUmber is negative");
        }
        else if(n > 0){
            System.out.println(n+"Number is Positive");
        }
        else{
            System.out.println("Invalid");
        }
    }    
}