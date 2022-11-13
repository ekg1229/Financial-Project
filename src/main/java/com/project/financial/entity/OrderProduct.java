package com.project.financial.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="order_product")
@Getter
@Setter
@ToString
public class OrderProduct {
    @Id
    @Column(name="order_product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String order_product_id; //주문된 상품

    @Column(nullable = false)
    private Integer amount; //수량

    @Column(nullable = false)
    private Integer stk_cd; //종목 코드(FK)

    @Column(nullable = false)
    private Integer order_id; //주문 기록(FK)
}
