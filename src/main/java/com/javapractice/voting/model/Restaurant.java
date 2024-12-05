package com.javapractice.voting.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
public class Restaurant extends AbstractPersistable<Integer> {

    @Column(name = "name")
    private String name;

    @Column(name = "dishes")
    @OneToMany(mappedBy = "restaurant")
    private List<Dish> dishes;

    @Column(name = "votes")
    @OneToMany(mappedBy = "restaurant")
    private List<Vote> votes;

}
