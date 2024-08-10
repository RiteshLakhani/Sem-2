public class Mid_1_Prime
{
	public static void main(String[] args)
	{
		int count = 0;

		for(int i=0 ; i<100 ; i++)
		{
			boolean isprime = true;

				for(int j=2 ; j<i ; j++)
				{
					if(i%j==0)
					{
						isprime = false;
						break;
					}
				}


				if(isprime)
				{
					System.out.println(i);count++;
				}

				if(count==20)
				{
					break;
				}
		}
	}
}