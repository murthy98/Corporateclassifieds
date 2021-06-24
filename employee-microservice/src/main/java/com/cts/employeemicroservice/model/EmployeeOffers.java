package com.cts.employeemicroservice.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeOffers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int offerId;
	private String offerName;
	private LocalDate openedDate;
	private LocalDate closedDate;
	private int empId;
	private int likes;
	private OfferCategory offerCategory;
}
