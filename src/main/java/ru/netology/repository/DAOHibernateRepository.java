package ru.netology.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ru.netology.entity.Person;

@Repository
@Transactional
public class DAOHibernateRepository {
	@PersistenceContext
	private EntityManager entityManager;

	List<Person> persons;

	public Person savePerson(Person person) {
		entityManager.persist(person);
		return person;
	}
	
	public List<Person> getPersonsByCity(String city) {
		return entityManager.createNativeQuery("select * from person where city = :city", Person.class).setParameter("city", city).getResultList();
	}
}

