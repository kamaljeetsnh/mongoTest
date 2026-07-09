/*
 * package com.example.mongoTest.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.stereotype.Service;
 * 
 * import com.example.mongoTest.Utilility.JwtUtil; import
 * com.example.mongoTest.entity.LoginRequest; import
 * com.example.mongoTest.entity.LoginResponse; import
 * com.example.mongoTest.entity.User; import
 * com.example.mongoTest.repository.UserRepository;
 * 
 * @Service public class AuthService {
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
 * 
 * public LoginResponse login(LoginRequest request) {
 * 
 * User user = userRepository .findByEmail(request.getEmail()) .orElseThrow(()
 * -> new RuntimeException( "User not found")); boolean passwordMatch =
 * encoder.matches( request.getPassword(), user.getPassword() );
 * 
 * if (!passwordMatch) { throw new RuntimeException( "Invalid password"); }
 * 
 * String token = JwtUtil.generateToken( user.getEmail());
 * 
 * return new LoginResponse( token, "Login Successful" ); } }
 */