package com.project9.Mediscreen_ClientUI.beans;

import java.sql.Date;

public class PatientBean {

	private Integer id;
	private String name;
	private String fullname;
	private Date birthdate;
	private String gender;
	private String address;
	private String phoneNumber;

	public PatientBean() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	@Override
	public String toString() {
		return "PatientBean [id=" + id + ", name=" + name + ", fullname=" + fullname + ", birthdate=" + birthdate
				+ ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

}
