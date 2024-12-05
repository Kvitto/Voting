package com.javapractice.voting.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
public class Dish extends AbstractPersistable<Integer> {

    @Column(name = "date", nullable = false)
    @NotEmpty
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @Column(name = "description")
    @Size(max = 256)
    private String description;

    @Column(name = "price")
    private Double price;
}
