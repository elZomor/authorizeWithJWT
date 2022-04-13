package com.example.authorizeWithJWT.security.role;

import com.example.authorizeWithJWT.security.role.RoleGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleGroupRepository extends JpaRepository<RoleGroup, Long> {
    Optional<RoleGroup> findByRole(String role);
}
