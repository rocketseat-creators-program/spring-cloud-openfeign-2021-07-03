package com.expertsclub.openfeign.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CovidDTO {

    private Integer uid;
    private String uf;
    private String state;
    private Integer cases;
    private Integer deaths;
    private Integer suspects;
    private Integer refuses;
    private LocalDateTime datetime;

}