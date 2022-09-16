package intermediate_java;

public class Employee_Details {
	static String name = "Brayan";
	static int age = 22;
	
	public static void main(String[] args) {
		System.out.println("I am called after static block");
		special_functions();
	}
	
	static void special_functions() {
		System.out.println(name); // Static function can directly access static variable without 
		//using class name.
		System.out.println(age);
		
	}
	
	
	
	static {
		System.out.println("I have the highest priority, the JVM calls me first");
		// static block is called first by JVM.
	}

}
