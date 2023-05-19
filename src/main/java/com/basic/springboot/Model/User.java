package com.basic.springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String username;


    private String email;
    private String password;
    private String firstName;
    private String lastName;

    // Constructors (default and parameterized)

    // Getters and setters for all properties

    // Optional: Additional methods, relationships, etc.

    // You can also include methods for convenience or additional functionality, such as:

    // public void addExpense(Expense expense) {
    //     // Add logic to associate the expense with the user
    // }

    // public void addEarning(Earning earning) {
    //     // Add logic to associate the earning with the user
    // }

}

