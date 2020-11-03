
public class PrintRemainingBalance_ElseIf {

	public static void main(String[] args) {
          
		double Total=1200,Withdraw=200,Balance;
		
		Balance=Total-Withdraw;
		
		System.out.println("The total amount in my account is £ "+ Total);
		System.out.println("The withdrawel amount is £ "+ Withdraw);
		
		if(Total>=Withdraw) {
			
			System.out.println("The remaining Balance is £ "+ Balance);
		}
		
		
		else {
			
		    System.out.println("Your Account has Insufficient balance");
	    }
		
		
	}

}
