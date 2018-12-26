package com.spring.SystemFlow.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.SystemFlow.model.Person;
import com.spring.SystemFlow.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
//	PersonRepository<Person> personRepository;
	CrudRepository<Person, Long>  personRepository;

	@Transactional
	public List<Person> getAllPersons() {
		return (List<Person>) personRepository.findAll();
	}

	@Transactional
	public List<Person> findByNamex(String name) {
//		return personRepository.findByLastName(name);
		//return personRepository.fin
		return null;
	}

	@Transactional
	public Optional<Person> getById(Long id) {
		return personRepository.findById(id);
	}

	@Transactional
	public void deletePerson(Long personId) {
		personRepository.deleteById(personId);
	}

	@Transactional
	public boolean addPerson(Person person) {
		return personRepository.save(person) != null;
	}

	@Transactional
	public boolean updatePerson(Person person) {
		return personRepository.save(person) != null;
	}
}