package homework2;

public class Instructor {
	private int Id;
	private String FirstName;
	private String LastName;
	private String ContactInfo;
	
	public Instructor(int id, String firstName, String lastName, String contactInfo) {
		super();
		this.Id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.ContactInfo = contactInfo;
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

	public String getContactInfo() {
		return ContactInfo;
	}

	public void setContactInfo(String contactInfo) {
		ContactInfo = contactInfo;
	}

}
