package com.example.otc.mapper;

import com.example.otc.repository.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author apple
* @description 针对表【users(用户表)】的数据库操作Mapper
* @createDate 2024-04-01 09:56:13
* @Entity com.example.otc.repository.Users
*/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}




