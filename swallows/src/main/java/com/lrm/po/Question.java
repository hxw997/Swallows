package com.lrm.po;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_question")
public class Question
{
    @Id
    @GeneratedValue
    private Long id;

    @Lob
    @NotBlank(message = "请输入内容")
    private String content;
    @Lob
    @NotBlank(message = "请输入概述")
    private String description;
    @NotBlank(message = "请输入标题")
    private String title;

    private Integer view;
    private Integer like;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;



}
