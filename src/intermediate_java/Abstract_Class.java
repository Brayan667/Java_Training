package intermediate_java;

abstract class abs{
	abstract void m1();
}


public class Abstract_Class extends abs {

	public static void main(String[] args) {
		Abstract_Class obj = new Abstract_Class();
		obj.m1();
	}
	
	void m1() {
		System.out.println("The function definition of abstract class is in sub class");
	}
};
