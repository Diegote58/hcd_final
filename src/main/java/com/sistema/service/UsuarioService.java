package com.sistema.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sistema.entity.User;
import com.sistema.entity.UserRol;
import com.sistema.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {

	@Resource
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User us = usuarioRepository.findByUsername(username);
//		User us = userRepository.getByUsername(username);
		
		if (us == null)
			throw new UsernameNotFoundException("Not Exist User");
		else{
			Set<UserRol> roles = new HashSet<>();
			roles.add(us.getRol());			
			List<GrantedAuthority> authorities = buildAuthorities(roles);
			return buildUser(us, authorities);	
		}
	}

	private org.springframework.security.core.userdetails.User buildUser(User user,
			List<GrantedAuthority> authorities) {
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				user.isEnabled(), true, true, true, authorities);
	}

	private List<GrantedAuthority> buildAuthorities(Set<UserRol> roles) {
		Set<GrantedAuthority> auth = new HashSet<GrantedAuthority>();

		for (UserRol rol : roles) {
			auth.add(new SimpleGrantedAuthority(rol.getNombre()));
		}

		return new ArrayList<GrantedAuthority>(auth);
	}
}
