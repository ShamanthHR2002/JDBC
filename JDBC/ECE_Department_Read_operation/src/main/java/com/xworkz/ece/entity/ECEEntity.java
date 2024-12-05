package com.xworkz.ece.entity;

import javax.persistence.*;

@Entity
@Table(name = "ece_table")
@NamedQuery(name = "findBystudentId", query = "SELECT ie FROM ECEEntity ie WHERE ie.studentId = :stuId")
@NamedQuery(name = "findAll", query = "SELECT ie FROM ECEEntity ie")
@NamedQuery(name = "findNameByEmail", query = "SELECT ie.name FROM ECEEntity ie WHERE ie.email = :getEmail")
@NamedQuery(name = "findMobileNoByName", query = "SELECT ie.mobileNo FROM ECEEntity ie WHERE ie.name = :setName")
@NamedQuery(name = "findNameByMentor", query = "SELECT ie.name FROM ECEEntity ie WHERE ie.mentor = :getMentor")
public class ECEEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "stu_id")
    private int studentId;

    private String name;
    private String email;
    private String mentor;

    @Column(name = "mobile_no")
    private long mobileNo;

    public ECEEntity() {
    }

    public ECEEntity(int studentId, String name, String email, String mentor, long mobileNo) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.mentor = mentor;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "ECEEntity [id=" + id + ", studentId=" + studentId + ", name=" + name + ", email=" + email +
                ", mentor=" + mentor + ", mobileNo=" + mobileNo + "]";
    }
}
