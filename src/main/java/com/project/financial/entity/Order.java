package com.project.financial.entity;

import com.project.financial.constant.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="order")
@Getter
@Setter
@ToString
public class Order {
    @Id
    @Column(name="order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String order_id; //주문 기록

    @Column(nullable = false)
    private String user_id; //유저 아이디(FK)

    @Column(nullable = false)
    private OrderStatus orderStatus; //주문 상태(SUCCESS: 성공, FAIL: 실패)
}
