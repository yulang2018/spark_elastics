package com.yulang.spark_elastic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yulang.spark_elastic.entity.User;
import com.yulang.spark_elastic.mapper.UserMapper;
import com.yulang.spark_elastic.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-03-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
