package com.example.easybott.model;

import jakarta.persistence.*;


@Entity
@Table(name = "products")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serial_number")
    private String serialNumber;

    private String manufacturer;
    private double price;
    private int quantity;
    private String type;

    public Product() {

    }

    public Product(Long id, String serialNumber, String manufacturer, double price, int quantity) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantity = quantity;
    }


    public String getId() {
        return String.valueOf(id);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}




