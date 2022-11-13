package com.project.financial.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="cart")
@Getter
@Setter
@ToString
public class Cart {
    @Id
    @Column(name="cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cart_id; //카트 아이디

    @Column(nullable = false)
    private Integer amount; //수량

    @Column(nullable = false)
    private String user_id; //유저 아이디(FK)

    @Column(nullable = false)
    private Integer stk_cd; //종목 코드(FK)
}
