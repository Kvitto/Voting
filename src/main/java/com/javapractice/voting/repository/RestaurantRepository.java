package com.javapractice.voting.repository;

import com.javapractice.voting.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {



}
