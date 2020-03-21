package com.rudecrab.ssm.mapper;

import com.rudecrab.ssm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User类mapper接口，用来执行各种数据库操作
 * @author RC
 */
@Repository
public interface UserMapper {
    /**
     * 从数据库中查询出所有的User对象
     * @return User对象集合
     */
    List<User> selectAll();
}
