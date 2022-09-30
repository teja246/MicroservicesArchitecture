package com.tejait.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/employeeFallback")
	public String storeServiceFallbackMethod() {
		return "employee service is longer than expected. Please reachout Teja IT-7013781152";
	}
	
	@GetMapping("/departmentFallback")
	public String catalogServiceFallbackMethod() {
		return "catalog service is longer than expected. Please reachout Teja IT-7013781152";
	}
}
