package intermediate_java;

public class Function_Overloading {
	int result;
	
	
	void add(int x, int y) {
		result = x+y;
		System.out.println("Addition of integer numbers: " + result);
	}
	
	void add(float x, float y) {
		float result = x+y;
		System.out.println("Addition of float numbers: " + result);
	}
	
	void add(int a, int b, int c) {
		result = a+b+c;
		System.out.println("Addition of three numbers: " + result);
	}
	
	

	public static void main(String[] args) {
		Function_Overloading obj = new Function_Overloading();
		obj.add(10,20);
		obj.add(23.33f, 15.22f);
		obj.add(12,23,33);
	}

};
