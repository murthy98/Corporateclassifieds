package com.cts.employeemicroservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employeemicroservice.model.Employee;
import com.cts.employeemicroservice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeeService;

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list of that particular employee
	 * through the offer client and returns it.
	 * 
	 * @param token 
	 * @param employeeId
	 * @return ResponseEntity<List<EmployeeOffers>>
	 * @throws InvalidUserException
	 */
	
	@GetMapping("/viewemployeeoffers/{id}")
	public ResponseEntity<?> viewEmployeeOffers(@RequestHeader("Authorization") String token,
			@PathVariable("id") int employeeId) {
		LOGGER.info("Inside view employee offers");
		return new ResponseEntity<>(employeeService.viewEmpOffers(token, employeeId), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the top liked offers of that particular employee
	 * through the offer client and uses stream to filter top 3 offers and returns it.
	 * 
	 * @param token
	 * @param employeeId
	 * @return ResponseEntity<List<EmployeeOffers>>
	 * @throws InvalidUserException
	 */
	@GetMapping("/viewprofile/{id}")
	public ResponseEntity<Employee> viewProfile(@RequestHeader("Authorization") String token, @PathVariable("id") int id) {
		LOGGER.info("Inside view employee profile");
		return new ResponseEntity<>(employeeService.viewEmployee(token, id), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the top liked offers of that particular employee
	 * through the offer client and uses stream to filter top 3 offers and returns it.
	 * 
	 * @param token
	 * @param employeeId
	 * @return ResponseEntity<List<EmployeeOffers>>
	 * @throws InvalidUserException
	 */
	@GetMapping("/viewmostlikedoffers/{id}")
	public ResponseEntity<?> viewTopOffers(@RequestHeader("Authorization") String token, @PathVariable("id") int id) {
		LOGGER.info("Inside view top offers");
		return new ResponseEntity<>(employeeService.viewTopOffers(token, id), HttpStatus.OK);
	}
}
