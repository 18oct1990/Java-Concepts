package Java;

public class Encapsulation {
	
	//Variables has to be private to hide from other class
	//Data Hiding/Encapsulation/Binding Methods & Variables
	
	private int SAC;
	private String AccName;

	public int getSAC() {
		return SAC;
	}

	public void setSAC(int SAC) {
		this.SAC = SAC;
	}

	public String getAccName() {
		return AccName;
	}

	public void setAccName(String AccName) {
		this.AccName = AccName;
	}

	
	public static void main(String[] args) {
		
		
		// Set & then Get values
		Encapsulation Enc = new Encapsulation();
		Enc.setSAC(1001010);
		Enc.setAccName("Amit Singh");
		System.out.println("Account Name is: "+Enc.getAccName());
		System.out.println("SAC Number is"+Enc.getSAC());
	
	}
}
