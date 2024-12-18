package com.xworkz.commounmodule.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "commounmodule_details")
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "PhoneNumber")
    private long phoneNo;

    @Column(name = "AlterEmail")
    private String altEmail;

    @Column(name = "AlterPhoneNumber")
    private long altPhoneNo;

    @Column(name = "Location")
    private String location;

    @Column(name = "Password")
    private String password;
}
