package com.internet.cafe.internet_cafe_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Entity(name = "coffee")
@Table(name = "coffee")
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String type;
    @Column(nullable = false)
    @Transient
    private BigDecimal price;
    @Column(nullable = false, length = 1)
    private Character disabled;
}
