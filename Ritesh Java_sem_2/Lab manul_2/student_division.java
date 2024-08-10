//7. WAP to read marks of five subjects. Calculate percentage and print class accordingly. Fail below 35, Pass Class between 35 to 45, Second Class between 45 to 60, First 
//Class between 60 to 70, Distinction if more than 70.

import java.util.*;
public class student_division {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        System.out.println("enter the marks of given below");
        System.out.println("wed desing:");
        int wd = s.nextInt();
        System.out.println("c language:");
        int c = s.nextInt();
        System.out.println("maths:");
        int maths = s.nextInt();
        System.out.println("physics:");
        int physics = s.nextInt();
        System.out.println("English");
        int English = s.nextInt();

        int pr;
        pr = (wd + c + maths + physics + English)/5;

        if(pr > 70 && pr <= 100){
            System.out.println("Student get Distinction Class");
        }
        else if(60 < pr && pr <= 70){
            System.out.println("Student get First Class");
        }
        else if(45 < pr && pr <= 60){
            System.out.println("Student get Second Class");
        }
        else if(35 <= pr && pr <= 45){
            System.out.println("Student Pass");
        }
        else if(pr < 35){
            System.out.println("Student Fail");
        }
        else{
            System.out.println("Inavild");
        }
    } 
}