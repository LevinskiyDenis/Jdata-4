package com.example.jdata4_1.Repository;

import com.example.jdata4_1.Entity.Person;
import com.example.jdata4_1.Entity.PersonID;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomizedPersonRepository extends JpaRepository<Person, PersonID> {

    @Query("select p from Person p where p.city=:city")
    List<Person> findAllByCityEquals(@Param("city")String city);

    @Query("select p from Person p where p.age < :age")
    List<Person> findAllByAgeIsLessThan(@Param("age") int age, Sort sort);

    @Query("select p from Person p where p.name=:name and p.surname=:surname")
    Optional<Person> findByNameEqualsAndSurnameEquals(@Param("name") String name,@Param("surname") String surname);
}
