package com.cts.authmicroservice.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cts.authmicroservice.model.MessageResponse;

import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler {

	/**Checks the entered user name and password.If the user name 
	 * or password does not match with the present in the database
	 * it throws UnauthorizedException with the message Unauthorized request
	 * through the response entity along with the timeStamp and httpStatus
	 * 
	 * @param UnauthorizedException
	 * @return ResponseEntity<MessageResponse>
	 */
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<?> handleUnauthorizedExceptions(UnauthorizedException ex) {

		log.error("Unauthorized request");
		return ResponseEntity.badRequest()
				.body(new MessageResponse("Unauthorized request. Login again...", "Unauthorized"));
	}

	/**Checks header of the request that the user enters.
	 * If authorization header is missing,then it throws
	 * it throws MissingRequestHeaderException with the message 
	 * required token for the request to take place
	 * through the response entity along with the timeStamp and httpStatus
	 * 
	 * @param MissingRequestHeaderException
	 * @return ResponseEntity<MessageResponse>
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MissingRequestHeaderException.class)
	public ResponseEntity<?> handleMissingRequestHeaderException(MissingRequestHeaderException ex) {

		log.error("Required Bearer token");
		return ResponseEntity.badRequest().body(new MessageResponse("Required Bearer token", "Bad Request"));
	}

	/**Checks header of the request that the user enters.
	 * If authorization header is present,then it takes the token
	 * and checks the validity of the token.If the token has 
	 * expired, then it throws the expiredJwtException with the message 
	 * the token has expired through the response entity along with
	 *  the timeStamp and httpStatus
	 * 
	 * @param ExpiredJwtExceptionException
	 * @return ResponseEntity<MessageResponse>
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ExpiredJwtException.class)
	public ResponseEntity<?> handleExpiredJwtException(ExpiredJwtException ex) {

		log.error("Token has expired");
		return ResponseEntity.badRequest().body(new MessageResponse("Token has expired", "Bad Request"));
	}

}
