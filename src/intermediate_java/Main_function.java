package intermediate_java;

public class Main_function {
	void main1() {
		int a = 6;
		int d = 7;
		System.out.println(a+d);
	}
	
	
	void main() {	
		System.out.println("When was I called?");
	}

	public static void main(String[] args) {
		Main_function obj = new Main_function();
		obj.main();
		obj.main();
	}

};
