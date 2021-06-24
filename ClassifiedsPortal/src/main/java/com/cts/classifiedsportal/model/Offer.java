package com.cts.classifiedsportal.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offer {

	private int offerId;
	private String offerName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate openedDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate closedDate;
	private int empId;
	private int likes;
	private int  offerCategoryId;
	private OfferCategory offerCategory;
}
