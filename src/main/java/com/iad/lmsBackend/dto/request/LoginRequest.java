package com.iad.lmsBackend.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class LoginRequest {
    private String username;

    private String password;
}
