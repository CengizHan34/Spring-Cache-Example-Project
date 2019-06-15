package com.techprimes.cache.springbootcache.repository;

import com.techprimes.cache.springbootcache.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
