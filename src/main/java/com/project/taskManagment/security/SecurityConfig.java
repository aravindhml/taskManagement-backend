package com.project.taskManagment.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .requestMatchers("/h2-console/**").permitAll()  // Allow access to the H2 console
            .anyRequest().permitAll()  // Allow all other requests without authentication
            .and().csrf().disable()  // Disable CSRF protection
            .headers().frameOptions().sameOrigin();  // Allow H2 console to be embedded in iframe

        return http.build();  // Build the SecurityFilterChain
    }
}
