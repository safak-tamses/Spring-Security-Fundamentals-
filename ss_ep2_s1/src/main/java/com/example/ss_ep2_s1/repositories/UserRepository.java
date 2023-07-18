package com.example.ss_ep2_s1.repositories;

import com.example.ss_ep2_s1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
//    @Query("""
//    SELECT username FROM User WHERE User.username = :username
//""")
    Optional<User> findUserByUsername(String username);
}
