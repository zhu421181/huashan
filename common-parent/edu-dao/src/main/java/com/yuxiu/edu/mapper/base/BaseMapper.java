package com.yuxiu.edu.mapper.base;

import com.yuxiu.edu.model.User;

public interface BaseMapper<T> {
    public T findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);

    public void update(T t);

    public void insert(T t);
}
