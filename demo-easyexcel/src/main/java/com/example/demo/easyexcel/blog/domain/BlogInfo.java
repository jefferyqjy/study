package com.example.demo.easyexcel.blog.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 *
 */
@TableName("tbl_article_info")
public class BlogInfo extends BaseRowModel {

    @TableId
    @ExcelProperty(value = "编号", index = 0)
    private Long id;

    @ExcelProperty(value = "标题", index = 0)
    private String title;

    @ExcelProperty(value = "类型", index = 0)
    private Integer type;

    @ExcelProperty(value = "分类编号", index = 0)
    private Long categoryId;

    @ExcelProperty(value = "状态", index = 0)
    private Integer isActive;

    @ExcelProperty(value = "点赞数", index = 0)
    private Integer star;

    @ExcelProperty(value = "创建人", index = 0)
    private String createdBy;

    @ExcelProperty(value = "创建时间", index = 0, format = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    @ExcelProperty(value = "修改时间", index = 0, format = "yyyy-MM-dd HH:mm:ss")
    private Date modifiedTime;

    @ExcelProperty(value = "发布时间", index = 0, format = "yyyy-MM-dd HH:mm:ss")
    private Date publishTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}
