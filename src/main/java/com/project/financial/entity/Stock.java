package com.project.financial.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="stock")
@Getter
@Setter
@ToString
public class Stock {
    @Id
    @Column(name="stock_code", nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stk_cd; //종목코드

    @Column(name="stock_name", nullable=false)
    private String stk_nm; //종목명

    @Column(name="stock_price", nullable=false)
    private String stk_pc; //종목명
}