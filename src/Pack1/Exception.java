package Pack1;

public class Exception {

	public static void main(String[] args) {
		  
		
		int arr[] = new int[9];
		try {
		arr[78] = 19/0;
		}
		catch(ArithmeticException w) {
			System.out.println("Divide by zero error");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.print("Index is out of bounds");
		}
		
	}

};