package com.banking.bankingapi.bankingapi.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String username;

    private String password;

    private String address;

    private String state;

    private String country;

    private String emailAddress;

    private String pan;

    private String contactNo;

    private LocalDate dob;

    private String accountType;

    public Customer() {
    }

    public Customer(String name, String username, String password, String address, String state, String country,
            String emailAddress, String pan, String contactNo, LocalDate dob, String accountType) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.state = state;
        this.country = country;
        this.emailAddress = emailAddress;
        this.pan = pan;
        this.contactNo = contactNo;
        this.dob = dob;
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", username=" + username + ", password=" + password + ", address=" + address
                + ", state=" + state + ", country=" + country + ", emailAddress=" + emailAddress + ", pan=" + pan
                + ", contactNo=" + contactNo + ", dob=" + dob + ", accountType=" + accountType + "]";
    }



}
