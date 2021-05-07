//package com.example.jdata4_1.Repository;
//
//import com.example.jdata4_1.Entity.Person;
//import lombok.Data;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.*;
//
//@Data
//@org.springframework.stereotype.Repository
//public class Repository {
//
//    @PersistenceContext
//    private final EntityManager entityManager;
//
//    public List<Person> getPersonsByCity(String city) {
//
//        TypedQuery<Person> query = entityManager.createQuery("select p from Person p where p.city_of_living=:city", Person.class);
//        return query.setParameter("city", city).getResultList();
//    }
//}
