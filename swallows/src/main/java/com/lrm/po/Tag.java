package com.lrm.po;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_ag")
public class Tag
{
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "请输入分类名称")
    private String name;


}
