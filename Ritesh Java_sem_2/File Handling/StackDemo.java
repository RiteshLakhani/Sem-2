import java.util.*;

public class StackDemo
{
	public static void main(String[] args)
	{
		Stack<Integer> s1 = new Stack<>();

		boolean result = s1.empty();

		System.out.println("Is Stack is empty?: " +result);

		s1.push(78);
		s1.push(113);
		s1.push(90);
		s1.push(120);

		System.out.println("Elements in Stack: "+s1);

		result = s1.empty();

		System.out.println("Is now Stack is Empty? "+result);	
	}
}