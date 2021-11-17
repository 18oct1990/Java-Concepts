package Java;

public class YesBank extends Abstraction {



	@Override
	public void DemandDraft() {
		System.out.println("Demand Draft");
		
	}
	
	public static void main(String[] args) {
		
		YesBank YB= new YesBank();
		YB.DemandDraft();
		YB.UpdateMobile();
		Abstraction AB= new YesBank();
		//Abstract class object cannot be created but it can be referenced from other class
		AB.DemandDraft();
		AB.UpdateMobile();
	}

}
