package Sardana.LoanOrganisationSystem;


public class Address {
	
	public Address() {
		super();
	}

	private String houseNumber;
	private String streetName;
	private String nearestCommonPoint;
	private String city;
	private String state;
	private String Country;
	public Address(String houseNumber, String streetName, String nearestCommonPoint, String city, String state,
			String country) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.nearestCommonPoint = nearestCommonPoint;
		this.city = city;
		this.state = state;
		Country = country;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getNearestCommonPoint() {
		return nearestCommonPoint;
	}
	public void setNearestCommonPoint(String nearestCommonPoint) {
		this.nearestCommonPoint = nearestCommonPoint;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", streetName=" + streetName + ", nearestCommonPoint="
				+ nearestCommonPoint + ", city=" + city + ", state=" + state + ", Country=" + Country + "]";
	}
}
