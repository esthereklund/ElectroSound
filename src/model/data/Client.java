package model.data;

public class Client {
	private int clientId; 
	private String email;
	private String surname;
	private String name;
	private String street;
	private String house;
	private String pobox;
	private String city;
	
	//Konstruktor
	public Client(String email, String surname, String name, String street, String house, String pobox, String city) {
		this.setEmail(email);
		this.setSurname(surname);
		this.setName(name);
		this.setStreet(street);
		this.setHouse(house);
		this.setPobox(pobox);
		this.setCity(city);
	}
	
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getPobox() {
		return pobox;
	}
	public void setPobox(String pobox) {
		this.pobox = pobox;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Client [email=" + email + ", surname=" + surname + ", name=" + name + ", street=" + street + ", house="
				+ house + ", pobox=" + pobox + ", city=" + city + "]";
	}
	
}
