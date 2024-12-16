package com.xworkz.courseregistration.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "admin_details_table")
@NoArgsConstructor

@NamedQuery(name = "getNameByEmailAndPassword", query = "select XE.name from XworkzEntity XE  where XE.email = :email and XE.password = :password")

public class XworkzEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    int age;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @Column(name = "phonenumber")
    long phonenumber;


}

