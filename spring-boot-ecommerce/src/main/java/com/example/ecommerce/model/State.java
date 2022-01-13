package com.example.ecommerce.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by adam on 2022. 01. 13.
 */
@Entity
@Table(name = "state")
@Getter
@Setter
@RequiredArgsConstructor
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
