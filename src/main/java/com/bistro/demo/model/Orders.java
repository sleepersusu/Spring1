package com.bistro.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "Orders")
public class Orders {

    //PK
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer ID;

    //欄位
        //訂單資訊
            private String  ordersName;
            private String  ordersTel;
            private Integer ordersSumPrice;
            private Integer pointGetted;
            private String ordersStatus;
            @Temporal(TemporalType.TIMESTAMP)
            private Date createdAt;
        //付款資訊
            private String paymentWay;
            private String paymentStatus;
            @Temporal(TemporalType.TIMESTAMP)
            private Date paymentTime;

    //FK
        //多對一：多個訂單可以來自同一個會員
            @ManyToOne
            @JoinColumn(name = "memberId")
            private Members members;
        //多對一：多個訂單可以來自同一個桌號
            @ManyToOne
            @JoinColumn(name = "seatsId")
            private Seats seats;
        //多對一：多個訂單可以來自同一個員工處理
            @ManyToOne
            @JoinColumn(name = "employeeId")
            private Employee employee;
        //一對多：一筆訂單會有多筆訂單詳情
            @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL, orphanRemoval = true)
            private List<OrderDetails> orderDetails;  // 訂單明細



    public Orders() {}





}
