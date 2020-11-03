package returnType;

public class ReturnType {
	int total() {
		int s1=100,s2=100,s3=100,total;
		total=s1+s2+s3;
		return total;
	}
	double avg() {
		double avg;
		avg=total()/3;
		return avg;
	}
	void grade() {
		/*if(avg()<=34 && avg()>=0) {
			System.out.println("Student Fail");
			
		}*/
        if (avg()<35) {
			
			System.out.println("Student Fail");
			
		}
		
		else if(avg()>=36&&avg()<=49) {
			System.out.println("Student Pass in 3rd Grade");
		}
		
		else if(avg()>=50&&avg()<=59) {
			System.out.println("Student Pass in 2nd Grade");
		}	
		
		else if(avg()>=60&&avg()<=74) {
			System.out.println("Student Pass in 1st Grade");
		}
		
		else if(avg()>=75&&avg()<=100) {
			System.out.println("Student Pass in DISTINCTION");
		}
	}
	

	
}
