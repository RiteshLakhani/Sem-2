import java.io.*;

public class OutDemo
{
	public static void main(String[] args)
	{
		try{

			FileOutputStream fout = new FileOutputStream("ABC.txt");

			String s = "Ritesh is Good Boy.\nRitesh Lakhani\nHello Java.";

			byte b[] = s.getBytes();

			fout.write(b);
			fout.close();
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}