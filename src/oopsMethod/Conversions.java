package oopsMethod;

public class Conversions {
	
	void printStar() {
		int i;
		for(i=1;i<=30;i++) {
			System.out.print("*");
	
		}
		System.out.println("");
	}

	void kiloMetersToMeters() {
		System.out.println("CONVERT km TO m");
		double km=2, m;
		
		System.out.println("The value of km="+km);
		
	    System.out.println("m=km/0.001");
	    m=km/0.001;
	    System.out.println("Meter ="+m);
	}
	
	void metersToKilometers() {
        System.out.println("CONVERT m TO km");
		
		double m=1, km;
		
		System.out.println("The value of Meter="+m);
		System.out.println("km=m/1000");
	    km=m/1000;
	    
		System.out.println("Kilometer ="+km);
	}
	
	void centimetersToMeters() {
		System.out.println("CONVERT cm TO m");
		double cm=1000, m;
		System.out.println("The value of cm="+cm);
		System.out.println("m=cm/1000");
	    m=cm/1000;
	    
		System.out.println("Meter ="+m);
	}
	
	void metersToCentimeters() {
		System.out.println("CONVERT m TO cm");
		double m=1, cm;
		
		System.out.println("The value of m="+m);
		
	    System.out.println("cm=m/0.001");
	    cm=m/0.001;
	    System.out.println("Centimetemeter ="+cm);
	}
	void celsiusToFahrenheit() {
		System.out.println("CONVERT 'C TO 'F");
		double C=1, F;
		System.out.println("The value of Celsius="+C);
		System.out.println("(F=C*9/5)+32");
		F=C*9/5+32;
		System.out.println("Fahrenheit ="+F);

	}
	void fahrenheitToCelsius() {
		System.out.println("CONVERT 'F TO 'C");
		double F=50, C;
		
		System.out.println("The value of F="+F);
		
	    System.out.println("C=(F-32)*5/9");
	    C=(F-32)*5/9;
	    System.out.println("Celsius ="+C);
	}
	void gramsToKilograms() {
		 System.out.println("CONVERT g TO kg");
			double g=1000, kg;
			
			System.out.println("The value of g="+g);
			
		    System.out.println("kg=g/1000");
		    kg=g/1000;
		    System.out.println("Kilogram ="+kg);
		}
	 void kilogramsToGrams() {
		 System.out.println("CONVERT kg TO g");
			double kg=1, gms;
			System.out.println("The value of Kg="+kg);
			System.out.println("gms=kg/0.001");
			gms=kg/0.001;
		    
			System.out.println("gms ="+gms);
		}
	 void gramsToMilligrams() {
		 System.out.println("CONVERT g TO mg");
			double g=1, mg;
			
			System.out.println("The value of g="+g);
			
		    System.out.println("mg=g/0.001");
		    mg=g/0.001;
		    System.out.println("Milligrams ="+mg);
		    
	 }
	 void milligramsToGrams() {
		 System.out.println("CONVERT mg TO g");
			double mg=1000, gms;
			System.out.println("The value of mg="+mg);
			System.out.println("gms=mg/1000");
			gms=mg/1000;
		    
			System.out.println("gram ="+gms);
	 }
	 void litersToMilliliters() {
		 System.out.println("CONVERT L TO mL");
			
			double L=1, mL;
			
			System.out.println("The value of L="+L);
			System.out.println("mL=L/0.001");
			
		    mL=L/0.001;
		    
			System.out.println("mL ="+mL);
	 }
	 void millilitersToLiters() {
		 System.out.println("CONVERT mL TO L");
			double mL=1000, L;
			
			System.out.println("The value of mL="+mL);
			
		    System.out.println("L=mL/1000");
		    L=mL/1000;
		    System.out.println("Liters ="+L);
	 }

}

