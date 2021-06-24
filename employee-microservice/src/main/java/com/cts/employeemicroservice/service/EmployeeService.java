package com.cts.employeemicroservice.service;

import java.util.List;

import com.cts.employeemicroservice.model.Employee;
import com.cts.employeemicroservice.model.EmployeeOffers;

public interface EmployeeService {

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list of that particular employee
	 * through the offer client and returns it.
	 * 
	 * @param token
	 * @param employeeId
	 * @return List<EmployeeOffers>
	 * @throws InvalidUserException
	 */
	public List<EmployeeOffers> viewEmpOffers(String token,int employeeId);
	
	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the top liked offers of that particular employee
	 * through the offer client and uses stream to filter top 3 offers and returns it.
	 * 
	 * @param token
	 * @param employeeId
	 * @return List<EmployeeOffers>
	 * @throws InvalidUserException
	 */
	public List<EmployeeOffers> viewTopOffers(String token,int employeeId);
	
	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the details of that particular employee from the database.
	 * If such employee is present,then it throws NoSuchElementException.
	 * If employee is present,then it returns the employee details
	 * 
	 * @param token
	 * @param id
	 * @return Employee
	 * @throws InvalidUserException
	 * @throws NoSuchElementException
	 */
	public Employee viewEmployee(String token,int id);
	
}
