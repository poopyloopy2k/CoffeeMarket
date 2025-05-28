package com.internet.cafe.internet_cafe_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Integer quantity;

    //много позиций ссылаются на один вид кофе
    @ManyToOne
    @JoinColumn(nullable = false, name = "type_id")
    private Coffee coffee;
    //много позиций заказа ссылаются на один заказ
    @ManyToOne
    @JoinColumn(nullable = false, name = "order_id")
    private Order order;

}
