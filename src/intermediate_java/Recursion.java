package intermediate_java;

public class Recursion {

	public static void main(String[] args) {
		    int n = 5;
		    Recursion obj = new Recursion();
//		    obj.recursion(n,0);
		    System.out.println(obj.recursion(n,0));
	}
	
	
	int recursion (int n, int sum) {
		if(n==0) return sum;
		sum+=n;
		return recursion(n-1,sum);
}
	
};
