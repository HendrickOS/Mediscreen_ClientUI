package com.project9.Mediscreen_ClientUI.beans;

public class NoteBean {

	private Integer id;
	private String patientsName;
	private String commentary;

	public NoteBean() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatientsName() {
		return patientsName;
	}

	public void setPatientsName(String patientsName) {
		this.patientsName = patientsName;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	@Override
	public String toString() {
		return "NoteBean [id=" + id + ", patientsName=" + patientsName + ", commentary=" + commentary + "]";
	}

}
