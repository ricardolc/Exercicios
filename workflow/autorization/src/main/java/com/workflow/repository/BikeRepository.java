package com.workflow.repository;
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.workflow.domain.Bike;


public interface BikeRepository extends CrudRepository<Bike, Serializable> {
	
	Bike findOne (int bikeId);
	void delete (int bikeId);

}
