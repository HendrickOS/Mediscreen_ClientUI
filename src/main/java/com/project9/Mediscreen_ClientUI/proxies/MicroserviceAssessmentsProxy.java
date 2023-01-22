package com.project9.Mediscreen_ClientUI.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project9.Mediscreen_ClientUI.beans.AssessmentBean;

@FeignClient(name = "microservice-assessment", url = "localhost:8083")
public interface MicroserviceAssessmentsProxy {

	@RequestMapping("/assessment")
	AssessmentBean assessmentByName(@RequestParam("familyName") String familyName);

}
