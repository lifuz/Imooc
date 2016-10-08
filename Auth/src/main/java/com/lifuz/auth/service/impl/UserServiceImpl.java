package com.lifuz.auth.service.impl;

import com.lifuz.auth.dao.UserDao;
import com.lifuz.auth.dao.UserRoleDao;
import com.lifuz.auth.entity.User;
import com.lifuz.auth.entity.UserRole;
import com.lifuz.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户信息处理service层实现类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 16:44
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public void addUser(User user) {

        userDao.saveUser(user);

    }

    @Override
    public void updateUser(User user) {

        userDao.updateUser(user);

    }

    @Override
    public void deleteUserById(Long id) {

        userDao.deleteById(id);

    }

    @Override
    public User getUser(String name, String pwd) {
        return userDao.getUser(name,pwd);
    }

    @Override
    public List<User> getUsers(int pageIndex,int pageSize) {

        int offset = (pageIndex -1 ) * pageSize;

        return userDao.findUsers(offset,pageSize);
    }

    @Override
    public List<User> getUsers(List<Long> ids) {
        return userDao.findByIds(ids);
    }

    @Override
    public List<UserRole> getUsserRoles(int pageIndex, int pageSize) {
        int offset = (pageIndex -1 ) * pageSize;
        return userRoleDao.findUserRoles(offset,pageSize);
    }

    @Override
    public List<UserRole> getUserRolesByUserId(Long userId) {
        return userRoleDao.findUserRolesByUserId(userId);
    }
}
