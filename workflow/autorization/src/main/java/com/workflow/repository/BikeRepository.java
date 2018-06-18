package com.workflow.repository;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import com.workflow.model.Bike;

public interface BikeRepository extends CrudRepository<Bike, Serializable> {

}
