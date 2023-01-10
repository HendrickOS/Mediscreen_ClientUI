package com.project9.Mediscreen_ClientUI.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project9.Mediscreen_ClientUI.beans.PatientBean;

@FeignClient(name = "microservice-patient", url = "localhost:8081")
public interface MicroservicePatientsProxy {

	@RequestMapping(value = "/patients")
	List<PatientBean> patientsList();

}
