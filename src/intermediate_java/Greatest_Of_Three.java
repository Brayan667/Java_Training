package intermediate_java;

public class Greatest_Of_Three {

	public static void main(String[] args) {
		int a=122,b=2,c=3;
	    if(a>=b) {
    	if(a>=c) System.out.println(a + " is greatest");
    	else  System.out.println(c + " is greatest");
    }
    else {
    	if(b>=c) System.out.println(b+ " is greatest");
    	else  System.out.println(c+ " is greatest");
    }
	}

};
