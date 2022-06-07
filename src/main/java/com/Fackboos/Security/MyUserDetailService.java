package com.Fackboos.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.Fackboos.config.ResourceBean;

@Component
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	ResourceBean resBean;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println(resBean.getName());
		return new User(username,new BCryptPasswordEncoder().encode("123"),AuthorityUtils.commaSeparatedStringToAuthorityList("Admin"));
	}

}
