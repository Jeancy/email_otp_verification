package com.codewithsaurabh.email_otp_verification.payload;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
    public class ResponseDto {
    private Long user_id;
    private String username;
    private String email;
    private boolean verified;
    private String message;
}
