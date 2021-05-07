package com.example.jdata4_1.Service;

import com.example.jdata4_1.Entity.Person;
import com.example.jdata4_1.Repository.CustomizedPersonRepository;
import lombok.Data;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Data
@org.springframework.stereotype.Service
public class Service {

    private final CustomizedPersonRepository repository;

    public List<Person> getPersonsByCity(String city) {
        return repository.findAllByCityEquals(city);
    }

    public List<Person> getPersonsByAgeLessThan(int age) {
        return repository.findAllByAgeIsLessThan(age, Sort.by("age"));
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return  repository.findByNameEqualsAndSurnameEquals(name, surname);
    }
}
