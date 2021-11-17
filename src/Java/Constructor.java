package Java;

public class Constructor {
	
	int b;
	String Project;
	String Members;
	
	Constructor()
	{
		System.out.println("Parameterless constructor");
	}
	
	Constructor(int a)
	{
		System.out.println("Single parameter constructor" +a);
	}
	Constructor(int a, String Name)
	{
		System.out.println("Double parameter constructor" +a);
		System.out.println("Double parameter constructor" +Name);

	}
	Constructor(int b, String Project,String Members)
	{
		this.b=b;
		this.Project=Project;
		this.Members=Members;

	}
	

	public static void main(String[] args) {
		
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(10);
		Constructor c3=new Constructor(20,"Amit");
		
	}

}
