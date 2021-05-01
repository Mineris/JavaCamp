package homework2;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Emir", "Cansiz", "1234", "Student");
		User user2 = new User(2, "Furkan", "Tetik", "1234", "Student");
		User user3 = new User(3, "Engin", "Demiroğ", "1234", "Instructor");
		
		Student student1 = new Student(1, "Emir", "Cansız", "Java");
		Student student2 = new Student(2, "Furkan", "Tetik", "Java");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engin_demirog@gmail.com");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		userManager.loginUser(user3);
		System.out.println("---------------------------------------------");
		userManager.loginUser(user1);
		userManager.loginUser(user2);
		
		System.out.println(" ");
		
		instructorManager.loginInstructor(instructor1);
		
		studentManager.loginStudent(student1);
		studentManager.loginStudent(student2);

	}

}
