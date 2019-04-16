//package com.text.testing.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.servlet.WebSecurityEnablerConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
////@EnableWebSecurity
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Bean
//    public PasswordEncoder getPasswordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    /* who are you and prove it...username and password */
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .userDetailsService(userDetailsService)
//                .passwordEncoder(getPasswordEncoder());
//
//        //not recomended but can use during development
//        auth.inMemoryAuthentication()
//                .passwordEncoder(getPasswordEncoder())
//                .withUser("dave@gmail.com")
//                .password(getPasswordEncoder().encode("asdfasdf"))
//                .roles("USER");
//    }
//
//    @Override
//    //what access are you allowed.
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http
//                .authorizeRequests()
//                .antMatchers("/").permitAll()
////                .and().authorizeRequests().antMatchers("/console/**").permitAll()
//                .anyRequest().hasRole("USER").and()
//                .formLogin()
//                    .loginPage("/login")
////                    .defaultSuccessUrl("/topics")
//                    .permitAll()
//                    .and()
//                .logout()
//                    .logoutUrl("/logout")
//                    .permitAll();
//
////        http.headers().frameOptions().disable();
//
//    }
//}
