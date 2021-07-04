package com.expertsclub.openfeign.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    private String id;

    private String name;
    private String email;

    @Column(name = "zip_code")
    private String zipCode;

    private String address;
    private String district;
    private String city;
    private String state;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
