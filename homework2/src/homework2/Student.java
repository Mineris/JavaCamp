package homework2;

public class Student {
	private int Id;
	private String Name;
	private String LastName;
	private String StudentClass;
	
	public Student(int id, String name, String lastName, String studentClass) {
		super();
		Id = id;
		Name = name;
		LastName = lastName;
		StudentClass = studentClass;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getStudentClass() {
		return StudentClass;
	}
	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}
	

}
