package Pack1;

public class Throw {

	public static void main(String[] args) {
		int age = 19;
		if(age<18) {
			throw new ArithmeticException("You are under age");
		}
		else {
			System.out.println("Age is accepted");
		}

	}

}
