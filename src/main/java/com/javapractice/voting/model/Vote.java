package com.javapractice.voting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vote {

    private int id;

    private User user;

    private Restaurant restaurant;
}
