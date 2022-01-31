package com.example.ecommerce.repository;

import com.example.ecommerce.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by adam on 2022. 01. 13.
 */
@RepositoryRestResource
public interface StateRepo extends JpaRepository<State, Integer> {

    List<State> findByCountryCode(@Param("code") String code);
}
