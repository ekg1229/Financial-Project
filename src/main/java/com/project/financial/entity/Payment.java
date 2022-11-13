package com.project.financial.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="payment")
@Getter
@Setter
@ToString
public class Payment {
    @Id
    @Column(name="payment_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String payment_id; //결제 기록

    @Column(nullable = false)
    private String order_id; //주문 기록(FK)

    @Column(nullable = false)
    private String payment_time; //결제 시간

    @Column(nullable = false)
    private Integer total; //총 결제 금액
}
