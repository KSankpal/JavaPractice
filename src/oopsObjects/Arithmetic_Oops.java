package oopsObjects;

public class Arithmetic_Oops {

	public static void main(String[] args) {
        
        TestData data=new TestData();
        data.sum=data.a+data.b;
        System.out.println("Addition of a & b="+data.sum);
        data.diff=data.a-data.b;
        System.out.println("Difference of a & b="+data.diff);
        data.mult=data.a*data.b;
        System.out.println("Multiplicationof a & b="+data.mult);
        data.div=data.a/data.b;
        System.out.println("Division of a & b="+data.div);
	}

}
