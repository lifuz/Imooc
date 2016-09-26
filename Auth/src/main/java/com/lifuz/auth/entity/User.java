package com.lifuz.auth.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户类
 * 实体类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 17:45
 */
@Data
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private String pwd;

    private Date createTime;

    private Date updateTime;


}
