package com.techprimes.cache.springbootcache.controller;

import com.techprimes.cache.springbootcache.cache.UserCache;
import com.techprimes.cache.springbootcache.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/user/"})
public class UserController {

    @Autowired
    UserCache userCache;

    @GetMapping(value = {"/{name}"})
    public User getUsers(@PathVariable("name") String name) {
        return userCache.getUser(name);
    }
}
