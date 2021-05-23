package com.Ahmad.Caterer.Pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Location {

	@NotNull(message = "Street Address cannot be Null")
	@NotBlank(message = "Street Address cannot be Blank")
	private String streetAddress;
	
	@NotNull(message = "City name cannot be Null")
	@NotBlank(message = "City cannot be Blank")
	private String city;

	@NotNull(message = "State Name cannot be Null")
	@NotBlank(message = "State cannot be Blank")
	private String state;

	@Pattern(regexp = "^[0-9]{6}$")
	private int pincode;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String city, String streetAddress, int pincode, String state) {
		super();
		this.city = city;
		this.streetAddress = streetAddress;
		this.pincode = pincode;
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", streetAddress=" + streetAddress + ", pincode=" + pincode + ", state="
				+ state + "]";
	}

}
