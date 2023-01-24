package com.project9.Mediscreen_ClientUI.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project9.Mediscreen_ClientUI.beans.NoteBean;
import com.project9.Mediscreen_ClientUI.beans.PatientBean;
import com.project9.Mediscreen_ClientUI.domain.PatientAssessment;
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

		// 1 - Appeler patientService pour récupérer les infos patients
		PatientBean patient = patientsProxy.patientByFullname(familyName);

		// 2 - Appeler noteService pour récupérer les notes du patient
		List<NoteBean> notes = notesProxy.findByPatientsName(familyName);

		// 3 - Contruire un objet patientAssessment qui contient les données du patients
		// et des notes
		PatientAssessment patientAssessment = new PatientAssessment();
		patientAssessment.setPatientBean(patient);
		patientAssessment.setListOfNotesBean(notes);

		// 4 - Appeler le microserviceAssessment
		model.addAttribute("assessment", assessmentsProxy.assessmentOfPatient(patientAssessment));
//		model.addAttribute("assessment", assessmentsProxy.assessmentByName(familyName));

		return "assessment";
	}

}
