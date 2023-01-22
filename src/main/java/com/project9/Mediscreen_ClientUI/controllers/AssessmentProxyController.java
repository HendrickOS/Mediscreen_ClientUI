package com.project9.Mediscreen_ClientUI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project9.Mediscreen_ClientUI.proxies.MicroserviceAssessmentsProxy;

@Controller
public class AssessmentProxyController {

	private final MicroserviceAssessmentsProxy assessmentsProxy;

	public AssessmentProxyController(MicroserviceAssessmentsProxy assessmentsProxy) {
		this.assessmentsProxy = assessmentsProxy;
	}

	@GetMapping("/assessment")
	public String assessmentOfPatient(Model model, String familyName) {
		model.addAttribute("assessment", assessmentsProxy.assessmentByName(familyName));
		return "assessment";
	}

}
