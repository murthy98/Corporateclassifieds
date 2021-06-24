package com.cts.pointsmicroservice.service;

import com.cts.pointsmicroservice.model.Points;

public interface PointsService {

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list of that particular employee
	 * through the offer client and returns it.
	 * 
	 * @param token
	 * @param employeeId
	 * @return Points
	 * @throws InvalidUserException
	 */
	public Integer getPoints(String token, int id);

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
	public Points refreshPoints(String token, int id);

}
