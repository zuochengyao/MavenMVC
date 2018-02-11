package com.zcy.pojo;

public class BaseValueObject
{
    // 当前页
    private int currentageIndex = 1;
    // 从第几条开始查
    private Integer start;
    // 每页显示多少条
    private Integer pageSize = 10;

    public int getCurrentageIndex()
    {
        return currentageIndex;
    }

    public void setCurrentageIndex(int currentageIndex)
    {
        this.currentageIndex = currentageIndex;
    }

    public Integer getStart()
    {
        return start;
    }

    public void setStart(Integer start)
    {
        this.start = start;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

}
