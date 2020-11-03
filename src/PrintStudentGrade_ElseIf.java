
public class PrintStudentGrade_ElseIf {

	public static void main(String[] args) {
		
		int avg = 100;
		
		System.out.println("The average marks of the student is "+ avg);
		
		if (avg<35) {
			
			System.out.println("Student Fail");
			
		}
		
		else if(avg>=36&&avg<=49) {
			System.out.println("Student Pass in 3rd Grade");
		}
		
		else if(avg>=50&&avg<=59) {
			System.out.println("Student Pass in 2nd Grade");
		}	
		
		else if(avg>=60&&avg<=74) {
			System.out.println("Student Pass in 1st Grade");
		}
		
		else if(avg>=75&&avg<=100) {
			System.out.println("Student Pass in DISTINCTION");
		}
	}
	

}
