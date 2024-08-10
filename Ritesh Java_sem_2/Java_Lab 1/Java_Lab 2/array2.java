import java.util.Scanner;

public class array2{
	public static void main(String [] args){

		Scanner s=new Scanner(System.in);

		int runperover[][]= new int [3][6];

		for( int i=0;i<3;i++)
		{
			for( int j=0;j<6;j++)
			{
				System.out.println("Enter the Run in "+(i+1)+" over in "+(j+1)+"ball : ");
				runperover[i][j] = s.nextInt();
			}
		}

		int totalRun=0;

		for( int i=0;i<3;i++)
		{
			for(int j=0;j<6;j++)
			{
				System.out.println("Run in "+(i+1)+" over in "+(j+1)+"ball : "+runperover[i][j]);
				totalRun += runperover[i][j];
			}
		}

		double average=totalRun/(double)runperover.length;



		System.out.println("Total Run="+totalRun);
		System.out.println("Avrage per over="+average);
	}
}