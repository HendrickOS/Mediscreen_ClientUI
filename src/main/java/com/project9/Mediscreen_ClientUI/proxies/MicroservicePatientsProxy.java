package com.project9.Mediscreen_ClientUI.proxies;

import java.sql.Date;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project9.Mediscreen_ClientUI.beans.PatientBean;

@FeignClient(name = "microservice-patient", url = "localhost:8081")
public interface MicroservicePatientsProxy {

	@RequestMapping(value = "/patients")
	List<PatientBean> patientsList();

	@GetMapping("/patients/add")
	public String addPatient(PatientBean patientBean);

	@PostMapping(value = "patients/validate")
	PatientBean validate(@RequestParam("id") Integer id, @RequestParam("lastname") String lastname,
			@RequestParam("firstname") String firstname, @RequestParam("birthdate") Date birthdate,
			@RequestParam("gender") String gender, @RequestParam("address") String address,
			@RequestParam("phoneNumber") String phoneNumber);

	@GetMapping("/patients/{lastname}")
	public PatientBean patientByLastname(@RequestParam("lastname") String lastname);

	@GetMapping("/patients/update/{id}")
	public PatientBean showUpdateForm(@RequestParam("id") Integer id);

	@PostMapping("/patients/update/{id}")
	PatientBean updatePatient(@RequestParam("id") Integer id, @RequestParam("lastname") String lastname,
			@RequestParam("firstname") String firstname, @RequestParam("birthdate") Date birthdate,
			@RequestParam("gender") String gender, @RequestParam("address") String address,
			@RequestParam("phoneNumber") String phoneNumber);

	@DeleteMapping("/patients/delete")
	void delete(@PathVariable("id") Integer id);

}
