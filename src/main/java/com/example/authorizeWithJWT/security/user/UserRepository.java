package com.example.authorizeWithJWT.security.user;

import com.example.authorizeWithJWT.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findUserByRoleGroupsRole(String role);
}
