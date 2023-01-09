package com.project9.Mediscreen_ClientUI.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project9.Mediscreen_ClientUI.beans.PatientBean;
import com.project9.Mediscreen_ClientUI.proxies.MicroservicePatientsProxy;

@Controller
public class ClientController {

	private final MicroservicePatientsProxy patientsProxy;

	public ClientController(MicroservicePatientsProxy patientsProxy) {
		this.patientsProxy = patientsProxy;
	}

	@RequestMapping("/")
	public String accueil(Model model) {
		List<PatientBean> patients = patientsProxy.patientsList();
		model.addAttribute("patients", patients);
		return "Accueil";

	}

}
