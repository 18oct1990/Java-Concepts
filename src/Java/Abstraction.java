package Java;

public abstract class Abstraction {
	
	// Cannot achieve complete Abstraction via Abstract methods
	// Can have Abstract as well as not Abstract method
	// Cannot create instance of abstract class 
	
	public abstract void DemandDraft();
	
	public void UpdateMobile()
	{
		System.out.println("Update mobile number");
	}

}
