package com.cts.offermicroservice.controller;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.offermicroservice.client.AuthClient;
import com.cts.offermicroservice.model.Offer;
import com.cts.offermicroservice.model.OfferCategory;
import com.cts.offermicroservice.service.OfferService;

@RestController
public class OfferController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OfferController.class);

	@Autowired
	OfferService offerService;

	@Autowired
	AuthClient authClient;

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid, employee can save the offer in the database 
	 * @param token
	 * @param offer
	 * @return offer
	 * @throws InvalidUserException**/
	@PostMapping("/saveoffer")
	public ResponseEntity<?> addOffer(@RequestHeader(name = "Authorization") String token,
			@Valid @RequestBody Offer offer) {
		LOGGER.info("Inside add offer");
		return new ResponseEntity<>(offerService.addOffer(token, offer), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list of the employee by using offer id
	 * It will update the like of the employee in the offer list by 1
	 * @param token
	 * @param offerid
	 * @param empid
	 * @return offer
	 * @throws InvalidUserException**/
	@PostMapping("/updateoffer/{offerid}/{empid}")
	public ResponseEntity<?> updateOffer(@RequestHeader(name = "Authorization") String token,
			@PathVariable("offerid") int offerid, @PathVariable("empid") int empid) {
		LOGGER.info("Inside update offer");
		return new ResponseEntity<>(offerService.updateOffer(token, offerid, empid), HttpStatus.OK);

	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list  by using offer id
	 * @param token
	 * @param offerid
	 * @return offer
	 * @throws InvalidUserException**/
	@GetMapping("/getoffer/{offerid}")
	public ResponseEntity<?> getOfferDetails(@RequestHeader(name = "Authorization") String token,
			@PathVariable("offerid") int offerid) {
		LOGGER.info("Inside offer details");
		return new ResponseEntity<>(offerService.viewOffer(token, offerid), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list  by using the offer posted date
	 * If the date is not in the given format it will throw parse exception
	 *If not it will returns all the offers based on the posted date
	 * @param token
	 * @param date
	 * @return offer
	 * @throws 
	 * @throws InvalidUserException**/
	@GetMapping("/getofferbydate/{date}")
	public ResponseEntity<List<Offer>> getOfferByPostedDate(@RequestHeader(name = "Authorization") String token,
			@PathVariable("date") String date) throws ParseException {
		LOGGER.info("Inside get offer by date");
		return new ResponseEntity<>(offerService.getOfferByPostedDate(token, date), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list  by using the offer Category Id
	 * If the category is not found it throws category not found exception
	 * If not it will returns all the offers based on the Category
	 * @param token
	 * @param categoryid
	 * @return offer
	 * @throws InvalidUserException
	 * @throws CategoryNotFoundException**/
	@GetMapping("/getofferbycategory/{catid}")
	public ResponseEntity<List<Offer>> getOfferByCategory(@RequestHeader(name = "Authorization") String token,
			@PathVariable("catid") int catid) {
		LOGGER.info("Inside get offer by category");
		return new ResponseEntity<>(offerService.getOfferByCategory(token, catid), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list in descending order by using jpql query based on the likes 
	 * It will returns the top three offers by using filters in the stream
	 * @param token
	 * @return offer
	 * @throws InvalidUserException**/
	@GetMapping("/getofferbylikes")
	public ResponseEntity<List<Offer>> getOfferByTopLikes(@RequestHeader(name = "Authorization") String token) {
		LOGGER.info("Inside get offer by top likes");
		return new ResponseEntity<>(offerService.getOfferByTopLikes(token), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list by using employee id
	 * It will return all the offers in the employee id 
	 * @param  token
	 * @param  empid
	 * @return offer
	 * @throws InvalidUserException**/
	@GetMapping("/getofferbyemp/{empid}")
	public ResponseEntity<List<Offer>> getOfferByEmpId(@RequestHeader(name = "Authorization") String token,
			@PathVariable("empid") int empid) {
		LOGGER.info("Inside get offer by employee id");
		return new ResponseEntity<>(offerService.getOfferByEmpId(token, empid), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets the offer list 
	 * It will return all the offers posted by all the employees
	 * @param  token
	 * @return offer
	 * @throws InvalidUserException**/
	@GetMapping("/getalloffers")
	public ResponseEntity<List<Offer>> getAllOffers(@RequestHeader(name = "Authorization") String token) {
		LOGGER.info("Inside get all offers");
		return new ResponseEntity<>(offerService.viewAllOffers(token), HttpStatus.OK);
	}

	/**Checks the validity of the token.If not valid,it throws InvalidUserException.
	 * If the token is valid,it gets category  by using Category Id
	 * If the category is not found it throws category not found exception
	 * If not it will returns the  category
	 * @param token
	 * @param categoryid
	 * @return category
	 * @throws InvalidUserException
	 * @throws CategoryNotFoundException**/
	@GetMapping("/getcategory/{catid}")
	public ResponseEntity<OfferCategory> getCategory(@RequestHeader(name = "Authorization") String token,
			@PathVariable("catid") int catId) {
		LOGGER.info("Inside get category");
		return new ResponseEntity<>(offerService.getCategory(token, catId), HttpStatus.OK);
	}

}
