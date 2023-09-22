package com.pgm.verboseoctobroccoli.infrastructure.config.sec;

import com.pgm.verboseoctobroccoli.application.dto.request.LoginRequest;
import com.pgm.verboseoctobroccoli.application.dto.response.AuthResponse;
import com.pgm.verboseoctobroccoli.domain.exception.UserNotFoundException;
import com.pgm.verboseoctobroccoli.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final IUserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        UserDetails user = userRepository.findByEmail(request.getEmail()).orElseThrow(UserNotFoundException::new);
        String token = jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();

    }
}
