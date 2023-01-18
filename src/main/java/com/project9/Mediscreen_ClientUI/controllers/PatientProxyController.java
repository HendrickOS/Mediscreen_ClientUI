package com.project9.Mediscreen_ClientUI.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String addPatient(PatientBean patientBean) {
		return "patient/add";
	}

	@PostMapping("/patients/validate")
	public String validate(@Valid PatientBean patientBean, BindingResult result, Model model) {
		if (!result.hasErrors()) {
			patientsProxy.validate(patientBean.getId(), patientBean.getName(), patientBean.getFullname(),
					patientBean.getBirthdate(), patientBean.getGender(), patientBean.getAddress(),
					patientBean.getPhoneNumber());
			return "redirect:/patients/list";
		}
		return "patient/add";
	}

	@GetMapping("/patients/update/{id}")
	public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
		PatientBean patientBean = patientsProxy.findById(id);
//		PatientBean patientBean = patientsProxy.showUpdateForm(id, model);
		model.addAttribute("patient", patientBean);
		return "patient/update";
	}

	@PostMapping("/patients/update/{id}")
	public String updatePatient(@PathVariable("id") Integer id, @Valid PatientBean patientBean, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "patient/update";
		}
		patientBean.setId(id);
		patientsProxy.updatePatient(patientBean.getId(), patientBean.getName(), patientBean.getFullname(),
				patientBean.getBirthdate(), patientBean.getGender(), patientBean.getAddress(),
				patientBean.getPhoneNumber());
		model.addAttribute("patient", patientsProxy.listOfPatients());
		return "redirect:/patients/list";
	}

	@DeleteMapping("/patients/delete/{id}")
	public String deletePatient(Integer id, Model model) {
//		PatientBean patientBean = patientsProxy.findById(id);
//		if (patientBean != null) {
		patientsProxy.delete(id);
//		}
		model.addAttribute("patient", patientsProxy.patientsList());
		return "redirect:/patients/list";
	}

}
