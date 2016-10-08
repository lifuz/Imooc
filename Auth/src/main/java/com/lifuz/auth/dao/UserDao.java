package com.lifuz.auth.dao;

import com.lifuz.auth.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * 用户dao类
 *
 * dao层
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 9:41
 */
public interface UserDao {

    /**
     * 根据id集合查询对应的用户信息
     * @param ids 用户id集合
     * @return 用户信息集合
     */
    List<User> findByIds(List<Long> ids);

    /**
     * 分页查询用户信息
     * @param offset 记录偏移量
     * @param rows 最大条目数
     * @return 用户信息集合
     */
    List<User> findUsers(@Param("offset") int offset,@Param("rows") int rows);

    /**
     * 根据用户名和密码查询用户，用于登录
     * @param name 用户名
     * @param pwd 密码
     * @return 查询到的唯一实体
     */
    User getUser(@Param("name") String name ,@Param("pwd") String pwd);

    /**
     * 用户注册
     * @param user 用户信息
     * @return 操作结果
     */
    Integer saveUser(User user);

    /**
     * 更新用户信息
     * @param user 用户信息
     * @return 数据库操作结果
     */
    Integer updateUser(User user);

    /**
     * 删除用户
     * @param id 用户id
     * @return 删除操作的结果
     */
    Integer deleteById(Long id);

}
