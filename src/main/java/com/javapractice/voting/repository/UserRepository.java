package com.javapractice.voting.repository;

import com.javapractice.voting.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends BaseRepository<User> {

    @RestResource(rel = "by-email", path = "by-email")
    @Query("SELECT u FROM User u WHERE u.email = LOWER(:email)")
    Optional<User> findByEmailIgnoreCase(String email);

    @RestResource(rel = "by-lastname", path = "by-lastname")
    List<User> findByLastNameContainingIgnoreCase(String lastName);

}
