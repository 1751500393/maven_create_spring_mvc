package com.cen.test.service;

import com.cen.test.annotation.AopAnnotation;
import com.cen.test.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * @return 返回测试信息
     */
    String getInfo();

    /**
     * 查询用户集合
     *
     * @return 用户集合
     */

    List<User> selectList();

    /**
     * 用户注册
     *
     * @param user 用户对象
     * @return 受影响行数
     */
    Integer register(User user);

    /**
     * 查询用户(用于判断用户是否存在)
     *
     * @param uId
     * @return 用户对象
     */
    User checkUserIs(Integer uId);


}
