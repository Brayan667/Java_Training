package intermediate_java;

public class Reverse_String {

	public static void main(String[] args) {
		  String s = "abcd";
		  String reverse = " ";
		  int count = s.length();
		  for(int i = count-1; i>=0; i--) {
			   reverse += reverse.charAt(i);
		  }
	}

}
