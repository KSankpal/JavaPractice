
public class EvenOrOddNumbers_DoWhileLoop {

	public static void main(String[] args) {
		
        int i=1;
		
		do {
			
			if(i%2==0) {
				System.out.println(i+ " is Even");
			}	
			
			else {
				System.out.println(i+ " is Odd");
			}
			
			i++;
			
			
		}while(i<=100);

	}

}
