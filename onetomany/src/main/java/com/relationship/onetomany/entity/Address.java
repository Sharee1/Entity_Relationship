package com.relationship.onetomany.entity;


import jakarta.persistence.*;

@Entity
@Table(name="Adress_Table")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int Id;
    private  String city;
    private  String Area;
    private  int houseNo;

    @ManyToOne
    @JoinColumn(name = "Adress_Id")
    private Student student;

    public Address(int adressId, String city, String area, int houseNo) {
        this.Id = adressId;
        this.city = city;
        Area = area;
        this.houseNo = houseNo;
    }

    public int getAdressId() {
        return Id;
    }

    public void setAdressId(int adressId) {
        this.Id = adressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public Address() {


    }

    @Override
    public String toString() {
        return "Address{" +
                "adressId=" + Id +
                ", city='" + city + '\'' +
                ", Area='" + Area + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }
}
