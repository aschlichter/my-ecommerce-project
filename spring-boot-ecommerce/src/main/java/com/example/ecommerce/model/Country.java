package com.example.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by adam on 2022. 01. 13.
 */
@Entity
@Table(name = "country")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private String countryCode;

    @Column(name = "name")
    private String countryName;


    @OneToMany(mappedBy = "country")
    private List<State> states;
}
