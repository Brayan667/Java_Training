package basics_java;

class GrandFather{
	 void m2()
	 {
		 System.out.println("Grandfather class");
	 }
}

class Father extends GrandFather {
	void m3() {
		 System.out.println("Father class");
		 m2();
	}
}

public class Child extends Father{

	public static void main(String[] args) {
		 Child obj = new Child();
		 obj.m3();
	}

}
