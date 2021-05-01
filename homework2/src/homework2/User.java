package homework2;

public class User {
	private int Id;
	private String FirstName;
	private String LastName;
	private String Password;
	private String Status;
	
	public User(int id, String firstName, String lastName, String password, String status) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Password = password;
		Status = status;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public String getStatus() {
		return Status;
	}
	
	public void setStatus(String status) {
		Status = status;
	}

}
