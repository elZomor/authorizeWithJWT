package com.example.authorizeWithJWT.security.user;

import com.example.authorizeWithJWT.security.role.RoleGroup;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class UserPrinciple implements UserDetails {
    final private User user;
    final private Set<RoleGroup> roleGroup;

    public UserPrinciple(User user, Set<RoleGroup> roleGroup) {
        this.user = user;
        this.roleGroup = roleGroup;
    }




    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        if (roleGroup == null) {
            return Collections.emptySet();
        }
        Set<SimpleGrantedAuthority> grantedAuthoritySet = new HashSet<>();
        roleGroup.forEach(
                role -> grantedAuthoritySet.add(new SimpleGrantedAuthority(role.getRole()))
        );
        return grantedAuthoritySet;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
