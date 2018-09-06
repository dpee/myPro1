package com.dpee.entity;

import java.util.Date;

public class Area {
    //id
    private Integer areaId;
    //名称
    private String areaName;
    //权重
    private Integer areaPriority;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getAreaPriority() {
        return areaPriority;
    }

    public void setAreaPriority(int areaPriority) {
        this.areaPriority = areaPriority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
