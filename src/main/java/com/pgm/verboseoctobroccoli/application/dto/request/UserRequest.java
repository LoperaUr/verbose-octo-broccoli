package com.pgm.verboseoctobroccoli.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    private String name;
    private String email;
    private String password;
    private Long role;

}
