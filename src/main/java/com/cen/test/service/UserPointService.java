package com.cen.test.service;

import com.cen.test.entity.UserPoint;
import org.springframework.stereotype.Service;

@Service
public interface UserPointService {
    /**
     * 添加用户积分对象
     *
     * @param userPoint 用户分对象
     * @return 受影响行数
     */
    Integer addUserPoint(UserPoint userPoint);
}
