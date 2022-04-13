package com.example.authorizeWithJWT.security.role;

import com.example.authorizeWithJWT.security.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class RoleGroup {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String role;

    @ManyToMany(mappedBy = "roleGroups")
    private Set<User> users = new HashSet<>();

    public RoleGroup() {
    }

    public RoleGroup(String role) {
        this.role = role;
    }
}
