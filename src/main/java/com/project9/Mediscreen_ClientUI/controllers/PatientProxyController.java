package com.project9.Mediscreen_ClientUI.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project9.Mediscreen_ClientUI.beans.PatientBean;
import com.project9.Mediscreen_ClientUI.proxies.MicroservicePatientsProxy;

@Controller
public class PatientProxyController {

	private final MicroservicePatientsProxy patientsProxy;

	public PatientProxyController(MicroservicePatientsProxy patientsProxy) {
		this.patientsProxy = patientsProxy;
	}

	@RequestMapping("/patients/list")
	public String patientsList(Model model) {
		List<PatientBean> patients = patientsProxy.patientsList();
		model.addAttribute("patient", patients);
		return "patient/list";
	}

	@GetMapping("/patients/add")
	public String addPatient() {
		return "patient/add";
	}
//
//	@PostMapping("/patients/validate")
//	public String validate(@Valid Patient patient, BindingResult result, Model model) {
//		if (!result.hasErrors()) {
//			patientService.save(patient);
//			return "redirect:/patients/list";
//		}
//		return "patient/add";
//	}
//
//	@GetMapping("/patients/update/{id}")
//	public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
//		Patient patient = patientService.findById(id);
//		model.addAttribute("patient", patient);
//		return "patient/update";
//	}
//
//	@PostMapping("/patients/update/{id}")
//	public String updatePatient(@PathVariable("id") Integer id, @Valid Patient patient, BindingResult result,
//			Model model) {
//		if (result.hasErrors()) {
//			return "patient/update";
//		}
//		patient.setId(id);
//		patientService.save(patient);
//		model.addAttribute("patient", patientService.findAll());
//		return "redirect:/patients/list";
//	}
//
//	@GetMapping("/patients/delete/{id}")
//	public String deletePatient(@PathVariable("id") Integer id, Model model) {
//		Patient patient = patientService.findById(id);
//		if (patient != null) {
//			patientService.delete(patient);
//		}
//		model.addAttribute("patient", patientService.findAll());
//		return "redirect:/patients/list";
//	}

}
