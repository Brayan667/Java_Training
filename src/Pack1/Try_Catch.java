package Pack1;

public class Try_Catch {

	public static void main(String[] args){
		 int a = 29;
		 try {
		 System.out.println(a/0);
		 }
		 catch(ArithmeticException e){
			 System.out.println("Divide by zero error!");
		 }
	}

}
