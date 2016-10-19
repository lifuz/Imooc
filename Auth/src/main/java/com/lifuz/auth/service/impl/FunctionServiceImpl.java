package com.lifuz.auth.service.impl;

import com.lifuz.auth.dao.FunctionDao;
import com.lifuz.auth.entity.Function;
import com.lifuz.auth.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能管理 service 实现类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/19 9:27
 */
@Service
public class FunctionServiceImpl implements FunctionService {

    @Autowired
    private FunctionDao functionDao;

    @Override
    public void addFunction(Function function) {

        functionDao.saveFun(function);

    }

    @Override
    public void updateUrl(Long id, String url) {

        functionDao.updateUrl(id,url);

    }

    @Override
    public List<Function> getFunctions(int page, int size, Long parentId) {

        int offset = (page - 1) * size;

        return functionDao.findFunctions(offset,size,parentId);
    }

    @Override
    public void deleteFunctionById(Long id) {
        functionDao.deleteFun(id);
    }

    @Override
    public List<Function> getAllFunction() {
        return functionDao.findAll();
    }
}
