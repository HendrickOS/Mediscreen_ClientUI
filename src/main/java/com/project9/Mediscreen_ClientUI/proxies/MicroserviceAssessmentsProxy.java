package com.project9.Mediscreen_ClientUI.proxies;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "microservice-assessment", url = "localhost:8083")
public interface MicroserviceAssessmentsProxy {

//	@RequestMapping("/assessment")

}
