package com.lifuz.auth.service;

import com.lifuz.auth.entity.Function;

import java.util.List;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 16:32
 */
public interface FunctionService {

    /**
     * 增加功能
     * @param function 功能信息
     */
    void addFunction(Function function);

    /**
     * 根据功能id更新其url信息
     * @param id 功能id
     * @param url URL
     */
    void updateUrl(Long id ,String url);

    /**
     * 分页查询指定父节点的子节点
     * @param page 当前页码
     * @param size 每页记录数
     * @param parentId 父节点id
     * @return 功能集合
     */
    List<Function> getFunctions(int page,int size,Long parentId);

    /**
     * 根据id删除功能
     * @param id 功能id
     */
    void deleteFunctionById(Long id);

    /**
     * 查询全部功能信息
     * @return 全部功能信息
     */
    List<Function> getAllFunction();

}
