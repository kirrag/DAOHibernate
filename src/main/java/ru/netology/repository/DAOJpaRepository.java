package ru.netology.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.netology.entity.Person;
import ru.netology.entity.PersonId;

@Repository
public interface DAOJpaRepository extends JpaRepository<Person, PersonId> {

	public List<Person> findByPersonIdName(String name);

	public List<Person> findByPersonIdSurname(String surname);

	public List<Person> findByPersonIdAge(int age);

	public List<Person> findByCity(String city);

	public List<Person> findByPhone(String Phone);

	public List<Person> findByPersonIdAgeIsLessThanOrderByPersonIdAgeAsc(int age);

	public Optional<Person> findByPersonIdNameAndPersonIdSurname(String name, String surname);
}
