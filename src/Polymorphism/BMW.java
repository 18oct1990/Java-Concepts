package Polymorphism;

//Inheritance
public class BMW extends Car {
	
	public void color()
	{
		System.out.println("BMW---Color");
	}
	public void GearType()
	{
		System.out.println("BMW---GearType");
	}

	public static void main(String[] args) {
	
		BMW BM=new BMW();
		BM.color();
		//Method overriding using same class GearType() name and same arguments (0)
		BM.GearType();
		Car CR=new BMW();// Dyanamic polymorphism
		CR.GearType();
		CR.CarEngine();
		
	}

}
