package com.example.jdata4_1.Repository;

import com.example.jdata4_1.Entity.Person;
import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.*;

@Data
@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private final EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {

        return entityManager.createQuery("select p from Person p join p.city c where c.name_of_city=:city", Person.class)
                .setParameter("city", city).getResultList();
    }
}
