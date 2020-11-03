package oopsObjects;

public class ConvertTemperature_Oops {

	public static void main(String[] args) {

		TestData data=new TestData();
		System.out.println("The value of Celsius="+data.C);
		System.out.println("F=C*9/5+32");
		data.Fahrenheit=data.C*9/5+32;
		System.out.println("Fahrenheit ="+data.Fahrenheit);
		System.out.println("");
        System.out.println("The value of F="+data.F);
	    System.out.println("C=(F-32)*5/9");
	    data.celsius=(data.F-32)*5/9;
	    System.out.println("Celsius ="+data.celsius);


	}

}
