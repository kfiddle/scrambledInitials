package com.example.demo.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Collection;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;

    private int totalPennies;

    @ManyToOne
    private FoundationItem foundationItem;

    @ManyToOne
    private Foundation foundation;

    public Transaction() {
    }

    public Transaction(int totalPennies) {
        this.totalPennies = totalPennies;
    }

    public Transaction(int totalPennies, Foundation foundation) {
        this.totalPennies = totalPennies;
        this.foundation = foundation;
    }

    public void setTotalPennies(int totalPennies) {
        this.totalPennies = totalPennies;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public void setFoundationItem(FoundationItem foundationItem) {
        this.foundationItem = foundationItem;
    }


    public Long getId() {
        return id;
    }

    public int getTotalPennies() {
        return totalPennies;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public FoundationItem getFoundationItem() { return foundationItem; }
}
