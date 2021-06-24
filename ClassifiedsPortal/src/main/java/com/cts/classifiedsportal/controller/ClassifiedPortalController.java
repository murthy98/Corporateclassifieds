package com.cts.classifiedsportal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.classifiedsportal.model.Offer;
import com.cts.classifiedsportal.model.UserModel;
import com.cts.classifiedsportal.service.ClassifiedPortalService;

@Controller
public class ClassifiedPortalController {

	@Autowired
	ClassifiedPortalService classifiedPortalService;

	/**
	 * Call portal service and returns login page
	 * 
	 * @return login page
	 */
	@RequestMapping(path = "/userlogin", method = RequestMethod.GET)
	public ModelAndView getLogin() {
		return classifiedPortalService.getLogin();

	}

	/**
	 * If user credentials are correct it returns home page Or else it return to the
	 * login page
	 * 
	 * @param user    User object for user details
	 * @param request HttpServletRequest object
	 * @return home page
	 */
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView postLogin(@ModelAttribute UserModel user, HttpServletRequest request) {
		return classifiedPortalService.postLogin(user, request);
	}

	/**
	 * If user credentials are correct it shows all the offers posted by all the
	 * employees
	 * 
	 * @param request HttpServletRequest object
	 * @return view all offers page
	 */
	@RequestMapping(path = "/viewalloffers", method = RequestMethod.GET)
	public ModelAndView viewAllOffers(HttpServletRequest request) {
		return classifiedPortalService.viewAllOffers(request);
	}

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
	@RequestMapping(path = "/addlike", method = RequestMethod.GET)
	public ModelAndView addLike(@RequestParam("offerId") int offerId, @RequestParam("empId") int empId,
			HttpServletRequest request) {
		return classifiedPortalService.addLike(request, offerId, empId);
	}

	/**
	 * If user credentials are correct it returns home page or else it returns login
	 * page It displays the add offer page and it gets the details of the offers On
	 * submit it returns view all offers page
	 * 
	 * @param request HttpServletRequest object
	 * @return add offer page
	 */
	@RequestMapping(path = "/addOffer", method = RequestMethod.GET)
	public ModelAndView saveOffer(HttpServletRequest request) {
		return classifiedPortalService.viewOffer(request);

	}

	/**
	 * If user credentials are correct it returns home page or else it returns login
	 * page It gets the details of the offers It stores the details in the offer
	 * database
	 * 
	 * @param request HttpServletRequest object
	 * @return add offer page
	 */
	@RequestMapping(path = "/addOffer", method = RequestMethod.POST)
	public ModelAndView addOffer(HttpServletRequest request, @ModelAttribute Offer offer) {
		return classifiedPortalService.saveOffer(request, offer);

	}

	/**
	 * If user credentials are correct it returns employee profile page or else it
	 * returns login page It shows the details of employee
	 * 
	 * @param request HttpServletRequest object
	 * @return my profile page
	 */
	@RequestMapping(path = "/viewprofile", method = RequestMethod.GET)
	public ModelAndView viewProfile(HttpServletRequest request) {
		return classifiedPortalService.viewProfile(request);

	}

	/**
	 * If user credentials are correct it returns employee offers page It shows the
	 * offers of the employee Or else it returns login page
	 * 
	 * @param request HttpServletRequest object
	 * @return myoffer page
	 */
	@RequestMapping(path = "/myoffer", method = RequestMethod.GET)
	public ModelAndView myOffer(HttpServletRequest request) {
		return classifiedPortalService.myOffer(request);

	}

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
	@RequestMapping(path = "/viewofferbyid", method = RequestMethod.GET)
	public ModelAndView viewOfferById(HttpServletRequest request, @RequestParam("empId") int id) {
		return classifiedPortalService.viewOfferById(request, id);

	}

	/**
	 * If user credentials are correct it returns employee offers Or else it returns
	 * login page
	 * 
	 * @param request HttpServletRequest object
	 * @return viewoffer page
	 */
	@RequestMapping(path = "/viewoffer", method = RequestMethod.GET)
	public ModelAndView viewOfferByEmpId(HttpServletRequest request) {
		return classifiedPortalService.viewOfferByEmpId(request);

	}

	/**
	 * If user credentials are correct it returns employee offers based on top likes
	 * Or else it returns login page
	 * 
	 * @param request HttpServletRequest object
	 * @return viewtopofferbylikes page
	 */
	@RequestMapping(path = "/viewtopofferbylikes", method = RequestMethod.GET)
	public ModelAndView viewTopOfferByLikes(HttpServletRequest request) {
		return classifiedPortalService.viewTopOfferByLikes(request);

	}

	/**
	 * If user credentials are correct it returns employee offers based on the
	 * posted date Or else it returns login page
	 * 
	 * @param request HttpServletRequest object
	 * @return viewofferbyposteddate page
	 */
	@RequestMapping(path = "/viewofferbyposteddate", method = RequestMethod.GET)
	public ModelAndView viewOfferByPostedDate(HttpServletRequest request) {
		return classifiedPortalService.viewOfferByPostedDate(request);

	}

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
	@RequestMapping(path = "/viewofferbydate", method = RequestMethod.GET)
	public ModelAndView viewOfferByDate(HttpServletRequest request, @RequestParam("offByPostedDate") String date) {
		return classifiedPortalService.viewOfferByDate(request, date);
	}

	/**
	 * If user credentials are correct it returns employee offers based on the
	 * category Or else it returns login page
	 * 
	 * @param request HttpServletRequest object
	 * @return viewofferbycatid page
	 */
	@RequestMapping(path = "/viewofferbycatid", method = RequestMethod.GET)
	public ModelAndView viewOfferByCatId(HttpServletRequest request) {
		return classifiedPortalService.viewOfferByCatId(request);

	}

	/**
	 * If user credentials are correct it returns viewofferbycat page It gets
	 * the offer category id and on submit it returns the offer page of the employee
	 * based on the category id If the employee didn't post anything on that
	 * category it displays the message Or else it returns login page
	 * @param request HttpServletRequest object
	 * @param catId category id
	 * @return viewofferbycat
	 */
	@RequestMapping(path = "/viewofferbycat", method = RequestMethod.GET)
	public ModelAndView viewOfferByCat(HttpServletRequest request, @RequestParam("offCategoryId") int catId) {
		return classifiedPortalService.viewOfferByCat(request, catId);

	}

	/**
	 * Once user clicks logout it returns login page and session attributes are set to null
	 * @param session HttpSession object
	 * @return login page
	 */
	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession session) {
		return classifiedPortalService.logout(session);

	}
}
