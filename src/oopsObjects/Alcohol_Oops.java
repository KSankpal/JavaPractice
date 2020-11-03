package oopsObjects;

public class Alcohol_Oops {

	public static void main(String[] args) {
		
		 
		TestData data=new TestData();
	     
	     if (data.age<18) {
	    	 System.out.println("Do not sell alcohol");
	     }
	     else if(data.age<=24) {
	        System.out.println("sell alocohol with id ");
	        }
	     else {
	        System.out.println("sell alcohol");
		}
	}

}
