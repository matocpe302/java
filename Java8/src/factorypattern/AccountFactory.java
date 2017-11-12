package factorypattern;

public class AccountFactory {

	
	public Account getAccountType(String accountType){
		
			if(accountType == null){
				return null;
			}
			
			if(accountType.equals("FixAccount")){
				return new FixAccount();
			}
			
			if(accountType.equals("SavingAccount")){
				
				return new SavingAccount();
			}
			
			return null;
	}
}
