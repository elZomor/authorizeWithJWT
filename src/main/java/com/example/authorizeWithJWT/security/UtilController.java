package com.example.authorizeWithJWT.security;

import com.example.authorizeWithJWT.security.role.RoleGroup;
import com.example.authorizeWithJWT.security.role.RoleGroupRepository;
import com.example.authorizeWithJWT.security.user.User;
import com.example.authorizeWithJWT.security.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UtilController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleGroupRepository roleGroupRepository;

    @GetMapping(value = "utils/start")
    public ResponseEntity<String> addStart() {
        String role = "admin";
        String username = "Mohamed";
        RoleGroup auth = roleGroupRepository.findByRole(role)
                .orElseGet(() -> roleGroupRepository.save(new RoleGroup(role)));
        User user = userRepository.findByUsername(username).get();
        user.addRole(auth);
        userRepository.save(user);
        System.out.println("Done");
        return new ResponseEntity<>("Done", HttpStatus.OK);

    }

    @GetMapping(value = "/test")
    public ResponseEntity<String> testApi() {
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }
}
