package com.project9.Mediscreen_ClientUI.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project9.Mediscreen_ClientUI.beans.AssessmentBean;
import com.project9.Mediscreen_ClientUI.domain.PatientAssessment;

@FeignClient(name = "microservice-assessment", url = "localhost:8084")
public interface MicroserviceAssessmentsProxy {

//	@GetMapping("/assessment")
//	AssessmentBean assessmentByName(@RequestParam("familyName") String familyName);

	@PostMapping("/assessment")
	AssessmentBean assessmentOfPatient(@RequestBody PatientAssessment patientAssessment);

}
