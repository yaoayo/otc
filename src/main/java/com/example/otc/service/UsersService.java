package com.example.otc.service;

import com.example.otc.repository.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
* @author apple
* @description 针对表【users(用户表)】的数据库操作Service
* @createDate 2024-04-01 09:56:13
*/
@Service
public interface UsersService extends IService<Users> {
    public Users findOne();
}
