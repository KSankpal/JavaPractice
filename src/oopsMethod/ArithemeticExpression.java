package oopsMethod;

public class ArithemeticExpression {

	void printStar() {
		int i;
		for(i=1;i<=30;i++) {
			System.out.print("*");
	
		}
		System.out.println("");
	}
	
	void addTwoNumbers( ) {
	int a=2,b=2,c;
	System.out.println("The value of a="+a);
	System.out.println("The value of b="+b);
	

	c=a+b;
	System.out.println("a+b="+c);
	}
	
	void subtractTwoNumbers() {
		int a=10,b=6,c;
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
		c=a-b;
		System.out.println("Difference of a and b="+c);
		
	}
	
	void multiplyTwoNumbers() {
		int a=5,b=6,c;
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
		c=a*b;
		System.out.println("Multiplication of a and b="+c);
		
	}
	
	void divisionOfTwoNumbers() {
		int a=30,b=6,c;
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
		c=a/b;
		System.out.println("Division of a and b="+c);
		
	}
	void swappingNumbers() {
        int a=1, b=2, c;
		System.out.println("Before swapping a="+a);
		System.out.println("Before swapping b="+b);
		c=a;a=b;b=c;
		System.out.println("After swapping a="+a);
		System.out.println("After swapping b="+b);
	}
	void alcoholProgram() {
		int age=20;
	     
	     if (age<18) {
	    	 System.out.println("Do not sell alcohol");
	     }
	     else if(age<=24) {
	        System.out.println("sell alocohol with id ");
	        }
	     else {
	        System.out.println("sell alcohol");
		}
	}
	void averageMarks() {
        double S1=10,S2=20,S3=30,S4=40,S5=50,S6=60,Total,Average;
		System.out.println("The marks of S1="+S1);
		System.out.println("The marks of S2="+S2);
		System.out.println("The marks of S3="+S3);
		System.out.println("The marks of S4="+S4);
		System.out.println("The marks of S5="+S5);
		System.out.println("The marks of S6="+S6);
		Total=S1+S2+S3+S4+S5+S6;
		System.out.println("The Total marks="+Total);
		Average=Total/6;
		System.out.println("The Average marks="+Average);
	}
	void bankBalance() {
        double Total=800,Withdraw=500,Balance;
		System.out.println("The total amount in my account=£"+Total);
		System.out.println("The amount to withdraw=£"+Withdraw);
		Balance=Total-Withdraw;
		System.out.println("The Balance in my account=£"+Balance);
		
	}


}
