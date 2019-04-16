//package com.text.testing.service;
//
//import com.text.testing.model.User;
//import com.text.testing.repository.UserRepository;
//import com.text.testing.security.CustomSecurityUser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public class UserDetailServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//
//        if(user == null)
//            throw new UsernameNotFoundException("Invalid Username and password");
//
//        //user created from
//        return new CustomSecurityUser(user);
//    }
//}
