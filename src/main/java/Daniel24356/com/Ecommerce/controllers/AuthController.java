package Daniel24356.com.Ecommerce.controllers;

import Daniel24356.com.Ecommerce.dtos.requests.ForgetPasswordRequest;
import Daniel24356.com.Ecommerce.dtos.requests.ResetPasswordRequest;
import Daniel24356.com.Ecommerce.dtos.response.ForgotPasswordResponse;
import Daniel24356.com.Ecommerce.dtos.response.ResetPasswordResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Daniel24356.com.Ecommerce.dtos.requests.LoginRequest;
import Daniel24356.com.Ecommerce.dtos.requests.RegisterRequest;
import Daniel24356.com.Ecommerce.dtos.response.LoginResponse;
import Daniel24356.com.Ecommerce.dtos.response.RegisterResponse;
import Daniel24356.com.Ecommerce.services.AuthService;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest request) {
        RegisterResponse response = authService.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(
            @Valid @RequestBody LoginRequest request) {
        LoginResponse response = authService.login(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<ForgotPasswordResponse> forgotPassword(
            @Valid @RequestBody ForgetPasswordRequest request) {
        return ResponseEntity.ok(authService.forgotPassword(request));
    }

    @PostMapping("/reset-password")
    public ResponseEntity<ResetPasswordResponse> resetPassword(
            @Valid @RequestBody ResetPasswordRequest request) {
        return ResponseEntity.ok(authService.resetPassword(request));
    }
}
