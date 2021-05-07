package com.example.jdata4_1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(PersonID.class)
public class Person {

    @Id
    @Column(nullable = false)
    private String name;

    @Id
    @Column(nullable = false)
    private String surname;

    @Id
    @Column(nullable = false)
    private int age;

    @Column(unique = true)
    private long phone_number;

    @JoinColumn(nullable = true)
    @ManyToOne
    private City city;
}
