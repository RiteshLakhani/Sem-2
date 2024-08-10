public class Linear
{
    public static void main(String a[])
	{    
        int a1[]={10,20,30,50,70,90};    
        int key = 50; 
		int flag=0;
		
		for(int i=0;i<a1.length;i++)
		{    
            if(a1[i] == key)
			{    
			  flag=1;
			  break;            
            }    
        }    		
		if(flag==1)
		{
		  System.out.println("\n Value found...");
		}
		else
		{
			System.out.println("\n Value found...");
		}
    }    
} 


