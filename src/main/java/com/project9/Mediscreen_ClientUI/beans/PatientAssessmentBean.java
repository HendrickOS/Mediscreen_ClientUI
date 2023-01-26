package com.project9.Mediscreen_ClientUI.beans;

import java.util.List;

public class PatientAssessmentBean {

	private PatientBean patientBean;
	private List<NoteBean> listOfNotesBean;

	public PatientBean getPatientBean() {
		return patientBean;
	}

	public void setPatientBean(PatientBean patientBean) {
		this.patientBean = patientBean;
	}

	public List<NoteBean> getListOfNotesBean() {
		return listOfNotesBean;
	}

	public void setListOfNotesBean(List<NoteBean> listOfNotesBean) {
		this.listOfNotesBean = listOfNotesBean;
	}

	@Override
	public String toString() {
		return "PatientAssessment [patientBean=" + patientBean + ", listOfNotesBean=" + listOfNotesBean + "]";
	}

}
