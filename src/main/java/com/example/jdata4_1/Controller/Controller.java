package com.example.jdata4_1.Controller;

import com.example.jdata4_1.Entity.Person;
import com.example.jdata4_1.Service.Service;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Data
@RestController
@RequestMapping("/persons")
public class Controller {

    private final Service service;

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return service.getPersonsByCity(city);
    }
}
