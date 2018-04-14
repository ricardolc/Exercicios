package com.workflow.main;



import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public interface CrudRepository<T> extends Repository<T, Long> {
 
    void delete(T deleted);
 
    List<T> findAll();
 
    Optional<T> findOne(Long id);
 
    T save(T entity);
}