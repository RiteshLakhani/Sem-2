import java.util.*;
public class CollectionsDemo
{
	public static void main(String[] args)
	{
		List<String>l1 = new ArrayList<>();
		l1.add("Sachin");
		l1.add("Ritesh");
		l1.add("Sonal");
		System.out.println("\t"+l1);


		List<Integer>l2 = new LinkedList<>();
		l2.add(101);
		l2.add(102);
		l2.add(103);
		System.out.println("\t"+l2);	
	}
}