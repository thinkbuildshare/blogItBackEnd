package com.hymanting.blog.domain.article;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hymanting.blog.domain.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @Author hxchen
 * @Date 2021/6/20
 */
@Entity
public class Article extends BaseEntity {
    @NotEmpty(message = "文章标题不允许为空")
    private String title;

    @NotEmpty(message = "文章内容不允许为空")
    private String content;

    @NotEmpty(message = "文章话题不允许为空")
    private String topic;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    private Date publishTime;

    private Date updateTime;

    //状态，0：创建, 1:发布，2：撤回
    private Integer status;

    @NotEmpty(message = "作者不允许为空")
    private Integer authorId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
