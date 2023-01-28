package com.project9.Mediscreen_ClientUI.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project9.Mediscreen_ClientUI.beans.NoteBean;
import com.project9.Mediscreen_ClientUI.beans.PatientAssessmentBean;
import com.project9.Mediscreen_ClientUI.beans.PatientBean;
import com.project9.Mediscreen_ClientUI.proxies.MicroserviceAssessmentsProxy;
import com.project9.Mediscreen_ClientUI.proxies.MicroserviceNotesProxy;
import com.project9.Mediscreen_ClientUI.proxies.MicroservicePatientsProxy;

@Controller
public class AssessmentProxyController {

	private final MicroserviceAssessmentsProxy assessmentsProxy;
	private final MicroserviceNotesProxy notesProxy;
	private final MicroservicePatientsProxy patientsProxy;

	public AssessmentProxyController(MicroserviceAssessmentsProxy microserviceAssessmentsProxy,
			MicroserviceNotesProxy microserviceNotesProxy, MicroservicePatientsProxy microservicePatientsProxy) {
		this.assessmentsProxy = microserviceAssessmentsProxy;
		this.notesProxy = microserviceNotesProxy;
		this.patientsProxy = microservicePatientsProxy;
	}

	@GetMapping("/assessment")
	public String patientsAssessment(Model model, String familyName) {

		PatientBean patient = patientsProxy.patientByLastname(familyName);

		List<NoteBean> notes = notesProxy.findByLastnameOfPatient(familyName);

		PatientAssessmentBean patientAssessment = new PatientAssessmentBean();
		patientAssessment.setPatientBean(patient);
		patientAssessment.setListOfNotesBean(notes);

		model.addAttribute("assessment", assessmentsProxy.assessmentOfPatient(patientAssessment));

		return "assessment";
	}

}
