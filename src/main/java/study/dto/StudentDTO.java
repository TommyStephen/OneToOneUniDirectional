package study.dto;

public class StudentDTO {

	private long id;
	private String name;
	private String email;
	private String password;
	private String street;
	private String city;
	private String country;
	
	public StudentDTO() {
		
	}
	public StudentDTO(long id, String name, String email, String password, String street, String city, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", street="
				+ street + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
