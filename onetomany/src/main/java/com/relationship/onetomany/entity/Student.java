package com.relationship.onetomany.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="student_table")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String studentName;
    private String studentStatus;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address>  AddressList= new ArrayList<>();

    @OneToOne(mappedBy = "student" ,cascade = CascadeType.ALL)
    private Laptop laptop;



    public Student() {

        super();
    }

    public Student(int studentId, String studentName, String studentStatus, Laptop laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentStatus = studentStatus;
        this.laptop = laptop;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public List<Address> getAddressList()

    {
        return AddressList;
    }

    public void setAddressList(List<Address> addressList)

    {
        this.AddressList = addressList;
    }

}
