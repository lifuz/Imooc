package com.lifuz.auth.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 功能类
 *
 * 实体类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 17:51
 */
@Data
@NoArgsConstructor
public class Function {

    private Long id;

    private String name;

    private Long parentId;

    private String url;

    private Integer serialNum;

    private Integer accordion;

    private Date createTime;

    private Date updateTime;

}
