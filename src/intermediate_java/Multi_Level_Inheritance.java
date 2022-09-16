package intermediate_java;

class Login {
    String username = "Brayan";
    String password = "abcde";
	void login_users() {
		System.out.println("Please login using the credentials");
	}
};


class Add_Ben extends Login{
	int beneficiary_code = 1122;
	void add_beneficiary() {
		System.out.println("The username is " + username); // Due to inheritance Login credentials
		//can be accessed by this class
		System.out.println("The password is " + password);
	}
}

class Transfer_Funds extends Add_Ben {
    int funds = 10000;
    void transfer_fund() {
  	  System.out.println("The funds transferred by " + username + " With Beneficiary code " + beneficiary_code + " is: " + funds );
    }
}

public class Multi_Level_Inheritance {
	public static void main(String[] args) {
		Transfer_Funds obj = new Transfer_Funds();
		obj.transfer_fund();
	}

}
