package com.cts.authmicroservice.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cts.authmicroservice.model.AuthResponse;
import com.cts.authmicroservice.model.UserModel;
import com.cts.authmicroservice.model.UserToken;

public interface UserService extends UserDetailsService {

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
	UserToken login(UserModel userModel);

	/**Checks if the token entered by the user is valid or not.
	 * If valid,then it sets the validity as true else it sets 
	 * the validity of the token as false and returns it.
	 * If the token is invalid,then it states that the token in invalid
	 * 
	 * @param token
	 * @return authResponse
	 */
	AuthResponse getValidity(String token);
	
	/**It returns the employee id of the user who has logged in.
	 * It is sent along with the token for future uses.
	 * 
	 * @param userName
	 * @return employeeId(integer)
	 */
	public int getEmpId(String username);
}
