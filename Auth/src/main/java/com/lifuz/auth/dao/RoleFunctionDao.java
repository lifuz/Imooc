package com.lifuz.auth.dao;

import com.lifuz.auth.entity.RoleFunction;

import java.util.List;

/**
 *
 * 角色与功能对应关系 dao类
 *
 * dao层
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/18 13:40
 */
public interface RoleFunctionDao {

    /**
     * 批量保存角色功能对应关系
     * @param roleFunctions 角色 功能对应关系集合
     * @return 数据库操作结果
     */
    Integer saveRoleFunctions(List<RoleFunction> roleFunctions);

    /**
     * 根据角色id删除角色功能对应关系
     * @param roleId 角色id
     * @return 数据库操作结果
     */
    Integer deleteByRoleId(Long roleId);

    /**
     * 根据 角色id获取 角色功能对应关系
     * @param roleId 角色id
     * @return 角色功能对应关系集合
     */
    List<RoleFunction> findByRoleId(Long roleId);

}
