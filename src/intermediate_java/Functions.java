package intermediate_java;

public class Functions {

	public static void main(String[] args) {
		Functions obj = new Functions();
		System.out.println("Sum if two numbers is " + obj.add(50,80));
		System.out.println("Difference of two numbers is "+  obj.subtract(50,80));
		obj.multiply(123, 4);
		obj.divide(122,0);
	}
		int  add(int x, int y) 
		{
			int sum = x + y;
			return sum;
		}
		int  subtract(int x, int y) 
		{
			int difference = x-y;
			return difference;
		}
		void multiply(int x, int y) 
		{
			System.out.println("Product of two numbers is " +(x*y));
		}
		void divide(int x, int y) 
		{
			if(y==0) System.out.println("Divide by zero error");
			else System.out.println("Division of two numbers is " +(x/y));
		}
//		add();
	};


