package com.yuxiu.edu.mapper.base;

import com.yuxiu.edu.model.User;

/**
 * @author zhuyan
 * @date 2019/4/9 - 12:46
 */
public interface BaseMapper1<T> {
    public T findById(Integer id);
    public T findByUUID(String uuid);
    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);
    public void insert(T t);
    public void update(T t);
}
