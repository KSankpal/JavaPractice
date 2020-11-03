package oopsObjects;

public class DistanceConversion_Oops {

	public static void main(String[] args) {
		TestData data = new TestData();
		System.out.println("CONVERT cm TO m");
		System.out.println("The value of cm="+data.cm);
		System.out.println("meters=cm/1000");
	    data.meter=data.cm/1000;
	    System.out.println("Meter ="+data.meter);
	    
	    System.out.println("");
	    System.out.println("CONVERT m TO cm");
	    System.out.println("The value of m="+data.m);
	    System.out.println("centimeter=m/0.001");
	    data.centimeter=data.m/0.001;
	    System.out.println("Centimetemeter ="+data.centimeter);
	    
	    System.out.println("");
	    System.out.println("CONVERT km TO m");
		System.out.println("The value of km="+data.km);
		System.out.println("mtrs=km/0.001");
	    data.mtrs=data.km/0.001;
	    System.out.println("Mtrs ="+data.mtrs);
	    
	    System.out.println("");
		System.out.println("CONVERT m TO km");
		System.out.println("The value of Mtr="+data.mtr);
		System.out.println("kilometer=mtr/1000");
	    data.kilometer=data.mtr/1000;
		System.out.println("Kilometer ="+data.kilometer);

	}

}
