package com.zqh.pems.mapper;

import java.io.Serializable;
import java.util.List;

/**
 * 封装mapper增删改查
 * Created by zhongqihui on 2017/2/10.
 */
public interface BaseMapper<T, PK extends Serializable> {

    /**
     * 插入操作
     *
     * @param t 插入的对象
     */
    void insert(T t);

    /**
     * 删除操作
     *
     * @param id 根据主键来删除
     */
    void deleteById(PK id);

    /**
     * 修改操作
     *
     * @param t
     */
    void update(T t);

    /**
     * 根据PK查找对象
     *
     * @param pk
     * @return
     */
    T selectById(PK pk);

    /**
     * 模糊查询，根据字符串查询List
     *
     * @param t
     * @return
     */
    List<T> selectList(T t);

    /**
     * 分页查询
     *
     * @param start 从第几个开始
     * @param limit 查几个
     * @return List对象
     */
    List<T> selectByPage(Integer start, Integer limit);

}
