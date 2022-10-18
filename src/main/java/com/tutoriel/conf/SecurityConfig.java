package com.tutoriel.conf;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
 
 @Override
	protected void configure(HttpSecurity http) throws Exception {
	 http.csrf().disable();
	 http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	 http.authorizeRequests().antMatchers("/categories/**").hasRole("ADMIN");
	 http.authorizeRequests().antMatchers("/products/**").hasRole("USER");
	 http.authorizeRequests().anyRequest().authenticated();
	 http.addFilterBefore(new JWTAuthorizationFiltre(), UsernamePasswordAuthenticationFilter.class);
	}
}
