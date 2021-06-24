package com.cts.classifiedsportal.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.classifiedsportal.model.Offer;
import com.cts.classifiedsportal.model.OfferCategory;

@FeignClient(url = "${offer.feign.client}", name = "${offer.feign.name}")
public interface OfferClient {

	@GetMapping("/getofferbylikes")
	public ResponseEntity<List<Offer>> getOfferByTopLikes(@RequestHeader(name = "Authorization") String token);

	@GetMapping("/getoffer/{id}")
	public ResponseEntity<?> getOfferDetails(@RequestHeader(name = "Authorization") String token, @PathVariable("id") int id);

	@GetMapping("/getofferbyemp/{id}")
	public ResponseEntity<List<Offer>> getOfferByEmpId(@RequestHeader(name = "Authorization") String token, @PathVariable("id") int id);

	@GetMapping("/getalloffers")
	public ResponseEntity<List<Offer>> getAllOffers(@RequestHeader(name = "Authorization") String token);

	@PostMapping("/updateoffer/{offerid}/{employeeid}")
	public ResponseEntity<?> updateOffer(@RequestHeader(name = "Authorization") String token,
			@PathVariable("offerid") int id, @PathVariable("employeeid") int empid);

	@PostMapping("/saveoffer")
	public ResponseEntity<?> addOffer(@RequestHeader(name = "Authorization") String token, @RequestBody Offer offer);

	@GetMapping("/getofferbycategory/{id}")
	public ResponseEntity<List<Offer>> getOfferByCategory(@RequestHeader(name = "Authorization") String token,
			@PathVariable("id") int id);

	@GetMapping("/getcategory/{id}")
	public ResponseEntity<OfferCategory> getCategory(@RequestHeader(name = "Authorization") String token,
			@PathVariable("id") int catId);

	@GetMapping("/getofferbydate/{date}")
	public ResponseEntity<List<Offer>> getOfferByPostedDate(@RequestHeader(name = "Authorization") String token,
			@PathVariable("date") String date);

}
