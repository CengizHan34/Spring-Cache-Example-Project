package com.techprimes.cache.springbootcache.cache;

import com.techprimes.cache.springbootcache.model.User;
import com.techprimes.cache.springbootcache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UserCache {

    @Autowired
    UserRepository userRepository;

    @Cacheable(value = "userCache", key = "#name")
    public User getUser(String name) {
        System.out.println("Retrieving from database for name " + name);
        return userRepository.findByName(name);
    }
}
