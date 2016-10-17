package com.lifuz.auth.service;

import com.lifuz.auth.entity.User;
import com.lifuz.auth.entity.UserRole;

import java.util.List;

/**
 *
 * 用户处理 service
 *
 * service层
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 16:32
 */
public interface UserService {

    /**
     * 保存用户信息
     * @param user 用户信息
     */
    void addUser(User user);

    /**
     * 更新用户信息
     * @param user 用户信息
     */
    void updateUser(User user);

    /**
     * 根据用户id删除用户
     * @param id 用户id
     */
    void deleteUserById(Long id);

    /**
     * 根据用户名，密码查询用户，用于登录
     * @param name 用户名
     * @param pwd 密码
     * @return 用户信息
     */
    User getUser(String name,String pwd);

    /**
     * 分页查询用户信息
     * @param pageIndex 当前页码
     * @param pageSize 每页记录数
     * @return 用户信息集合
     */
    List<User> getUsers(int pageIndex,int pageSize);

    /**
     * 根据id集合查询对应的用户信息
     * @param ids 用户id集合
     * @return 用户信息集合
     */
    List<User> getUsers(List<Long> ids);

    /**
     * 获取角色与用户对应关系
     * @param pageIndex 当前页码
     * @param pageSize 每页记录数
     * @return 用户角色对应关系集合
     */
    List<UserRole> getUsserRoles(int pageIndex,int pageSize);

    /**
     * 根据用户id查询用户角色对应关系
     * @param userId
     * @return
     */
    List<UserRole> getUserRolesByUserId(Long userId);

    /**
     *保存用户角色对应关系
     * @param userId 用户id
     * @param roleIds 一组角色id
     */
    void addUserRoles(Long userId,List<Long> roleIds);

}
