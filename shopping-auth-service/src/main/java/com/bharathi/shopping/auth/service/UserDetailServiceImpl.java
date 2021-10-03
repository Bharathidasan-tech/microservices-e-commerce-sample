package com.bharathi.shopping.auth.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bharathi.shopping.auth.model.AuthUserDetail;
import com.bharathi.shopping.auth.model.User;
import com.bharathi.shopping.auth.repository.UserDetailRepository;


@Service("userDetailsService")
public class UserDetailServiceImpl implements UserDetailsService
{

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException
    {
        Optional<User> optionalUser =
            userDetailRepository.findByUsername(username);

        optionalUser.orElseThrow(
            () -> new UsernameNotFoundException("Username or password wrong"));

        UserDetails userDetails = new AuthUserDetail(optionalUser.get());
        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;
    }

}
