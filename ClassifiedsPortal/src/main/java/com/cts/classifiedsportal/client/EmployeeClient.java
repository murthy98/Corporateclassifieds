package com.cts.classifiedsportal.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.classifiedsportal.model.Employee;

@FeignClient(url = "${employee.feign.client}", name = "${employee.feign.name}")
public interface EmployeeClient {
	
	@GetMapping("/viewemployeeoffers/{id}")
	public ResponseEntity<?> viewEmployeeOffers(@RequestHeader("Authorization") String token,@PathVariable("id") int employeeId);
	
	@GetMapping("/viewprofile/{id}")
	public ResponseEntity<Employee> viewProfile(@RequestHeader("Authorization") String token, @PathVariable("id") int id);
	
	@GetMapping("/viewmostlikedoffers/{id}")
	public ResponseEntity<?> viewTopOffers(@RequestHeader("Authorization") String token, @PathVariable("id") int id);

}
