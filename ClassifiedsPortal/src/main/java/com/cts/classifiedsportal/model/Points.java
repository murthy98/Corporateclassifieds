package com.cts.classifiedsportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Points {

	private int pointsId;
	private int empId;
	private int points;
	private int offerId;
}
