package com.cen.test.mapper;

import com.cen.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {
    /**
     * 查询用户集合
     *
     * @return 用户集合
     */
    public List<User> selectList();
    /**
     * 用户注册
     *
     * @return 受影响行数
     */
    public Integer insertUser(@Param("user") User user);

    /**
     * 查询用户(用于判断用户是否存在)
     *
     * @param username
     * @return 用户对象
     */
    public User selectUserByUsername(@Param("username") String username);
}
