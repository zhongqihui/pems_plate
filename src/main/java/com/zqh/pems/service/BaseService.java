package com.zqh.pems.service;

import com.zqh.pems.mapper.BaseMapper;

import java.io.Serializable;
import java.util.List;

/**
* @author 钟启辉
* @company www.jiweitech.com
* @date 2017/8/31 14:43
* @description  service 层父接口
**/
public class BaseService<T , PK extends Serializable > {
    private BaseMapper<T,PK> baseMapper;

    public BaseService() {
    }

    public BaseService(BaseMapper<T, PK> baseMapper) {
        this.baseMapper = baseMapper;
    }

    /**
     * 插入操作
     * @param t 插入的对象
     */
    public void insert(T t) {
        baseMapper.insert(t);
    }

    /**
     * 根据主键删除
     * @param pk 主键
     */
    public void deleteById(PK pk) {
        baseMapper.deleteById(pk);
    }

    /**
     * 修改操作
     * @param t 对象
     */
    public void update(T t) {
        baseMapper.update(t);
    }

    /**
     * 根据主键查询操作
     * @param pk 主键
     * @return
     */
    public T selectById(PK pk) {
       return baseMapper.selectById(pk);
    }

    /**
     * 条件查询
     * @param t 封装条件的对象
     * @return
     */
    public List<T> selectList(T t) {
        return baseMapper.selectList(t);
    }

    /**
     * 分页查询
     * @param start 从start开始查
     * @param limit 条数
     * @return
     */
    public List<T> selectByPage(Integer start,Integer limit) {
        return baseMapper.selectByPage(start,limit);
    }
}
