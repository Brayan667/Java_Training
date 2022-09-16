package intermediate_java;

public class Function_Overloading_Substract {
	
    int result;
	
	
	void substract(int x, int y) {
		result = x-y;
		System.out.println("Substraction of integer numbers: " + result);
	}
	
	void substract(float x, float y) {
		float result = x-y;
		System.out.println("Substraction of float numbers: " + result);
	}
	
	void substract(int a, int b, int c) {
		result = a-b-c;
		System.out.println("Substraction of three numbers: " + result);
	}
	

	public static void main(String[] args) {
		Function_Overloading_Substract obj = new Function_Overloading_Substract();
		obj.substract(10,20);
		obj.substract(23.33f, 15.22f);
		obj.substract(12,23,33);
	}

}
