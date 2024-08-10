import java.io.*;
import java.io.IOException;


public class DemoReader
{
	public static void main(String[]args) throws IOException 
	{
		try
		{
			InputStream is = new FileInputStream("Ritesh.txt");
            Reader r = new InputStreamReader(is);

			int data = r.read();

			while(data!=-1)
			{
				char charData = (char)data;

				data = r.read();
				System.out.print((char)data);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}