//6. WAP to find out largest number from given three numbers without using Logical Operator.

import java.util.Scanner;
public class maximum_number{
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter value of a:");
        int a=s.nextInt();
        System.out.println("enter value of b:");
        int b=s.nextInt();
        System.out.println("enter value of c:");
        int c=s.nextInt();
        
        if(a == b){
            if(a > c){
                System.out.println("a&b both are Maximum");
            }
        }
        else if(a == c){
            if(a > b){
                System.out.println("a&c both are Maximum");
            }
        }
        else if(b == c){
            if(b > a){
                System.out.println("b&c both are Maximum");
            }
        }
        else if(a<b){
            if(b>c){
                System.out.println("b is Maximum");
            }else{
                System.out.println("c is Maximum");
            }
        }
        else if(a>b){
            if(a>c){
                System.out.println("a is Maximum");
            }else{
                System.out.println("c is Maximum");
            }
        }
    }
}