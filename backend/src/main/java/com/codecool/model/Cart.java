package com.codecool.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cart {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private BigDecimal totalPrice;
    private boolean closed;

}
