public class Selection_Sorting
{
	public static void main (String [] args )
	{
		int array [] = {9,14,3,2,43,11,58,22};

		for ( int i=0 ; i<array.length -1 ; i++)
		{
			int index = i ;

			for( int j=i+1 ; j<array.length ; j++)
			{
				if( array[j] < array[index])
				{
					index = j ;
				}
			}

			int smallNumber = array[index];
			array[index]=array[i];
			array[i]=smallNumber;
		}

		for(int i = 0; i < array.length - 1; i++)
		{  
            System.out.println("Array["+i+"]="+array[i]);  
        }  
	}
}