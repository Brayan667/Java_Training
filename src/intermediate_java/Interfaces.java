package intermediate_java;



interface Interface_1{
	void m1();
	void m2();
}


public class Interfaces implements Interface_1 {

	public static void main(String[] args) { 
		Interfaces obj = new Interfaces();
		obj.m1();
		obj.m2();
	}
	
	public void m1() {
		System.out.println("Interface abstract function definition in sub class for m1");
		
	}
	
	public void m2() {
		System.out.println("Interface abstract function definition in sub class for m2");
	}

};
