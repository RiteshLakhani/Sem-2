import java.util.*;
public class DemoArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> names = new LinkedList<Student>();
		names.add(new Student("arjun",101,2.5));
		names.add(new Student("darshan",102,3.5));
		names.add(new Student("rajkot",103,1.5));
		names.add(new Student("Gujarat",104,0.8));
		names.add(new Student("INDIA",105,9.3));

		Collections.sort(names, new RollCompare());

		Iterator<Student> myIte = names.listIterator();

		while(myIte.hasNext()){
			myIte.next().printStudent();
		}
	}
}

class Student{
	String name;
	int rollNo;
	double spi;

	public Student(String name, int rollNo, double spi){
		this.name = name;
		this.rollNo = rollNo;
		this.spi = spi;
	}

	public void printStudent(){
		System.out.println("Name = "+name+", rollNo = "+rollNo+", SPI = "+spi);
	}
}

class SPICompare implements Comparator<Object>{
	public int compare(Object obj1,Object obj2){
		Student st1 = (Student)obj1;
		Student st2 = (Student)obj2;
		if(st1.spi==st2.spi){
			return 0;
		}else if(st1.spi<st2.spi){
			return 1;
		}
		else{
			return -1;
		}
	}
}

class RollCompare implements Comparator<Object>{
	public int compare(Object obj1,Object obj2){
		Student st1 = (Student)obj1;
		Student st2 = (Student)obj2;
		if(st1.rollNo==st2.rollNo){
			return 0;
		}else if(st1.rollNo<st2.rollNo){
			return 1;
		}
		else{
			return -1;
		}
	}
}