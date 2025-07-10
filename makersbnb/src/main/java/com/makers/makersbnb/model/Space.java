package com.makers.makersbnb.model;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Entity - instances of this class map to database records
@Entity
@Getter @Setter @NoArgsConstructor
// @Table - those records can be found in the spaces table
@Table(name = "SPACES")
public class Space {

    // the following field (id) is the primary key for this Entity
    @Id
    // the value of id is generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // a second field that holds the name of each space
    private String name;

    private String description;

    private int price;


    // a one-argument constructor
    public Space(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // methods that get and set name
}
