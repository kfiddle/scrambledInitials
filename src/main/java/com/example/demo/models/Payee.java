package com.example.demo.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Payee implements Comparable<Payee>{

    @Id
    @GeneratedValue
    private Long id;

    private String lastName;
    private String firstName;

    private String phoneNumber;
    private String email;

    private String address;

    private boolean w9ed;


    @JsonIgnore
    @ManyToMany(mappedBy = "payees")
    private Collection<Item> items;

    public Payee() {
    }

    public Payee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Payee(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Payee(String firstName, String lastName, String phoneNumber, String email, boolean w9ed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.w9ed = w9ed;
    }

    public Payee(String firstName, String lastName, String phoneNumber, String email, String address, boolean w9ed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.w9ed = w9ed;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setW9ed(boolean w9ed) {
        this.w9ed = w9ed;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean getW9ed() {
        return w9ed;
    }

    public boolean isW9ed() { return w9ed; }

    public Collection<Item> getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Payee otherPayee) {
        return lastName.compareTo(otherPayee.getLastName());
    }
}
