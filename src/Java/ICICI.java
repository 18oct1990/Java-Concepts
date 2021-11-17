package Java;

public class ICICI implements Interface   {

	@Override
	public void SavingAccount() {
		System.out.println("Saving Account");
		
	}

	@Override
	public void CurrentAccount() {
		System.out.println("Current Account");
		
	}
	
	public void FixedDeposit()
	{
		System.out.println("Fixed Deposit");
	}
	
	public static void main(String args[]) 
	{
		ICICI IC= new ICICI();
		IC.SavingAccount();
		IC.CurrentAccount();
		IC.FixedDeposit();
		Interface IN= new ICICI();
		IN.SavingAccount();
	}

}
