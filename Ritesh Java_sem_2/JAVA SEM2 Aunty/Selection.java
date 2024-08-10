public class Selection
{      
    public static void main(String a[])
	{  
        int[] arr = {9,14,3,2,43,11,58,22};
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
			{  
                if (arr[j] < arr[index])
				{  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  		        
        for(int i = 0; i < arr.length - 1; i++)
		{  
            System.out.println(arr[i]);  
        }  
    }  
}  
