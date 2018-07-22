package com.example.demo.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Entity
@Data
public class Gril implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String cupSize;

    @Min(value = 18 , message = "未成年少女禁止入内")
    private Integer age;


    private String love;



}
