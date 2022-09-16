package intermediate_java;

public class String_Comparison {

	public static void main(String[] args) {
		String a = "Brayan";
		String b = "Brayaw";
		
		if(a.length()!=b.length()) {
			System.out.print("Not equal");
			System.exit(0);
		}
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				System.out.print("Not equal");
				System.exit(0);
			}
		}
		
		System.out.print("Equal");
	}

};
