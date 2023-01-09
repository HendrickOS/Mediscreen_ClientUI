package com.project9.Mediscreen_ClientUI.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.project9.Mediscreen_ClientUI.beans.PatientBean;

@FeignClient(name = "patient_microservice", url = "localhost:8081")
public interface MicroservicePatientsProxy {

	@GetMapping(value = "/patients/list")
	List<PatientBean> patientsList();

}
