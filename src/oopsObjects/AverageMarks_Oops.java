package oopsObjects;

public class AverageMarks_Oops {

	public static void main(String[] args) {
     
        TestData data=new TestData();
		
		System.out.println("The marks of S1="+data.S1);
		System.out.println("The marks of S2="+data.S2);
		System.out.println("The marks of S3="+data.S3);
		System.out.println("The marks of S4="+data.S4);
		System.out.println("The marks of S5="+data.S5);
		System.out.println("The marks of S6="+data.S6);
		data.total=data.S1+data.S2+data.S3+data.S4+data.S5+data.S6;
		System.out.println("The Total marks="+data.total);
		data.average=data.total/6;
		System.out.println("The Average marks="+data.average);

	}

}
