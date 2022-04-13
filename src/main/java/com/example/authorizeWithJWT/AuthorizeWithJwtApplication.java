package com.example.authorizeWithJWT;

import com.example.authorizeWithJWT.security.role.RoleGroup;
import com.example.authorizeWithJWT.security.role.RoleGroupRepository;
import com.example.authorizeWithJWT.security.user.User;
import com.example.authorizeWithJWT.security.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AuthorizeWithJwtApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleGroupRepository roleGroupRepository;

	final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	public static void main(String[] args) {
		SpringApplication.run(AuthorizeWithJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userRepository.save(new User("Mohamed", encoder.encode("password")));
//		roleGroupRepository.save(new RoleGroup("admin"));
	}
}
