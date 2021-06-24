package com.cts.authmicroservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.authmicroservice.model.AuthResponse;
import com.cts.authmicroservice.model.UserModel;
import com.cts.authmicroservice.model.UserToken;
import com.cts.authmicroservice.service.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	/**Checks if the userName and the password entered by the employee
	 * is correct or not.If it is correct,the it creates the authorization 
	 * token with the userName,employeeId and it returns the token.If the 
	 * entered userName or password is incorrect,then it throws 
	 * UnauthorizedException
	 * 
	 * @param userModel
	 * @return userToken
	 * @throws UnauthorizedException
	 */
	@PostMapping("/login")
	public ResponseEntity<UserToken> login(@RequestBody UserModel userModel) {
		// gets login details, sends it to service class & return login credentials
		LOGGER.info("Inside Login : ");
		return new ResponseEntity<UserToken>(userServiceImpl.login(userModel), HttpStatus.OK);
	}

	/**Checks if the token entered by the user is valid or not.
	 * If valid,then it sets the validity as true else it sets 
	 * the validity of the token as false and returns it.
	 * If the token is invalid,then it states that the token in invalid
	 * 
	 * @param token
	 * @return authResponse
	 */
	@GetMapping("/validate")
	public ResponseEntity<AuthResponse> getValidity(@RequestHeader("Authorization") String token) {
		// gets authorization token & checks for validity
		LOGGER.info("Inside Token Validation ");
		return new ResponseEntity<AuthResponse>(userServiceImpl.getValidity(token), HttpStatus.OK);
	}

	/**It returns the employee id of the user who has logged in.
	 * It is sent along with the token for future uses.
	 * 
	 * @param userName
	 * @return employeeId(integer)
	 */
	@GetMapping("/getempid")
	public int getEmpId(String username) {
		LOGGER.info("Inside get employee id");
		return userServiceImpl.getEmpId(username);
	}

}
