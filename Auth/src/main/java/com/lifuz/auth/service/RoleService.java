package com.lifuz.auth.service;

import com.lifuz.auth.entity.Role;
import com.lifuz.auth.entity.RoleFunction;

import java.util.List;

/**
 *
 * 角色管理 service
 *
 * service 层
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 16:32
 */
public interface RoleService {

    /**
     * 保存角色信息，同时保存角色对应的功能
     * @param role 角色信息
     * @param roleFunctions 角色对应的功能
     */
    void addRole(Role role, List<RoleFunction> roleFunctions);

    /**
     * 修改角色信息，同时修改角色对应的功能
     * @param role 角色信息
     * @param roleFunctions 新的角色功能对应关系
     */
    void editRole(Role role, List<RoleFunction> roleFunctions);

    /**
     * 根据id删除角色
     * @param roleId 角色id
     */
    void deleteRole(Long roleId);

    /**
     * 分页查询角色列表
     * @param page 当前页
     * @param size 每页记录数
     * @return 角色集合
     */
    List<Role> getRoles(int page,int size);

    /**
     * 根据 id 集合查询角色信息
     * @param ids 角色id集合
     * @return 角色集合
     */
    List<Role> getRoles(List<Long> ids);

    /**
     * 根据角色id查询角色功能对应关系
     * @param roleId 角色 id
     * @return 角色功能对应关系 集合
     */
    List<RoleFunction> getRoleFunctions(Long roleId);
}
