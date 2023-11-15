package com.relationship.onetomany.entity;


import jakarta.persistence.*;

@Entity
@Table(name="Laptop_Name")
public class Laptop {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int laptopId;
    private  String laptopName;
    private  String laptopModeNumber;


    @OneToOne
    @JoinColumn(name = "student_Id")
    private Student student;

    public Laptop(int laptopId, String laptopName, String laptopModeNumber, Student student) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
        this.laptopModeNumber = laptopModeNumber;
        this.student = student;

    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getLaptopModeNumber() {
        return laptopModeNumber;
    }

    public void setLaptopModeNumber(String laptopModeNumber) {
        this.laptopModeNumber = laptopModeNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Laptop() {
    }


}

