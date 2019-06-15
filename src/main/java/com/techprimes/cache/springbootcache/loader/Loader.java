package com.techprimes.cache.springbootcache.loader;

import com.techprimes.cache.springbootcache.model.User;
import com.techprimes.cache.springbootcache.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loader {

    @Autowired
    UserRepository userRepository;

    private List<User> userList;

    @PostConstruct
    public void load() {
        userList = getList();
        userRepository.save(userList);
    }

    private List<User> getList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("cengiz", "han", 1500l));
        userList.add(new User("ismail", "kendir", 2000l));
        userList.add(new User("metin", "yakar", 1400l));
        return userList;
    }
}
