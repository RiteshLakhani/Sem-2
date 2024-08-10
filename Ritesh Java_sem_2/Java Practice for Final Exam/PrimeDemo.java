public class PrimeDemo
{
	public static void main(String[]args)
	{
		int count = 0;

		for(int i=0 ; i<100 ; i++)
		{
			boolean isPrime = false;

			for(int j=2 ; j<i ; j++)
			{
				if(i%j==0)
				{
					isPrime = true;
					break;
				}
			}

			if(!isPrime)
			{
				System.out.println(i);
				count++;
			}

			if(count==20)
			{
				break;
			}
		}
	}
}