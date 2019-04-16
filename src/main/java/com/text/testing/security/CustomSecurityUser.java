//package com.text.testing.security;
//
//import com.text.testing.model.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;
//
//
//
//public class CustomSecurityUser extends User implements UserDetails {
//
//    private static final long serialVersionUID = 8325452513147587735L;
//
//    public CustomSecurityUser() {
//    }
//
//    public CustomSecurityUser(User user) {
//        this.setAuthorities(user.getAuthorities());
//        this.setId(user.getId());
//        this.setPassword(user.getPassword());
//        this.setUsername(user.getUsername());
//    }
//
//    @Override
//    public Set<Authority> getAuthorities() {
//        return this.getAuthorities();
//    }
//
//    @Override
//    public String getPassword() {
//        //from the user class
//        return this.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return this.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
