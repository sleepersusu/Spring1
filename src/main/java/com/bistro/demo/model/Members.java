package com.bistro.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "Members")
public class Members {

    //PK
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer ID;


    //欄位
        //會員資訊
            private String memberAccount ; //UNIQUE
            private String memberPassword  ;
            private String memberName  ;
            private Integer memberAge;  //tinyint
            private Integer memberSex;  //tinyint
            @Temporal(TemporalType.DATE)
            private Date memberBirthday;
            private Integer memberFavor ;
            private String memberAddress ;
            private String memberPhone ;
            private String memberEmail ;
            @Lob
            private byte[] memberImg ;
            private Integer memberPoint ;
            private String memberStatus ;
            @Temporal(TemporalType.TIMESTAMP)
            private Date createdAt;



    public Members() {};


}
