package com.ecommerce.site.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity extends AbstractEntity {

    @Id
    private Long id;
    private String addressLine;
    private String city;
    private String country;
    private String zipCode;

    public AddressEntity(Long id, String addressLine, String city, String country, String zipCode) {
        this.id = id;
        this.addressLine = addressLine;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public AddressEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
