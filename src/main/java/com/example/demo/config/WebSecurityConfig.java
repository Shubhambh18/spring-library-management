package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
//		auth.inMemoryAuthentication().withUser("india").password("{noop}india").roles("USER");
//		auth.inMemoryAuthentication().withUser("library").password("library").roles("ADMIN");
		
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN").and().
		withUser("user").password("{noop}user").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		
//		http.authorizeRequests().antMatchers("/*").authenticated().and().httpBasic();
//		http.csrf().disable();
		
		http.httpBasic().and().authorizeRequests().antMatchers("/addBooks","/getAllBooks","/deleteBook","/showBook","/addSubs").hasRole("ADMIN")
		.antMatchers("/getAllSubs").hasRole("USER").and()
		.csrf().disable();
	}

}
