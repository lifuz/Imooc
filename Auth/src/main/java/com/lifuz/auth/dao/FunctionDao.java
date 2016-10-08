package com.lifuz.auth.dao;

import com.lifuz.auth.entity.Function;

/**
 *
 * 功能dao类
 *
 * dao层
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 10:48
 */
public interface FunctionDao {

    /**
     * 添加功能
     * @param function 功能信息
     * @return 数据库操作结果
     */
    Integer saveFun(Function function);

    /**
     * 根据id获取功能详情
     * @param id 功能id
     * @return 查询到的唯一实体
     */
    Function getFun(Long id);

    /**
     * 更新功能信息
     * @param function 功能信息
     * @return 数据库操作结果
     */
    Integer updateFun(Function function);

    /**
     * 删除功能
     * @param id 功能id
     * @return 数据库操作结果
     */
    Integer deleteFun(Long id);

}
