package com.javapractice.voting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    private int id;

    private String name;

    private List<Dish> dishes;

    private Set<Vote> votes;

}
