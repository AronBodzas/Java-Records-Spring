package com.codecool.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PreviousOrder {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
