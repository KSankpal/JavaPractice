
public class PrintSellAlcohol_ElseIf {

	public static void main(String[] args) {
		
		int age = 18;
		
		System.out.println("If the age of the customer is "+ age);
		
		if (age<18) {
			System.out.println("Do not sell alcohol");
		}
		
		
		else if(age>=18&&age<=24){
			System.out.println("Sell the alcohol with ID");
		}
		
		
		else if(age>25){
			System.out.println("Sell the alcohol");
		}
	}

}
