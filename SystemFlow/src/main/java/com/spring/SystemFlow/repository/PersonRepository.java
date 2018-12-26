package com.spring.SystemFlow.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.SystemFlow.model.Person;

public interface PersonRepository<P> extends CrudRepository<Person, Long> {
    List<Person> findByLastName(String s);
}