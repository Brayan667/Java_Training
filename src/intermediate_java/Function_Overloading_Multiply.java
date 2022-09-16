package intermediate_java;

public class Function_Overloading_Multiply {
		int result;
		
		
		void multiply(int x, int y) {
			result = x*y;
			System.out.println("Multiplication of integer numbers: " + result);
		}
		
		void multiply(float x, float y) {
			float result = x*y;
			System.out.println("Multiplication of float numbers: " + result);
		}
		
		void multiply(int a, int b, int c) {
			result = a*b*c;
			System.out.println("Multiplication of three numbers: " + result);
		}
		
		
		public static void main(String[] args) {
			Function_Overloading_Multiply obj = new Function_Overloading_Multiply();
			obj.multiply(10,20);
			obj.multiply(23.33f, 15.22f);
			obj.multiply(12,23,33);

	}

};
