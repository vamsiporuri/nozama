package com.nozama.service.user.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Address {

	@NotNull
    @Size(min=2, max=30)
	private String addressLine1;
	
	@Size(min=2, max=30)
	private String addressLine2;
	
	@NotNull
	@Size(min=2, max=15)
	private String city;
	
	@NotNull
	@Size(min=2, max=15)
	private String state;

	@NotNull
	@Size(min=5, max=5)
	private String zipcode;
	
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
}
