package com.example.jdata4_1.Entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonID implements Serializable {

    private String name;
    private String surname;
    private int age;

}
