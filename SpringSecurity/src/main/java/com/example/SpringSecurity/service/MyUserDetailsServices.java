package com.example.SpringSecurity.service;

import com.example.SpringSecurity.dao.UserRepo;
import com.example.SpringSecurity.model.User;
import com.example.SpringSecurity.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServices implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user =userRepo.findByUsername(username);
        if(user==null)
        {
            System.out.println("user not found");
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrincipal(user);
    }


}
