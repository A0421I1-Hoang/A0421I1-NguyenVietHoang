package com.codegym.blog.service;

import com.codegym.blog.dto.ShowUserDetails;
import com.codegym.blog.model.User;
import com.codegym.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class ShowUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user==null){
            throw new UsernameNotFoundException("Could not find user with that email");
        }
        return new ShowUserDetails(user);
    }
}
