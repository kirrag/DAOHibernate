package ru.netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import ru.netology.repository.DAOHibernateRepository;
import ru.netology.entity.Person;

@RestController
public class DAOHibernateController {
	DAOHibernateRepository repository;

	DAOHibernateController(DAOHibernateRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/persons/by-city")
	public List<Person> getPersonsByCity(@RequestParam("city") String city) {
		return repository.getPersonsByCity(city);
	}
}
