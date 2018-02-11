package com.zcy.dao;

interface IBaseDao<T>
{
    int insert(T entity);

    int delete(int id);

    // int update(T entity);

    T get(int id);
}
