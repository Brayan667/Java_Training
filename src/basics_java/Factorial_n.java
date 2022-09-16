package basics_java;

public class Factorial_n {

	public static void main(String[] args) {
		 int n = 5;
	     int fact = 1;
	     while(n>=1) {
	    	 fact = fact * n;
	    	 n--;
	     }
	     System.out.println(fact);
	}
};
