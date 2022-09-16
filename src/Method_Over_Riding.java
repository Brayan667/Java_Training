



class Animals{
		void animals() {
			System.out.println("This is the super class");
		}
	};

public class Method_Over_Riding extends Animals{
	
	public static void main(String[] args) {
		  
		Method_Over_Riding obj = new Method_Over_Riding();
		obj.animals();
	}
		
	   void animals() {
		   super.animals(); // This is method over riding because the same name method is called from the superclass
		   //using keyword super.
		   System.out.println("This is the subclass"); // If you want the local methid to be called, remove line 20.
	   }
		
	};


