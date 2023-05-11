package com.cen.test.entity;

import lombok.Data;

@Data
public class Category {
    /**
     *类别id
     */
    private Integer cateId;

    /**
     *类别名字
     */
    private String name;

    /**
     *类别logo
     */
    private String logo;

    /**
     *类别索引
     */
    private Integer sort;

    /**
     *类别等级
     */
    private Integer level;

    /**
     *父类别id
     */
    private Integer parentId;
}

