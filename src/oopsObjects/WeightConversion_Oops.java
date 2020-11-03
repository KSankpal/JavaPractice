package oopsObjects;

public class WeightConversion_Oops {

	public static void main(String[] args) {
		TestData data = new TestData();
		System.out.println("CONVERT g TO kg");
		System.out.println("The value of g="+data.g1);
	    System.out.println("kilogram=g/1000");
	    data.kg1=data.g1/1000;
	    System.out.println("Kilogram ="+data.kg1);
	    
	    System.out.println("");
	    System.out.println("CONVERT kg TO g");
		System.out.println("The value of Kg="+data.kg2);
		System.out.println("gms=kg/0.001");
		data.g2=data.kg2/0.001;
		System.out.println("gms ="+data.g2);
		
		System.out.println("");
		System.out.println("CONVERT mg TO g");
		System.out.println("The value of mg="+data.mg3);
		System.out.println("gms=mg/1000");
		data.g3=data.mg3/1000;
		System.out.println("gram ="+data.g3);
		
		System.out.println("");
		System.out.println("CONVERT g TO mg");
		System.out.println("The value of g="+data.g4);
	    System.out.println("mg=g/0.001");
	    data.mg4=data.g4/0.001;
	    System.out.println("Milligrams ="+data.mg4);
	}

}
