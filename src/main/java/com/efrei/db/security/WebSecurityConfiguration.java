package com.efrei.db.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.GET,"/api/v1/*").permitAll()
                .antMatchers(HttpMethod.POST,"/api/v1/*").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/v1/*").permitAll()
                .anyRequest().authenticated();
    }
}
