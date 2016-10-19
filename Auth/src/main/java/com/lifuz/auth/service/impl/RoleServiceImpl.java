package com.lifuz.auth.service.impl;

import com.lifuz.auth.dao.RoleDao;
import com.lifuz.auth.dao.RoleFunctionDao;
import com.lifuz.auth.entity.Role;
import com.lifuz.auth.entity.RoleFunction;
import com.lifuz.auth.exception.AuthException;
import com.lifuz.auth.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * 角色管理service 实现类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/17 15:12
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private RoleFunctionDao roleFunctionDao;

    @Transactional
    @Override
    public void addRole(Role role, List<RoleFunction> roleFunctions) {

        int result = roleDao.saveRole(role);

        if (result != 1) {
            throw new AuthException("角色添加失败");
        }

        for (RoleFunction roleFunction: roleFunctions
             ) {

            roleFunction.setRoleId(role.getId());
        }

        result = roleFunctionDao.saveRoleFunctions(roleFunctions);

        if (result != roleFunctions.size()) {
            throw new AuthException("角色对应添加失败");
        }

    }

    @Transactional
    @Override
    public void editRole(Role role, List<RoleFunction> roleFunctions) {

        int result = roleDao.updateRole(role);

        if(result != 1) {
            throw new AuthException("角色信息更新失败");
        }

        roleFunctionDao.deleteByRoleId(role.getId());

        for (RoleFunction roleFunction: roleFunctions
             ) {

            roleFunction.setRoleId(role.getId());

        }

        result = roleFunctionDao.saveRoleFunctions(roleFunctions);

        if (result != roleFunctions.size()) {
            throw new AuthException("角色对应添加失败");
        }

    }

    @Transactional
    @Override
    public void deleteRole(Long roleId) {

        int result = roleDao.deleteById(roleId);

        if(result != 1) {
            throw new AuthException("角色信息删除失败");
        }

        roleFunctionDao.deleteByRoleId(roleId);

    }

    @Override
    public List<Role> getRoles(int page, int size) {

        int offset = (page - 1) * size;

        List<Role> roles = roleDao.findRoles(offset,size);

        for (Role role: roles
             ) {

            List<RoleFunction> roleFunctions = roleFunctionDao.findByRoleId(role.getId());

            role.setRoleFunctions(roleFunctions);

        }

        return roles;
    }

    @Override
    public List<Role> getRoles(List<Long> ids) {
        return roleDao.findByIds(ids);
    }

    @Override
    public List<RoleFunction> getRoleFunctions(Long roleId) {
        return roleFunctionDao.findByRoleId(roleId);
    }
}
