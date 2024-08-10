public class Demo{
	public static void main(String[]args)
	{
		SmartPhone sp = new SmartPhone();
		sp.setManufacture("Samsumg");

		String name = sp.getManuFacture();
		System.out.println(name);

		SmartPhone sp2 = new SmartPhone();
		sp2.setModel("Galaxy");

		String name2 = sp2.getModel();
		System.out.println(name2);
	}
}

class SmartPhone{
	String manufacture;
	String model ;
	double storage ; 
	double screenSize;

	public String getManuFacture(){
		return manufacture;
	}

	public void setManufacture(String a)
	{
		manufacture = a ;
	}

	public String getModel(){
		return model;
	}

	public void setModel(String b)
	{
		model = b ;
	}
}