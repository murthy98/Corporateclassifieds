package com.cts.pointsmicroservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "points")
public class Points {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pointsId;
	private int empId;
	private int points;
	private int offerId;
}
