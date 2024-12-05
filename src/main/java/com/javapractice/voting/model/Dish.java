package com.javapractice.voting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dish {

    private int id;

    private String name;

    private LocalDate date;

    private Double price;

    private Restaurant restaurant;
}
