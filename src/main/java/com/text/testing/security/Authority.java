//package com.text.testing.security;
//
//import com.text.testing.model.User;
//import org.springframework.security.core.GrantedAuthority;
//
//import javax.persistence.*;
//
//@Entity
//public class Authority implements GrantedAuthority {
//
//
//    private static final long serialVersionUID = -3264669739157046446L;
//    private Long id;
//    private String authority;
//    private User user;
//
//    @Override
//    public String getAuthority() {
//        return this.authority;
//    }
//
//    public void setAuthority(String authority) {
//        this.authority = authority;
//    }
//
//    public static long getSerialVersionUID() {
//        return serialVersionUID;
//    }
//
//    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @ManyToOne()
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
