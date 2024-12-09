package com.javapractice.voting.repository;

import com.javapractice.voting.model.Dish;
import com.javapractice.voting.model.Restaurant;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

public interface DishRepository extends BaseRepository<Dish>  {

}
