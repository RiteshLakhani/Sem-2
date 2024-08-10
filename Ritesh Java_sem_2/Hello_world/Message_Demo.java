public class Message_Demo{
	public static void main(String[] args){
	String Message_Demo="good";
	for(int i=0;i<Message_Demo.length();i++){

		char temp = Message_Demo.charAt(i);
		short tempEn= (short)temp;

		tempEn+=5;

		char newtemp = (char)tempEn;

		System.out.print (newtemp);
	} 
}
}