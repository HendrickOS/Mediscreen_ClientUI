package com.project9.Mediscreen_ClientUI.beans;

import org.bson.types.ObjectId;

public class NoteBean {

	private ObjectId id;
	private String lastnameOfPatient;
	private String commentary;

	public NoteBean() {

	}

	@Override
	public String toString() {
		return "NoteBean [id=" + id + ", lastnameOfPatient=" + lastnameOfPatient + ", commentary=" + commentary + "]";
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
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
