package factorypattern;

// Facade pattern hides the complexity of the system and provide an interface to client
// using client can access the system , As this pattern adds an interface to 
// hide its complexsity


public class FacadeDemo {

	private Account savingAccount;
	private Account fixAccount;
	
	public FacadeDemo(){
		
		savingAccount = new SavingAccount();
		fixAccount = new FixAccount();
	}
	
	public void calculateInterestSavingAccount(){
		savingAccount.calculateInterest();
	}
	
	public void calculateInterestFixAccount(){
		
		fixAccount.calculateInterest();
	}
	
	public void stringBuild(){
		
		StringBuilder build = new StringBuilder();
		build.append("a");
		build.append(1);
	}
}
