package com.project9.Mediscreen_ClientUI.beans;

import java.sql.Date;

public class PatientBean {

	private Integer id;
	private String lastname;
	private String firstname;
	private Date birthdate;
	private String gender;
	private String address;
	private String phoneNumber;

	public PatientBean() {

	}

	@Override
	public String toString() {
		return "PatientBean [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", birthdate="
				+ birthdate + ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
