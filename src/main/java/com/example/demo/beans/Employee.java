package com.example.demo.beans;
import com.example.demo.enums.Fonction;

public class Employee {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Fonction fonction;

    // Constructeur avec tous les paramètres
    public Employee(String id, String name, String email, String phone, String address, Fonction fonction) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.fonction = fonction;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", fonction=" + fonction +
                '}';
    }
}
