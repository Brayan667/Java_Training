package intermediate_java;

import java.util.Arrays;
public class Arrays_1 {

	public static void main(String[] args) {
		int x[] = {5,7,6,8,9};
		  Arrays.sort(x);
//		  for(int i = 0;i < x.length;i++) {
//		  for(int j=0;j<x.length-1;j++) {
//			  if(x[j]>x[j+1]) {
//				  int temp = x[j];
//				  x[j] = x[j+1];
//				  x[j+1] = temp;
//			  }
//		  }
//		  }
//		  
		  for(int i=0;i<5;i++) {
			  System.out.println(x[i]);
		  }

	}

};
