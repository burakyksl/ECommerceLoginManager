package ECommerceLoginManager.Entities.Concretes;

public class Customer {
	private int id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Pasword;
	public Customer(int id, String firstName, String lastName, String email, String pasword) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Pasword = pasword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPasword() {
		return Pasword;
	}
	public void setPasword(String pasword) {
		Pasword = pasword;
	}
	
	
}
