package Pack1;



class Access_Specifier{
	private int ans = 0;
	protected int ans2 = 1;
	public int ans3 = 3;	
	int ans4 = 11;
}

 class access_specifier extends access_specifies{
	 
 }


public class Access_specifiers {
	
	
	public static void main(String[] args) {
             Access_Specifier obj = new Access_Specifier();   
             //System.out.print(obj.ans); // Accessing private variable, gives error
             // It can be accessed only inside the same class.
             System.out.println(obj.ans2);//Protected can be accessed by 
             //object 
             System.out.println(obj.ans3);
             System.out.print(obj.ans4);
             System.out.println("Hi");
	}

}
