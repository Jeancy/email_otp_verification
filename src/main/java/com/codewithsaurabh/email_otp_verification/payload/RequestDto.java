package com.codewithsaurabh.email_otp_verification.payload;

import lombok.Data;
import org.springframework.stereotype.Component;

//With @Data annotation, Lombok will generate the following methods for the RequestDto class:
//Getter and setter methods for username and email fields.
//equals, hashCode, and toString methods.
//This reduces the amount of boilerplate code that you need to write, making your code cleaner and more concise.

@Component
@Data
public class RequestDto {
	private String username;
	private String email;

}
