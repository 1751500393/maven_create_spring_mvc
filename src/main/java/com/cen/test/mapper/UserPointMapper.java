package com.cen.test.mapper;

import com.cen.test.entity.UserPoint;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserPointMapper {
    /**
     * 插入用户积分
     *
     * @return 受影响行数
     */
    Integer insertUserPoint(@Param("user_point") UserPoint userPoint);
}
