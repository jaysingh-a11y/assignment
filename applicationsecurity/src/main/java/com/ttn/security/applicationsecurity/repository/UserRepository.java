package com.ttn.security.applicationsecurity.repository;

import com.ttn.security.applicationsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}