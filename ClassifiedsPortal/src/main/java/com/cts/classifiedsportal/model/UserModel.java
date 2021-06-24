package com.cts.classifiedsportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	
	private String empid;
	private String empUsername;
	private String empPassword;
}
