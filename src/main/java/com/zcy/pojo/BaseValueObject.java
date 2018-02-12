package com.zcy.pojo;

public class BaseValueObject
{
    private int currentageIndex = 1;
    private Integer start;
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
