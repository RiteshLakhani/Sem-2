import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo
{
	public static void main(String[]args)
	{
		String filename = "DEF.txt";

		try
		{
			FileReader fr = new FileReader("DEF.txt");
			BufferedReader br = new BufferedReader(fr);

			int countChar  = 0 ;
			int countSpace = 0;
			int countWord  = 0;
			int countLine  = 0;
			String line;

			while((line=br.readLine())!=null)
			{
				countChar = countChar + line.length();
				countSpace = spaceCount(line);
				String[] words = line.trim().split("\\s+");
				countWord = countWord + words.length;
				countLine++;
			}

			System.out.println("Character count = "+countChar);
			System.out.println("Space count = "+countSpace);
			System.out.println("Word count ="+countWord);
			System.out.println("Line count ="+countLine);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found: "+filename);
		}
		catch(IOException e)
		{
			System.out.print("File Error Mesaage: "+e.getMessage());
		}
	}

		private static int spaceCount(String line)
		{
			int count = 0 ;

			for(char c:line.toCharArray())
			{
				if(Character.isWhitespace(c)){
				count++;
				}
			}
			return count;
		}
}