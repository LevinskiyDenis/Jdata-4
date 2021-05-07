package com.example.jdata4_1.Service;

import com.example.jdata4_1.Entity.Person;
import com.example.jdata4_1.Repository.Repository;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@org.springframework.stereotype.Service
public class Service {

    private final Repository repository;

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
