class Bike
{
	final void run()
	{
		System.out.println("Bike Running");
	}
}

class Pulsar extends Bike
{
	/*void run()
	{
		System.out.println("Pulsar Running");
	}*/
	
	public static void main(String[] args) {
		
		Bike p1 = new Bike();
		p1.run();
	}
}