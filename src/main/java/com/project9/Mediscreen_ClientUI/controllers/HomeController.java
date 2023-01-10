package com.project9.Mediscreen_ClientUI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//	private final MicroservicePatientsProxy patientsProxy;
//
//	public PatientProxyController(MicroservicePatientsProxy patientsProxy) {
//		this.patientsProxy = patientsProxy;
//	}

	@RequestMapping("/")
	public String home(Model model) {
//		List<PatientBean> patients = patientsProxy.patientsList();
//		model.addAttribute("patient", patients);
		return "home";
	}

}
