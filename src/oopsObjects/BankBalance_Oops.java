package oopsObjects;

public class BankBalance_Oops {

	public static void main(String[] args) {
		TestData data=new TestData();
		System.out.println("The total amount in my account=£"+data.Total);
		System.out.println("The amount to withdraw=£"+data.Withdraw);
		
		 data.Balance=data.Total-data.Withdraw;
		 System.out.println("The Balance in my account=£"+data.Balance);

	}

}
