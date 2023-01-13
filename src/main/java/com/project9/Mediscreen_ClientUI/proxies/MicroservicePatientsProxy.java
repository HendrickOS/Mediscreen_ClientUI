package com.project9.Mediscreen_ClientUI.proxies;

import java.sql.Date;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project9.Mediscreen_ClientUI.beans.PatientBean;

@FeignClient(name = "microservice-patient", url = "localhost:8081")
public interface MicroservicePatientsProxy {

	@RequestMapping(value = "/patients")
	List<PatientBean> patientsList();

	@PostMapping(value = "/validate")
	PatientBean validate(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("fullname") String fullname, @RequestParam("birthdate") Date birthdate,
			@RequestParam("gender") String gender, @RequestParam("address") String address,
			@RequestParam("phoneNumber") String phoneNumber);

}
