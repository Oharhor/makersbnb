package com.makers.makersbnb.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "staff")
public class Staff {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String role;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
