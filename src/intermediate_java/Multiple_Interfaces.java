package intermediate_java;



interface int1{
	void m1();
}

interface int2 extends int1{
	void m2();
}


public class Multiple_Interfaces implements int1, int2 {

	public static void main(String[] args) {
		   Multiple_Interfaces obj = new Multiple_Interfaces();
		   obj.m1();
		   obj.m2();

	}
	
	
	
	public void m1() {
		System.out.println("Multilevel inheritance using interfaces and function definition of m1");
	}
	
	public void m2() {
		System.out.println("Multilevel inheritance using interfaces and function definition of m2");
	}

}
