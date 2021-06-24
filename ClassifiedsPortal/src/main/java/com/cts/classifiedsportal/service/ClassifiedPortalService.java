package com.cts.classifiedsportal.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.classifiedsportal.model.Offer;
import com.cts.classifiedsportal.model.UserModel;

public interface ClassifiedPortalService {
	
	/**
	 * Call portal service and returns login page
	 * 
	 * @return login page
	 */
	public ModelAndView getLogin();

	/**
	 * If user credentials are correct it returns home page Or else it return to the
	 * login page
	 * 
	 * @param user    User object for user details
	 * @param request HttpServletRequest object
	 * @return home page
	 */
	public ModelAndView postLogin(@ModelAttribute UserModel user, HttpServletRequest request);

	/**
	 * If user credentials are correct it shows all the offers posted by all the
	 * employees
	 * 
	 * @param request HttpServletRequest object
	 * @return view all offers page
	 */
	public ModelAndView viewAllOffers(HttpServletRequest request);

	/**
	 * If user credentials are correct it returns home page or else it returns login
	 * page If the user clicks the like button it gets updated and return to the
	 * home page with updated likes
	 * 
	 * @param offerId
	 * @param empId
	 * @param request HttpServletRequest object
	 * @return view all offers page
	 */
	public ModelAndView addLike(HttpServletRequest request, @RequestParam("offerId") int offerId,
			@RequestParam("empId") int empId);

	/**
	 * If user credentials are correct it returns home page or else it returns login
	 * page It gets the details of the offers It stores the details in the offer
	 * database
	 * 
	 * @param request HttpServletRequest object
	 * @return add offer page
	 */
	public ModelAndView viewOffer(HttpServletRequest request);

	/**
	 * If user credentials are correct it returns home page or else it returns login
	 * page It displays the add offer page and it gets the details of the offers On
	 * submit it returns view all offers page
	 * 
	 * @param request HttpServletRequest object
	 * @return add offer page
	 */
	public ModelAndView saveOffer(HttpServletRequest request, @ModelAttribute Offer offer);

	/**
	 * If user credentials are correct it returns employee profile page or else it
	 * returns login page It shows the details of employee
	 * 
	 * @param request HttpServletRequest object
	 * @return my profile page
	 */
	public ModelAndView viewProfile(HttpServletRequest request);

	/**
	 * If user credentials are correct it returns employee offers page It shows the
	 * offers of the employee Or else it returns login page
	 * 
	 * @param request HttpServletRequest object
	 * @return myoffer page
	 */
	public ModelAndView myOffer(HttpServletRequest request);

	/**
	 * If user credentials are correct it returns employee Id page It gets the
	 * employee id and on submit it returns the offer page of the employee If the
	 * employee didn't post anything it displays the message Or else it returns
	 * login page
	 * 
	 * @param request HttpServletRequest object
	 * @param id      Employee Id
	 * @return viewofferbyid page
	 */
	public ModelAndView viewOfferById(HttpServletRequest request, @RequestParam("empId") int id);

	/**
	 * If user credentials are correct it returns employee offers Or else it returns
	 * login page
	 * 
	 * @param request HttpServletRequest object
	 * @return viewoffer page
	 */
	public ModelAndView viewOfferByEmpId(HttpServletRequest request);

	/**
	 * If user credentials are correct it returns employee offers based on top likes
	 * Or else it returns login page
	 * 
	 * @param request HttpServletRequest object
	 * @return viewtopofferbylikes page
	 */
	public ModelAndView viewTopOfferByLikes(HttpServletRequest request);

	/**
	 * If user credentials are correct it returns employee offers based on the
	 * posted date Or else it returns login page
	 * 
	 * @param request HttpServletRequest object
	 * @return viewofferbyposteddate page
	 */
	public ModelAndView viewOfferByPostedDate(HttpServletRequest request);

	/**
	 * If user credentials are correct it returns viewofferbyposteddate page It gets
	 * the offer posted date and on submit it returns the offer page of the employee
	 * based on the posted date If the employee didn't post anything on that
	 * particular date it displays the message Or else it returns login page
	 * 
	 * @param request HttpServletRequest object
	 * @param date    offer posted date
	 * @return viewofferbyposteddate page
	 */
	public ModelAndView viewOfferByDate(HttpServletRequest request, @RequestParam("offByPostedDate") String date);

	/**
	 * If user credentials are correct it returns employee offers based on the
	 * category Or else it returns login page
	 * 
	 * @param request HttpServletRequest object
	 * @return viewofferbycatid page
	 */
	public ModelAndView viewOfferByCatId(HttpServletRequest request);

	/**
	 * If user credentials are correct it returns viewofferbycat page It gets
	 * the offer category id and on submit it returns the offer page of the employee
	 * based on the category id If the employee didn't post anything on that
	 * category it displays the message Or else it returns login page
	 * @param request HttpServletRequest object
	 * @param catId category id
	 * @return viewofferbycat
	 */
	public ModelAndView viewOfferByCat(HttpServletRequest request, @RequestParam("offCategoryId") int catId);

	/**
	 * Once user clicks logout it returns login page and session attributes are set to null
	 * @param session HttpSession object
	 * @return login page
	 */
	public ModelAndView logout(HttpSession session);

}
