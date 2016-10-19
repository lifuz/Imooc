package com.lifuz.auth.dao;

import com.lifuz.auth.entity.Function;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 功能dao类
 * <p>
 * dao层
 * <p>
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 10:48
 */
public interface FunctionDao {

    /**
     * 添加功能
     *
     * @param function 功能信息
     * @return 数据库操作结果
     */
    Integer saveFun(Function function);

    /**
     * 根据id获取功能详情
     *
     * @param id 功能id
     * @return 查询到的唯一实体
     */
    Function getFun(Long id);

    /**
     * 更新功能信息
     *
     * @param function 功能信息
     * @return 数据库操作结果
     */
    Integer updateFun(Function function);

    /**
     * 删除功能
     *
     * @param id 功能id
     * @return 数据库操作结果
     */
    Integer deleteFun(Long id);

    /**
     * 根据功能id更新其url信息
     *
     * @param id  功能id
     * @param url URL
     * @return 数据库操作结果
     */
    Integer updateUrl(@Param("id") Long id, @Param("url") String url);

    /**
     * 分页查询指定父节点的子节点
     *
     * @param offset   位置偏移量
     * @param rows     最大记录数
     * @param parentID 父节点id
     * @return 功能集合
     */
    List<Function> findFunctions(@Param("offset") int offset,
                                 @Param("rows") int rows, @Param("parentId") Long parentID);

    /**
     * 获取所有功能信息
     * @return 全部功能信息
     */
    List<Function> findAll();

}
