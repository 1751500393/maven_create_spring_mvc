package com.cen.test.entity;

import java.util.Date;
import lombok.Data;

@Data
public class UserPoint {
    /**
     * 得分表主键
     */
    private Integer pointsId;

    /**
     * 用户积分
     */
    private Integer points;

    /**
     * 用户id
     */
    private Integer uId;

    /**
     * 得分类型 0为注册得分 1为其他得分
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 是否被删除
     */
    private Integer isDelete;
}

