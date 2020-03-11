package com.yulang.spark_elastic.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yulang.spark_elastic.entity.User;
import com.yulang.spark_elastic.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-03-11
 */
@RestController
@RequestMapping("/user/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public Object list(){
        Wrapper<User> qyer = new QueryWrapper<>();
        return userMapper.selectList(qyer);
    }

}
