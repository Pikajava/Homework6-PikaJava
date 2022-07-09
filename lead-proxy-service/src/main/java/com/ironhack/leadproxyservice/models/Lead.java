package com.ironhack.leadproxyservice.models;

import javax.persistence.*;

@Entity
@Table(name = "lead_table")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    private String name;
    private String email;
    private int phoneNumber;
    private String companyName;
    private Long salesRepId;

    public Lead() {
    }

    public Lead(String name, String email, int phoneNumber, String companyName) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.salesRepId = salesRepId;
    }

    public Lead(String name, String email, int phoneNumber, String companyName, Long salesRepId) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.salesRepId = salesRepId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getSalesRepId() {
        return salesRepId;
    }

    public void setSalesRepId(Long salesRepId) {
        this.salesRepId = salesRepId;
    }

    public String toString() {
        return String.format(" ***   LEAD    ***\n ID: %s\n Name: %s\n Email: %s\n Phone Number: %s\n Company Name: %s\n --------------------",
                id,
                name,
                email,
                phoneNumber,
                companyName);

    }
}
