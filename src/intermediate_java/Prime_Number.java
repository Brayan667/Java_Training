package intermediate_java;

public class Prime_Number {

	public static void main(String[] args) {
		int n = 15;
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				System.out.println("Number is not prime");
				System.exit(0);
			}
 		}
		System.out.println("Number is prime");
	}

};
