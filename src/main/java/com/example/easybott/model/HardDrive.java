package com.example.easybott.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("hard_drive")
public class HardDrive extends Product {
    private int capacity;

    public HardDrive() {

    }

    public HardDrive(Long id, String serialNumber, String manufacturer, double price, int quantity, int capacity) {
        super(id, serialNumber, manufacturer, price, quantity);
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
