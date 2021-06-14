package com.acc.training.customerapi.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

@Document(collection = "customers-training-rahul")
public class CustomerDomain {

    @Id
    private String id;

    private String customerId = null;

    private String customerName = null;

    private String customerAddress = null;

    private Integer officeCode = null;

    public CustomerDomain() {
    }

    public CustomerDomain(String id, String customerId, String customerName, String customerAddress,
            Integer officeCode) {
        this.id = id;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.officeCode = officeCode;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Integer getOfficeCode() {
        return this.officeCode;
    }

    public void setOfficeCode(Integer officeCode) {
        this.officeCode = officeCode;
    }

    public CustomerDomain id(String id) {
        setId(id);
        return this;
    }

    public CustomerDomain customerId(String customerId) {
        setCustomerId(customerId);
        return this;
    }

    public CustomerDomain customerName(String customerName) {
        setCustomerName(customerName);
        return this;
    }

    public CustomerDomain customerAddress(String customerAddress) {
        setCustomerAddress(customerAddress);
        return this;
    }

    public CustomerDomain officeCode(Integer officeCode) {
        setOfficeCode(officeCode);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", customerId='" + getCustomerId() + "'" + ", customerName='"
                + getCustomerName() + "'" + ", customerAddress='" + getCustomerAddress() + "'" + ", officeCode='"
                + getOfficeCode() + "'" + "}";
    }

}
