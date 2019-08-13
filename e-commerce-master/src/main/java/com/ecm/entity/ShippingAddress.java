package com.ecm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
public class ShippingAddress implements Serializable {

    private static final long serialVersionUID = 921227846105947776L;

    @Id
    @GeneratedValue
    private Long addressId;
    @NotEmpty(message="Please fill in your name")
    private String fullName;
    @NotEmpty(message="Please fill in your phone number")
    private String phoneNumber;
    @NotEmpty(message="Address can not be null")
    private String address;
    @NotEmpty(message="City can not be null")
    private String city;
    @NotEmpty(message="State can not be null")
    private String state;
    @NotEmpty(message="Country can not be null")
    private String country;
    @NotEmpty(message="ZipCode can not be null")
    private String zipCode;
    private boolean isDefault;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private AppUser appUser;

    
}
