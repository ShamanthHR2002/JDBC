package com.xworkz.courseregistration.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data

@Entity
@Table(name = "details")
@NoArgsConstructor

@NamedQuery(name = "getNameByEmailAndPassword", query = "select xe.name from XworkzEntity xe  where xe.email = :email and xe.password = :password")

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

    @Column(name = "confirm_password")
    String confirmPassword;

    @Column(name = "phno")
    long phno;


}
