import java.util.Scanner;
public class First_Demo{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
boolean isDataCorrect;
do{
isDataCorrect = true;
System.out.println("Enter en for encryption or dc for decryption");
String enOrDc = sc.nextLine();
if(enOrDc.equals("en")){
System.out.println("Please Enter Message to Encrypt = ");
String msg = sc.nextLine();
System.out.println("Please Enter Key to Encrypt the msg= ");
int key = sc.nextInt();
String encryptedMsg = "";
for(int i=0;i<msg.length();i++){
char temp = msg.charAt(i);
int tempInt = (int)temp;
tempInt+=key;
temp = (char)tempInt;
encryptedMsg=encryptedMsg+temp;
}
System.out.println("Encrypted Msg = "+encryptedMsg);
}
else if(enOrDc.equals("dc")){
System.out.println("Please Enter Message to Decrypt = ");
String msg = sc.nextLine();
System.out.println("Please Enter Key to Decryption the msg= ");
int key = sc.nextInt();
String decryptedMsg = "";
for(int i=0;i<msg.length();i++){
char temp = msg.charAt(i);
int tempInt = (int)temp;
tempInt-=key;
temp = (char)tempInt;
decryptedMsg=decryptedMsg+temp;
}
System.out.println("Decrypted Msg = "+decryptedMsg);
}
else{
isDataCorrect = false;
System.out.println("User entered Something else");
}
}while(!isDataCorrect);
}
}