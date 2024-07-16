package com.alura.forohub.infra.security;

import com.alura.forohub.domain.autor.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private AutorRepository autorRepository;
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return autorRepository.findByCorreo(username);
    }

}
