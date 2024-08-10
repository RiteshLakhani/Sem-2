import java.io.*;
import java.io.IOException;

public class Demo3
{
	public static void main(String[]args) throws IOException
	{
		Writer w = new FileWriter("Ritesh.txt");
		w.write(" Hello java");
		w.close();
	}
}