package com.lifuz.auth.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *
 * 用户角色关系类
 *
 * 实体类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 17:53
 */

@Data
@NoArgsConstructor
public class UserRole {

    private Long id;

    private Long roleId;

    private Long userId;

    private Date createTime;

    private Date updateTime;
}
