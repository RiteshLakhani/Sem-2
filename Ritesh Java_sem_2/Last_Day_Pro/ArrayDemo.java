import java.util.Scanner;

public class ArrayDemo
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	int runPerOver[][] = new int [3][6];

	for(int i=0 ; i< 3 ; i++)
	{
		for(int j=0 ; j<6 ; j++)
		{
			System.out.println("Enter Run Taken"+"in Over Number" +(i+1)+"in Ball Number"+(j+1)+"=");
			runPerOver[i][j] = sc.nextInt();
		}
	}

	int totalRun = 0 ;

		for(int i=0 ; i<3 ; i++)
		{	
			for(int j=0 ; j<6 ; j++)
			{
				totalRun += runPerOver[i][j];
			}
		}

	double avg = totalRun / (double) runPerOver.length;

	System.out.println("Total Run = "+totalRun);
	System.out.println("Average per Over = "+avg);

	}
}