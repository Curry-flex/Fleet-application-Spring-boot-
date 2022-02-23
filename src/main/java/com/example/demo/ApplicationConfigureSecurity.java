package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.mysql.cj.protocol.AuthenticationProvider;

@EnableWebSecurity
@Configuration
public class ApplicationConfigureSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
	    .csrf().disable()
	    .authorizeRequests()
	     .antMatchers("/login","/resources/**","/css/**","/fonts/**","/img/**").permitAll()
	    .antMatchers("/register","/resources/**","/css/**","/fonts/**","/img/**","/js/**").permitAll()
	    .antMatchers("/register/addNew").permitAll()
	   .antMatchers("/vehicle-data/**").hasAnyAuthority("ADMIN","MECHANIC")
	   .antMatchers("/maintanance/**").hasAnyAuthority("ADMIN","MECHANIC")
	   .antMatchers("/movement/**").hasAnyAuthority("Provider","ADMIN")
	   .antMatchers("/hires/**").hasAnyAuthority("ADMIN","Provider")
	   .antMatchers("/vehicle-make/**").hasAnyAuthority("ADMIN","MECHANIC")
	   .antMatchers("/vehicle-type/**").hasAnyAuthority("ADMIN","MECHANIC")
	   .antMatchers("/vehicle-model/**").hasAnyAuthority("ADMIN","MECHANIC")
	   .antMatchers("/employee/**").hasAuthority("ADMIN")
	   .antMatchers("/client/**").hasAnyAuthority("ADMIN","Provider")
	   .antMatchers("/supplier/**").hasAnyAuthority("ADMIN","Provider")
	   .antMatchers("/contacts/**").hasAuthority("ADMIN")
	    .antMatchers("/user/**").hasAuthority("ADMIN")
	    .antMatchers("/role/**").hasAuthority("ADMIN")
	    .antMatchers("/invoices/**").hasAnyAuthority("ADMIN","ACCOUNTANT")
	    .antMatchers("/invoices-status/**").hasAnyAuthority("ADMIN","ACCOUNTANT")
	    .antMatchers("/country/**").hasAuthority("ADMIN")
	    .antMatchers("/state/**").hasAuthority("ADMIN")
	    .antMatchers("/location/**").hasAuthority("ADMIN")
	    .anyRequest().authenticated()
	    .and()
	    .formLogin()
	    .loginPage("/login").permitAll()
	    .defaultSuccessUrl("/index")
	    .and()
	    .exceptionHandling().accessDeniedPage("/accessDenied")
	    .and()
	    .logout().invalidateHttpSession(true)
	    .clearAuthentication(true)
	    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	    .logoutSuccessUrl("/login").permitAll();
	}
	
	
//	@Lazy
//	@Bean
//	
//	public PasswordEncoder passowrdEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Autowired
	private UserDetailsService detailsService;
	
	
	@Bean
	DaoAuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(detailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		
		return  provider;
	}

}
