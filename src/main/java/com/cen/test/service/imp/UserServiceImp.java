package com.cen.test.service.imp;

import com.cen.test.annotation.AopAnnotation;
import com.cen.test.controller.UserController;
import com.cen.test.entity.User;
import com.cen.test.entity.UserPoint;
import com.cen.test.mapper.CateMapper;
import com.cen.test.mapper.UserMapper;
import com.cen.test.mapper.UserPointMapper;
import com.cen.test.service.UserService;
import com.cen.test.service.ex.UserExistException;
import com.cen.test.service.ex.UserFailToRegisterException;
import com.cen.test.service.ex.UserPointFailToAddException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserPointMapper userPointMapper;

    @Override
    public String getInfo() {
        return "测试xml注入";
    }

    public List<User> selectList() {
        return userMapper.selectList();
    }

    @Override
//    @Transactional
    public Integer register(User user) {
        User user1 = userMapper.selectUserByUsername(user.getUsername());
        if (user1 != null) {
            throw new UserExistException("用户已存在");
        } else {
            Integer rows = userMapper.insertUser(user);
            if (rows > 0) {
                UserPoint userPoint = new UserPoint();
                userPoint.setIsDelete(0);
                userPoint.setUId(user.getuId());
                userPoint.setPoints(20);
                rows = userPointMapper.insertUserPoint(userPoint);
                if (rows > 0) {
                    return rows;
                } else {
                    throw new UserPointFailToAddException("用户积分添加失败");
                }
            } else {
                throw new UserFailToRegisterException("注册失败，产生未知异常");
            }
        }

    }

    @Override
    public User checkUserIs(Integer uId) {
        return null;
    }
}
