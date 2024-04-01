package com.example.otc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.otc.repository.Users;
import com.example.otc.service.UsersService;
import com.example.otc.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author apple
* @description 针对表【users(用户表)】的数据库操作Service实现
* @createDate 2024-04-01 09:56:13
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{


    @Override
    public Users findOne() {
        return baseMapper.selectById(1);
    }
}




