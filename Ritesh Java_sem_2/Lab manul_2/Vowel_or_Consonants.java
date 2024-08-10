//5. WAP that prompts the user to enter a letter and check whether a letter is a vowel or consonants.

import java.util.Scanner;
public class Vowel_or_Consonants {
    public static void main(String[]args){
        System.out.println("Enter A Character:");
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        boolean vowel = true ; 
        for(char a = 'A' ; a <= 'z' ; a++){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vowel = false ;
                break;
            }
        }
        if(!vowel){
            System.out.println(c+" is Vowel");
        }
        else{
            System.out.println(c+" is Consonants");
        }
    }
}