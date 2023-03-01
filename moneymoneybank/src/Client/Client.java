package Client;

import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

import application.MMBankFactory;
import application.MMCurrentAcc;
import application.MMSavingAcc;

public class Client {

	
	public static void main(String[] args) {
		BankFactory f = new MMBankFactory();
		MMSavingAcc s = new MMSavingAcc(5742, "Gauri Kolhe", 15000.0f, true);
		MMCurrentAcc c = new MMCurrentAcc(1542, "Gk", 12000.0f,6000f);
		
		System.out.println("Savings Account:");
		System.out.println(s);
		s.withdraw(300); 		
		
		System.out.println();
		System.out.println("Current Account:");
		System.out.println(c);
		c.withdraw(300);		
}
}

	


