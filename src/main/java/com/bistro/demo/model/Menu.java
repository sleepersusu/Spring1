package com.bistro.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "Menu")
public class Menu {

    //PK
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer ID;

    //欄位
        //產品資訊
            private String productCategory;
            private String productName ;
            @Lob
            private byte[] productImg ;
            private Integer productPrice;
            private String productDescribe;
            private String productImgUrl;
            private Integer productCount;
            private Integer midProductCount;
            private Double avgScore;
            private String menuStatus;
            @Temporal(TemporalType.DATE)
            private Date createdAt;

    //FK
        //一對多：一個菜品可以出現在多筆訂單中
            @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, orphanRemoval = true)
            private List<OrderDetails> orderDetails;  // 訂單明細

    public Menu() {};
}
