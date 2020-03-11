package com.yulang.spark_elastic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yulang.spark_elastic.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-03-11
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
