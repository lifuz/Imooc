package com.lifuz.auth.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 *
 * 角色
 * 实体类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 17:46
 */
@Data
@NoArgsConstructor
public class Role {

    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

    private List<RoleFunction> roleFunctions;

}
