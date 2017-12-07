package com.tsymbaliuk.controllers;

import com.tsymbaliuk.security.JwtTokenUtil;
import com.tsymbaliuk.security.JwtUser;
import com.tsymbaliuk.security.JwtUserFactory;
import com.tsymbaliuk.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;
/**
 * Created by SerhiiTsymbaliuk on 12/7/17.
 */

@RestController
@CrossOrigin()
@RequestMapping(value = "/cabinet")
public class UserCabinetController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public JwtUser getUser(@RequestBody String token){
        String usernameFromToken = jwtTokenUtil.getUsernameFromToken(token);
        System.out.println(token);
        System.out.println(usernameFromToken);
        UserDetails userDetails = userDetailsService.loadUserByUsername(usernameFromToken);
        JwtUser jwtUser = JwtUserFactory.create(userRepository.findByUsername(usernameFromToken));
        return jwtUser;
    }
}
