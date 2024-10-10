package com.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//护照
public class Passport {
    private Integer id;
    private String nationality;
    private Date expire;
    private Integer passengerId;
    //一个护照对应一个乘客 has-a 关系
    private Passenger passenger;
}