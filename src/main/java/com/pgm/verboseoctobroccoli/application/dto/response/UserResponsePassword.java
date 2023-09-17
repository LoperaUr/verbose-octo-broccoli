package com.pgm.verboseoctobroccoli.application.dto.response;

import lombok.Data;

@Data
public class UserResponsePassword {

    private Long id;
    private String email;
    private String password;
    private String pswUnHashed;

}
