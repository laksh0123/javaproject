package Model;

public class RegisterM {
	String Email;
	String Password;
	@javax.validation.constraints.Email(message = "Email should be valid")
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
