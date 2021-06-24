package com.cts.classifiedsportal.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import feign.FeignException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ClassifiedPortalExceptionHandler {
	
	/**Checks if all the feign servers required for the particular microService is running or not.
	 *If any one of the services down it will direct to error page
	 *If user credentials mismatch it will redirect to login page
	 * @param FeignException
	 * @return login page
	 * @return error page
	 */
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(FeignException.class)
	public ModelAndView handleFeignException(FeignException fe) {
		if (fe.getMessage().contains("Unauthorized")) {
			log.error("Bad request:Invalid Credentials");
			ModelAndView modelAndView = new ModelAndView("login");
			return modelAndView;
		}
		log.error("Bad request:Service unavailable");
		ModelAndView modelAndView = new ModelAndView("errorpage");
		return modelAndView;

	}

	/**Checks the value of the object.If it is null,it throws NullPointerException.
	 * It redirects to login page
	 * @param NullPointerException
	 * @return login page
	 */
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView handleNullPointerException(NullPointerException npe) {
		log.error("Bad request:Session Expired");
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;

	}

}
