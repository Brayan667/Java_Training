package intermediate_java;

public class Student_Details {
	String student_name;
	int age;
	int grade;
	
	Student_Details(){
		student_name = "Brayan";
		age = 17;
		grade = 90;
	}
	
	void display() {
		System.out.println("Student name is: " + student_name);
		System.out.println(student_name + " Age is " + age);
		System.out.println("Student grade is: " + grade);
	}

	public static void main(String[] args) {
		Student_Details obj = new Student_Details();
		obj.display();
	}

};
