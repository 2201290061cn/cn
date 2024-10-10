package com.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//乘客
public class Passenger {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
}