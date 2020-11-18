package com.kapitalbank.security.service;

import com.kapitalbank.entity.UserSystem;
import com.kapitalbank.repository.UserSystemRepository;
import com.kapitalbank.security.entity.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserSystemRepository userSystemRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        final UserSystem usuario = userSystemRepository.findByEmail(email);
        if(usuario == null) {
            throw new UsernameNotFoundException("User not found!");
        }
        return new UserDetailsImpl(usuario);
    }
}