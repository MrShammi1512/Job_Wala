package com.NaukriChowk.Job_Wala.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponse {

    private String message;

    private String accessToken;

    private String refreshToken;

    private Long expiryDuration;
}
