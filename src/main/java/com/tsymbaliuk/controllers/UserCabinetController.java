package com.tsymbaliuk.controllers;

import com.tsymbaliuk.security.JwtUser;
import com.tsymbaliuk.security.JwtUserFactory;
import com.tsymbaliuk.security.model.security.User;
import com.tsymbaliuk.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;
import java.util.Date;

/**
 * Created by SerhiiTsymbaliuk on 12/7/17.
 */

@RestController
@CrossOrigin()
public class UserCabinetController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/cabinet",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
    public JwtUser getUser(Principal principal){
        String name = principal.getName();
        JwtUser jwtUser = JwtUserFactory.create(userRepository.findByUsername(name));
        return jwtUser;
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public void createUser(@RequestBody User user){
        System.out.println(user);
        user.setPassword("user");
        userRepository.save(user);

    }
}
