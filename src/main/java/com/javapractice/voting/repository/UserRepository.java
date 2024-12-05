package com.javapractice.voting.repository;

import com.javapractice.voting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
