package com.example.jdata4_1.Repository;

import com.example.jdata4_1.Entity.Person;
import com.example.jdata4_1.Entity.PersonID;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomizedPersonRepository extends JpaRepository<Person, PersonID> {

    List<Person> findAllByCityEquals(String city);

    List<Person> findAllByAgeIsLessThan(int age, Sort sort);

    Optional<Person> findByNameEqualsAndSurnameEquals(String name, String surname);
}
