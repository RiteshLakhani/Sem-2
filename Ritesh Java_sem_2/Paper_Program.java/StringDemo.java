import java.util.Scanner;

public class StringDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);

		int totalA = 0;
		int totalE = 0;
		int totalI = 0;
		int totalO = 0;
		int totalU = 0;

		while(true)
		{
			System.out.println("Enter a senetence (or \"quit\" to exist): ");
			String s = sc.nextLine();

			if(s.equalsIgnoreCase("quit"))
			{
				break;
			}

			int countA = 0;
			int countE = 0;
			int countI = 0;
			int countO = 0;
			int countU = 0;

			for(char ch : s.toCharArray())
			{
				switch(Character.toLowerCase(ch))
				{
				case 'a':
					countA++;
					break;
				case 'e':
					countE++;
					break;
				case 'i':
					countI++;
					break;
				case 'o':
					countO++;
					break;
				case 'u':
					countU++;
					break;
				}
			}

			totalA +=countA;
			totalE +=countE;
			totalI +=countI;
			totalO +=countO;
			totalU +=countU;

			System.out.println("A : "+countA);
			System.out.println("E : "+countE);
			System.out.println("I : "+countI);
			System.out.println("O : "+countO);
			System.out.println("U : "+countU);
		}

			System.out.println("A : "+totalA);
			System.out.println("E : "+totalE);
			System.out.println("I : "+totalI);
			System.out.println("O : "+totalO);
			System.out.println("U : "+totalU);
	}
}