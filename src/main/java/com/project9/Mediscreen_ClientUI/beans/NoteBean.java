package com.project9.Mediscreen_ClientUI.beans;

public class NoteBean {

	private String id;
	private String lastnameOfPatient;
	private String commentary;

	public NoteBean() {

	}

	@Override
	public String toString() {
		return "NoteBean [id=" + id + ", lastnameOfPatient=" + lastnameOfPatient + ", commentary=" + commentary + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastnameOfPatient() {
		return lastnameOfPatient;
	}

	public void setLastnameOfPatient(String lastnameOfPatient) {
		this.lastnameOfPatient = lastnameOfPatient;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

}
