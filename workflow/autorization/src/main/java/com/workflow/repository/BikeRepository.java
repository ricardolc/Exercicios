package com.workflow.repository;
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.workflow.domain.Bike;


public interface BikeRepository extends CrudRepository<Bike, Serializable> {

}
