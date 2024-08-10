import java.util.*;

public class QueueDemo
{
	public static void main(String[] args) {
		
		Queue<String> n = new LinkedList<String>();

		n.add("Tom");
		n.add("Jeery");
		n.add("Mike");
		n.add("Steve");
		n.add("Haary");

		System.out.println("Element In Queue :"+n);
		System.out.println("Remove elements  :"+n.remove());
		System.out.println("Head: "+n.element());
		System.out.println("Poll: "+n.poll());
		System.out.println("Peek: "+n.peek());
		System.out.println("Element in Queue: "+n);


		PriorityQueue <Integer> n1 = new PriorityQueue<>();
		n1.add(750);
		n1.add(900);
		n1.add(950);

		while(!n1.isEmpty())
		{
			System.out.println(n1.remove());
		}
	}
}