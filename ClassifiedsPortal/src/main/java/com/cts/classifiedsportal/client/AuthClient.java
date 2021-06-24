package com.cts.classifiedsportal.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.classifiedsportal.model.AuthResponse;
import com.cts.classifiedsportal.model.UserModel;
import com.cts.classifiedsportal.model.UserToken;

@FeignClient(url = "${auth.feign.client}", name = "${auth.feign.name}")
public interface AuthClient {

	@PostMapping("/login")
	public ResponseEntity<UserToken> login(@RequestBody UserModel userModel);
	
	@RequestMapping(path="/validate",method=RequestMethod.GET)
	public ResponseEntity<AuthResponse> getValidity(@RequestHeader(name="Authorization",required=true)String token);
	
	@GetMapping("/getempid")
	public int getEmpId(String username);
}
