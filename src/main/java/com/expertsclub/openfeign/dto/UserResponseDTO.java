package com.expertsclub.openfeign.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserResponseDTO {

    private String id;
    private String name;
    private String email;

    private String zipCode;
    private String address;
    private String district;
    private String city;
    private String state;

    private CovidDTO covidInfo;

    private LocalDateTime createdAt;
}
