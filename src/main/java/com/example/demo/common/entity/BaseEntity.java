package com.example.demo.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

//import org.apache.commons.lang3.StringUtils;
/**
 * 实体类基类
 * @author Luochen
 *
 */
@Data
public abstract class BaseEntity<T> implements Serializable {

    @TableId
    protected String id; //暂定规则
    @TableField(fill = FieldFill.INSERT)
    protected Timestamp createTime;
    @TableField(fill = FieldFill.INSERT)
    protected String creater;
    @TableField(fill = FieldFill.UPDATE)
    protected Timestamp updateTime;
    @TableField(fill = FieldFill.UPDATE)
    protected String updateBy;
    private String remark;		// 描述
    @TableField(exist=false)
    private int pageNum=1;
    @TableField(exist=false)
    private int pageSize = 10;
    @TableField(value="del_flag", fill = FieldFill.INSERT)
    @TableLogic
    private String delFlag;

    @JsonIgnore
    public IPage<T> getPage(){
        IPage<T> page=new Page<>();
        page.setCurrent(pageNum);
        page.setSize(pageSize);
        return page;
    }

    @JsonIgnore
    public int getPageNum() {
        return pageNum;
    }
    @JsonProperty
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    @JsonIgnore
    public int getPageSize() {
        return pageSize;
    }
    @JsonProperty
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
