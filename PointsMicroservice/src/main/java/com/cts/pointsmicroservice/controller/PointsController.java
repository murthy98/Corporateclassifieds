package com.cts.pointsmicroservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pointsmicroservice.service.PointsService;

@RestController
public class PointsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PointsController.class);

	@Autowired
	PointsService pointsService;

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list of that particular employee
	 * through the offer client and returns it.
	 * 
	 * @param token
	 * @param employeeId
	 * @return Points
	 * @throws InvalidUserException
	 */
	@GetMapping("/getpointsbyemp/{id}")
	public ResponseEntity<Integer> getPointsByEmpId(@RequestHeader(name = "Authorization") String token,
			@PathVariable("id") int id) {
		LOGGER.info("Inside getpointsbyemployeeid");
		return new ResponseEntity<>(pointsService.getPoints(token, id), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list of that particular employee
	 * through the offer client and returns it.
	 * 
	 * if the employee posted an offer and it has 50 likes within 2 days that employee get 10 points
	 * if the employee posted an offer and it has 100 likes within 2 days that employee get 50 points
	 * 
	 * @param token
	 * @param employeeId
	 * @return Points
	 * @throws InvalidUserException
	 */
	@PostMapping("/refreshpointsbyemp/{id}")
	public ResponseEntity<?> refreshPointsByEmpId(@RequestHeader(name = "Authorization") String token,
			@PathVariable("id") int id) {
		LOGGER.info("Inside refreshpoints");
		return new ResponseEntity<>(pointsService.refreshPoints(token, id),HttpStatus.OK);
	}

}
