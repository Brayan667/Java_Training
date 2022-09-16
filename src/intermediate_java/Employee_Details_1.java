package intermediate_java;

public class Employee_Details_1 {

		String Employee_name;
		int age;
		int grade;
		
		Employee_Details_1(){
			Employee_name = "Brayan";
			age = 17;
			grade = 90;
		}
		
		void display() {
			System.out.println("Employee name is: " + Employee_name);
			System.out.println(Employee_name + " Age is " + age);
			System.out.println("Employee grade is: " + grade);
		}

		public static void main(String[] args) {
			Employee_Details_1 obj = new Employee_Details_1(); // Initializing the data using constructor
			obj.display();
		}

	};


