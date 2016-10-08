package com.lifuz.auth.dao;

import com.lifuz.auth.entity.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户角色关系 dao类
 *
 * dao层
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 11:37
 */
public interface UserRoleDao {

    /**
     * 添加一条用户与角色关系记录
     * @param userRole 用户与角色关系信息
     * @return 数据库操作结果
     */
    Integer saveUserRole(UserRole userRole);

    /**
     * 获取用户与角色关系
     * @param id 关系id
     * @return 查询结果的唯一实例
     */
    UserRole getUserRole(Long id);

    /**
     * 根据用户id获取关系列表
     * @param userId 用户id
     * @return 查询结果集
     */
    List<UserRole> findUserRolesByUserId(Long userId);

    /**
     * 获取用户角色对应关系
     * @param offset 记录偏移量
     * @param rows 最大条目数
     * @return 用户角色对应关系集合
     */
    List<UserRole> findUserRoles(@Param("offset") int offset,@Param("rows") int rows);

    /**
     * 根据角色id获取关系列表
     * @param roleId
     * @return 用户角色对应关系集合
     */
    List<UserRole> findUserRoleByRoleId(Long roleId);

    /**
     * 删除关系记录
     *
     * @param id 关系id
     * @return
     */
    Integer deleteById(Long id);

}
