package com.workflow.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workflow.model.Bike;
import com.workflow.repository.BikeRepository;
 

@Service
public class BikeServiceImpl implements BikeService {
 
	@Autowired
	private BikeRepository bikeRepository;
 
	@Override
	public List<Bike> getAllBikes() {
		List<Bike> bikes = new ArrayList<Bike>();
		Iterator<Bike> iterator = bikeRepository.findAll().iterator();
		while (iterator.hasNext()) {
			bikes.add(iterator.next());
		}
 
		return bikes;
	}
 
	@Override
	public Bike getBike(Integer bikeId) {
		return bikeRepository.findOne(bikeId);
	}
 
	@Override
	public Bike createBike(Bike bike) {
		return bikeRepository.save(bike);
	}
 
	@Override
	public Bike updateBike(Bike bike) {
		return bikeRepository.save(bike);
	}
 
	@Override
	public void deleteBike(Integer bikeId) {
		bikeRepository.delete(bikeId);
	}
 
}