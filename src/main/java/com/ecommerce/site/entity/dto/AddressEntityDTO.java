package com.ecommerce.site.entity.dto;

public class AddressEntityDTO {

    private String addressLine;
    private String city;
    private String country;
    private String zipCode;

    public AddressEntityDTO() {
    }

    public AddressEntityDTO(String addressLine, String city, String country, String zipCode) {
        this.addressLine = addressLine;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
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
