package intermediate_java;


public class Arrays {

	public static void main(String[] args) {
		  int x[] = {5,7,6,8,9};
		  for(int i = 0;i < x.length;i++) {
		  for(int j=0;j<x.length-1;j++) {
			  if(x[j]>x[j+1]) {
				  int temp = x[j];
				  x[j] = x[j+1];
				  x[j+1] = temp;
			  }
		  }
		  }
		  
		  for(int i=0;i<5;i++) {
			  System.out.println(x[i]);
		  }
	};

};
