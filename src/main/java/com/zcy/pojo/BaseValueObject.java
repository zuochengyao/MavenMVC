package com.zcy.pojo;

public class BaseValueObject
{
    // ��ǰҳ
    private int currentageIndex = 1;
    // �ӵڼ�����ʼ��
    private Integer start;
    // ÿҳ��ʾ������
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
