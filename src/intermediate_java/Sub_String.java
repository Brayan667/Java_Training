package intermediate_java;

public class Sub_String {

	public static void main(String[] args) {
		String a = "Brayan";
		int start = 2; // Entering the indices of the substring that needs to be printed
		int end = 5;
		if(start>=0 && start<a.length()) {
			if(end>=0 && end<a.length()) {
				while(start<=end) {
					System.out.print(a.charAt(start));
					start+=1;
				}
			}
			else {
				System.out.print("Invalid Indices");
			}
		}
		else {
			System.out.print("Invalid Indices");
		}
		
	}

};
