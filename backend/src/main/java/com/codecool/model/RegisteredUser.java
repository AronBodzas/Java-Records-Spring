package com.codecool.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RegisteredUser {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
