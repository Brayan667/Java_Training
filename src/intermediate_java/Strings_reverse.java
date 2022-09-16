package intermediate_java;

public class Strings_reverse {

	public static void main(String[] args) {
		String b  = "Brayan";
		char reverse[] = b.toCharArray(); // We are converting string to char array to easily access the elements using indexing.
		int start = 0;
		int end = reverse.length-1;
		while(start<end) {
			char temp = reverse[start];
			reverse[start] = reverse[end];
			reverse[end] = temp;
			start+=1;
			end-=1;
		}
		for(int i=0;i<reverse.length;i++) {
			System.out.print(reverse[i]);
		}
	}

};
