public class ArrayDemo_2
{
	public static void main(String[]args)
	{
		int runPerOver[][] = new int [3][];

		int runPerOver[0] = new int[6];
		int runPerOver[1] = new int[7];
		int runPerOver[2] = new int[6];

		int runPerOver[][] = {
								{0,4,2,1,0,6},{1,-1,4,1,2,4,0},{6,4,1,0,2,2};
		}

		for ( int i=0 ; i<runPerOver.length; i++)
		{
			for(int j = 0 ; j<runPerOver.length ; j++)
			{
			System.out.println("Runinover["+i"]="+runPerOver[i][j]);
			}
		}
	}
}