package Pack1;

public class Exception_1 {

	public static void main(String[] args) {
		int arr[] = new int[12];
		try {
			arr[77] = 12/0;
		}
		catch (Exception e) {
			System.out.println("Exception has occured");	
		}
		catch (IndexOutOfBoundsException i) {
			System.out.println("Array index is out of bounds");
		}
		catch (ArithmeticException t) {
			System.out.println("Arithmetic exception has occured");
		}
		finally {
			System.out.println("Used try catch concept");
		}
	}

};
