package com.lifuz.auth.dao;

import com.lifuz.auth.entity.Role;

/**
 * 角色 dao类
 * <p>
 * dao层
 * <p>
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 10:24
 */
public interface RoleDao {

    /**
     * 添加角色
     *
     * @param role 角色信息
     * @return 数据库操作结果
     */
    Integer saveRole(Role role);

    /**
     * 根据id获取角色详细信息
     *
     * @param id 角色id
     * @return 查询到的唯一实体
     */
    Role getRole(Long id);

    /**
     * 更新角色信息
     *
     * @param role 角色信息
     * @return 数据库操作结果
     */
    Integer updateRole(Role role);

    /**
     * 根据id删除一个角色
     *
     * @param id 角色id
     * @return 数据库操作结果
     */
    Integer deleteById(Long id);


}
