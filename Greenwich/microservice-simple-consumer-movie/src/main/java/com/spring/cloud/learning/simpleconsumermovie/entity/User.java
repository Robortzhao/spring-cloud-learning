package com.spring.cloud.learning.simpleconsumermovie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author zhaoyanhai
 * @description 实体类
 * @date 2019/10/5
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String userName;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
