package com.bistro.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "OrderDetails")
public class OrderDetails {

    @EmbeddedId
    private OrderDetailsId orderDetailsPFKId; // 嵌入的複合主鍵

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("ordersId")
    private Orders orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("menuId")
    private Menu menu;


    private Integer odQuantity ;
    private Integer odPrice;
    private Integer odDiscount;

    private Integer commentRating;
    private String commentMessage ;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp commentDate ;

    public OrderDetails() {};

}
