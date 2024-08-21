package com.perscholas.springSecurityLab.service;

import com.perscholas.springSecurityLab.comon.UserDTO;
import com.perscholas.springSecurityLab.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    public UserDetails loadUserByUsername(String userName);
    public void creat(UserDTO userDTO);
    public User findUserByEmail(String email);
    public User findUserByName(String name);
}
