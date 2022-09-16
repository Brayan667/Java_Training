package intermediate_java;

public class Ascending_String {

	public static void main(String[] args) {
		  String b = "Brayan";
		  char a[] = b.toCharArray();
		  for(int i=0;i<a.length-1;i++) {
			  for(int j=0;j<a.length-1-i;j++) {
				 a[j] = Character.toLowerCase(a[j]);
				 a[j+1] = Character.toLowerCase(a[j+1]);
				  if(a[j]>a[j+1]) {
					  char temp = a[j];
					  a[j] = a[j+1];
					  a[j+1] = temp;
				  }
			  }
		  }
		  
		  
		  for(char c:a) {
			  System.out.print(c);
		  }

	}

};
