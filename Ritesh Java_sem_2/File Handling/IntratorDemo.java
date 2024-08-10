import java.util.*;

public class IntratorDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");

		System.out.println("Contents of list:");

		Iterator<String> itr = a1.iterator();

		itr.remove();

		System.out.println("\t"+a1);

		while(itr.hasNext())
		{
			Object element = itr.next();
			System.out.print(" "+element);
		}

		itr.remove();

		System.out.println("\t"+a1);	
	}
}