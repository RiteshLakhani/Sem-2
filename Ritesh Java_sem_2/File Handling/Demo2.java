import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2
{
	public static void main(String[] args)
	{
		String fileName = "ABC.txt";

		try
		{
			FileReader   fr = new FileReader("ABC.txt");
			BufferedReader br = new BufferedReader(fr);

			int countChar = 0;
			int countSpace = 0;
			int countWord = 0;
			int countLine = 0;
			String line;

			while((line=br.readLine())!=null)
			{
				countChar += line.length();
				countSpace += spaceCount(line);
				String[]words = line.trim().split("\\s+");
				countWord += words.length;
				countLine++;
			}
			System.out.println("Count Char: "+countChar);
			System.out.println("Count Space:"+countSpace);
			System.out.println("Count Word: "+countWord);
			System.out.println("Count Line: "+countLine);
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found :"+fileName);
		}
		catch(IOException e)
		{
			System.out.println("File Error Message: "+e.getMessage());
		}
	}

	public static  int spaceCount(String line)
	{
		int count = 0;

		for(char c: line.toCharArray())
		{
			if(Character.isWhitespace(c))
			{
				count++;
			}
		}
		return count;
	}
}