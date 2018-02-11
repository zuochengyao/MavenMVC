package com.zcy.pojo;

public class UserQueryVo extends BaseValueObject
{
    private int id;
    private String username;
    private String password;
    private short gender;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password == null ? null : password.trim();
    }

    public short getGender()
    {
        return gender;
    }

    public void setGender(short gender)
    {
        this.gender = gender;
    }
}
